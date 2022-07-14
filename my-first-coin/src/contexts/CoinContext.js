import React, { createContext, useReducer, useContext } from "react";
import axios from "axios";

const initialState = {
  market: {
    isLoad: false,
    data: null,
    error: null,
  },
  realtimeData: {
    isLoad: false,
    data: null,
    error: null,
  },
};

//로딩중 상태
const loadingState = {
  isLoad: true,
  data: null,
  error: null,
};

const success = (data) => ({
  isLoad: false,
  data,
  error: null,
});

const error = (error) => ({
  isLoad: false,
  data: null,
  error: error,
});

//실시간 정보 저장! 중요
const saveRealtimeData = (realtimeData, data) => ({
  isLoad: false,
  data: (function () {
    console.log("realtimeData", realtimeData);
    if (realtimeData.data) {
      if (!realtimeData.data.map((list) => list.code).includes(data.code)) {
        return realtimeData.data.concat(data);
      } else {
        return realtimeData.data
          .filter((list) => list.code !== data.code)
          .concat(data);
      }
    } else {
      const tempArr = [];
      realtimeData.data = tempArr.concat(data);
      return realtimeData.data;
    }
  })(),
  error: null,
});

//리듀서
function ExchangeReducer(state, action) {
  switch (action.type) {
    case "GET_MARKET":
      return {
        ...state,
        market: loadingState,
      };
    case "GET_MARKET_SUCCESS":
      return {
        ...state,
        market: success(action.data),
      };
    case "GET_MARKET_ERROR":
      return {
        ...state,
        market: error(action.error),
      };
    case "GET_REALTIME_DATA":
      return {
        ...state,
        realtimeData: loadingState,
      };
    case "GET_REALTIME_DATA_SUCCESS":
      return {
        ...state,
        realtimeData: saveRealtimeData(state.realtimeData, action.data),
      };
    case "GET_REALTIME_DATA_ERROR":
      return {
        ...state,
        realtimeData: error(action.error),
      };
    default:
      throw new Error(`Unhandled action type ${action.type}`);
  }
}

//컨텍스트 분리
const ExchangeStateContext = createContext(null);
const ExchangeDispatchContext = createContext(null);

// 위에서 선언한 두가지 컨텍스트를 Provider로 감싸주기
export function ExchangeProvider({ children }) {
  const [state, dispatch] = useReducer(ExchangeReducer, initialState);
  return (
    <ExchangeStateContext.Provider value={state}>
      <ExchangeDispatchContext.Provider value={dispatch}>
        {children}
      </ExchangeDispatchContext.Provider>
    </ExchangeStateContext.Provider>
  );
}

//Hook: 조회를 쉽게
export function useExchangeState() {
  const state = useContext(ExchangeStateContext);
  if (!state) {
    throw new Error("Cannot find Stock Provider");
  }
  return state;
}

export function useExchangeDispatch() {
  const dispatch = useContext(ExchangeDispatchContext);
  if (!dispatch) {
    throw new Error("Cannot find stock Provider");
  }
  return dispatch;
}

//실시간 시세 조회 함수
export async function getMarket(dispatch) {
  dispatch({
    //마켓 가져오기 시작
    type: "GET_MARKET",
  });

  try {
    //마켓 가져오기 중
    const response = await axios.get("https://api.upbit.com/v1/market/all");
    dispatch({
      type: "GET_MARKET",
      data: response.data,
    });

    //마켓 리스트를 추출해서 웹소켓 실행하기
    const marketList = response.data
      .filter((list) => list.market.includes("KRW-"))
      .map((list) => list.market);
    const ws = new WebSocket("wss://api.upbit.com/websocket/v1");
    ws.onopen = () => {
      //웹소켓 연결
      dispatch({
        type: "GET_REALTIME_DATA",
      });
      ws.send(
        `[{"ticket":"test"}, {"type":"ticker", "codes":${JSON.stringify(
          marketList
        )}}]`
      );
    };
    ws.onmessage = async (e) => {
      //실시간 데이터 수신
      const { data } = e;
      const text = await new Response(data).text();
      //console.log(JSON.parse(text));
      dispatch({
        type: "GET_REALTIME_DATA_SUCCESS",
        data: JSON.parse(text),
      });
    };
    ws.onerror = (e) => {
      dispatch({
        type: "GET_REALTIME_DATA_ERROR",
        error: e,
      });
    };
  } catch (e) {
    dispatch({
      type: "GET_MARKET_ERROR",
      error: e,
    });
  }
}

//요약정보
const summaryState = {
  code: null,
  name: null,
};

function summaryReducer(state, action) {
  switch (action.type) {
    case "SELECT_COIN":
      return {
        code: action.code,
        name: action.name,
      };
    default:
      throw new Error(`unhandled action type ${action.type}`);
  }
}

// 선택 된 코인 컨텍스트
const summaryStateContext = createContext(null);
const summaryDispatchContext = createContext(null);
export function SummaryProvider({ children }) {
  const [state, dispatch] = useReducer(summaryReducer, summaryState);
  return (
    <summaryStateContext.Provider value={state}>
      <summaryDispatchContext.Provider value={dispatch}>
        {children}
      </summaryDispatchContext.Provider>
    </summaryStateContext.Provider>
  );
}

export function useSummaryState() {
  const state = useContext(summaryStateContext);
  if (!state) {
    throw new Error("Cannot find Summary Provider");
  }
  return state;
}

export function useSummaryDispatch() {
  const dispatch = useContext(summaryDispatchContext);
  if (!dispatch) {
    throw new Error("Cannot find Summary Provider");
  }
  return dispatch;
}
