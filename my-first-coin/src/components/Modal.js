import React, { useCallback } from "react";
import Mychart from "./Mychart";
import { useSummaryDispatch, useExchangeState } from "../contexts/CoinContext";

export const Modal = ({
  visible,
  onClose,
  code,
  name,
  datas,
  changeLiteral,
}) => {
  const handleOnClose = (e) => {
    if (e.target.id === "modalmain") {
      onClose();
    }
  };

  //code 부분 컴포넌트 화 시킬까? 고민해보자

  const dispatch = useSummaryDispatch();
  const exchangeState = useExchangeState();
  const { market } = exchangeState;
  const { data: realtimeData } = exchangeState.realtimeData;

  const getData = useCallback(() => {
    //선택된 데이터 추출
    if (code) {
      return realtimeData.filter((list) => list.code === code)[0];
    } else {
      return (
        market &&
        realtimeData &&
        dispatch({
          type: "SELECT_COIN",
          code: market.data[0].market,
          name: market.data[0].korean_name,
        })
      );
    }
  }, [code, dispatch, market, realtimeData]);

  const data = getData();

  if (!visible) return null;

  return (
    <div
      id="modalmain"
      onClick={handleOnClose}
      className="fixed inset-0  bg-black bg-opacity-30 backdrop-blur-sm flex justify-center items-center"
    >
      <div className="bg-white p-2 rounded w-2/4">
        <h1
          className="text-5xl text-blue-900 border-b-2 border-blue-900 pb-2"
          style={{
            backgroundImage: `url(https://static.upbit.com/logos/${
              data.code.split("-")[1]
            }.png)`,
          }}
        >
          {name}
          <span>{data.code}</span>
        </h1>

        <div className="text-4xl text-blue-900 border-b-2 border-blue-900 pb-4">
          가격 정보
          <div className="text-3xl">종가 2000000</div>
        </div>
        <div className="text-4xl text-blue-900 border-b-2 border-blue-900 p-4">
          차트
        </div>
        <Mychart coinData={datas} />
      </div>
    </div>
  );
};
