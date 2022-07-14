import { useState, useEffect, useCallback } from "react";
import { Modal } from "./Modal";
import { Coinrow } from "./Coinrow";
import { useExchangeState, useSummaryState } from "../contexts/CoinContext";

export default function Cointable() {
  const [isModal, setIsModal] = useState(false);
  const [coinInfo, setCoinInfo] = useState([]);
  const [coinTitle, setCoinTitle] = useState({});
  const summaryState = useSummaryState();
  const { code, name } = summaryState;
  //test용 코드
  const state = useExchangeState();
  const { data: markets } = state.market;
  const { data: realtimeData } = state.realtimeData;

  const sortedData = useCallback(() => {
    return (
      realtimeData &&
      realtimeData.sort((a, b) => b.acc_trade_price_24h - a.acc_trade_price_24h)
    );
  }, [realtimeData]);

  //-----------------------------
  //click할 때 데이터를 가져올 함수도 필요하다.!

  const getCoinInfo = async (coin) => {
    const response = await fetch(
      `https://crix-api-cdn.upbit.com/v1/crix/trades/days?code=CRIX.UPBIT.${coin.code}&count=100`
    );
    const json = await response.json();
    setCoinInfo(json);
  };

  const changeLiteral = useCallback((change) => {
    // 가격변동 +, - 함수
    if (change === "RISE") {
      return "+";
    } else if (change === "FALL") {
      return "-";
    }
    return "";
  }, []);

  const showModal = () => setIsModal(true);
  const handleOnClose = () => setIsModal(false);
  return (
    <div className="table m-10">
      <table className="table-fixed text-white w-full text-center">
        <thead className="text-3xl pb-3 m-10">
          <tr className="border-separate border-bottom border-slate-400">
            <th>종목</th>
            <th>가격(KRW)</th>
            <th>고가</th>
            <th>저가</th>
            <th>거래량(24H)</th>
            <th>변동(24H)</th>
          </tr>
        </thead>
        <tbody className="text-2xl">
          {sortedData() &&
            sortedData().map((coin) => (
              // <tr
              //   className="hover:bg-indigo-900"
              //   key={coin.code}
              //   onClick={() => {
              //     showModal();
              //     getCoinInfo(coin);
              //   }}
              // >
              //   <td>
              //     {
              //       markets.filter((list) => list.market === coin.code)[0]
              //         .korean_name
              //     }
              //   </td>
              //   <td>{Math.round(coin.trade_price.toFixed(1))} KRW</td>
              //   <td className="text-red-500">{coin.high_price} KRW</td>
              //   <td className="text-blue-500">{coin.low_price} KRW</td>
              //   <td>{coin.acc_trade_volume_24h.toFixed(2)}</td>
              //   <td
              //     className={
              //       coin.change === "FALL" ? "text-blue-500" : "text-red-500"
              //     }
              //   >
              //     {changeLiteral(coin.change)}
              //     {(coin.change_rate * 100).toFixed(2)}%
              //   </td>
              // </tr>
              <Coinrow
                coin={coin}
                name={
                  markets.filter((list) => list.market === coin.code)[0]
                    .korean_name
                }
                key={coin.code}
                showModal={showModal}
                getCoinInfo={getCoinInfo}
                changeLiteral={changeLiteral}
              />
            ))}
        </tbody>
      </table>

      <Modal
        onClose={handleOnClose}
        visible={isModal}
        datas={coinInfo}
        title={coinTitle}
        change={changeLiteral}
        code={code}
        name={name}
      />
    </div>
  );
}
