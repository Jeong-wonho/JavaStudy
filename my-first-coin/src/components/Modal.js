import React, { useCallback } from "react";
import Mychart from "./Mychart";
import { useSummaryDispatch, useExchangeState, useSummaryState } from "../contexts/CoinContext";

export const Modal = ({
  visible,
  onClose,
  datas,
  changeLiteral,
}) => {
  const handleOnClose = (e) => {
    if (e.target.id === "modalmain") {
      onClose();
    }
  };
  //state선언
  const state = useSummaryState();
  const {code, name} = state;

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
  const fixPrice = useCallback(price => {
    return parseInt(price.toFixed(0)).toLocaleString();
  })
  // console.log(data);
  if (!visible) return null;

  return (
    <div
      id="modalmain"
      onClick={handleOnClose}
      className="fixed inset-0  bg-black bg-opacity-30 backdrop-blur-sm flex justify-center items-center drop-shadow-xl"
    >
      <div className="bg-white p-2 rounded w-2/4">

          <h1 className= "bg-no-repeat pb-5 bg-left-top text-4xl pl-20 pt-3 border-blue-900 border-b-2" style={{backgroundImage:`url(https://static.upbit.com/logos/${data.code.split("-")[1]}.png`}} alt="">{name}
            <span className="ml-0.8">{code}</span>
          </h1>


        <div className={`text-5xl p-5 border-b-2 block items-center border-blue-900 pb-4 pl-10 flex justify-between` }>
          <div>
          <h4 className = {`${data.change === "FALL" ? "text-blue-600" : "text-red-400"}`}>{data.trade_price.toLocaleString()}<span>{data.code.split('-')[0]}</span></h4>

          <div className={`text-2xl ${data.change === "FALL" ? "text-blue-600" : "text-red-400"}`}>
            <p className={"text-2xl"}>전일대비: {'  '}
              <span className = "px-3">
                {changeLiteral(data.change)}
                {(data.change_rate*100).toFixed(2)}%
              </span>
              <span>
                {changeLiteral(data.change)}
                {data.change_price.toLocaleString()}
                {code.split("-")[0]}
              </span>

            </p>
          </div>
          </div>
          <div className={"flow-root"}>
            <div className = {"text-2xl"}>
            <p>고가:<span className ="p-2">{fixPrice(data.high_price)}</span>
            </p>
            <p>저가:<span className ="p-2">{fixPrice(data.low_price)}</span></p>
            </div>
            <div className = {"text-2xl"}>
              <p>거래량:<span className ="p-2">
                    {fixPrice(data.acc_trade_volume_24h)}
                <em>{code.split('-')[1]}</em>
                  </span>
              </p>
              <p>거래대금(24H):<span className ="p-2">
                    {fixPrice(data.acc_trade_price_24h)}
                <em>{code.split('-')[0]}</em>
                  </span></p>
            </div>
          </div>

        </div>
        <div className="text-4xl text-blue-900 border-b-2 border-blue-900 p-4">
          차트
        </div>
        <Mychart coinData={datas} />
      </div>
    </div>
  );
};
