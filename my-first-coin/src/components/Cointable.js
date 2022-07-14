import { useState, useEffect, useCallback } from "react";
import { Modal } from "./Modal";
import { useExchangeState } from "../contexts/CoinContext";

export default function Cointable() {
  //   const [loading, setLoading] = useState(true);
  const [coins, setCoins] = useState([]);
  const [isModal, setIsModal] = useState(false);
  const [coinInfo, setCoinInfo] = useState([]);
  const [coinInf, setCoinInf] = useState({});

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

  // console.log(markets, realtimeData);
  console.log(sortedData());
  //-----------------------------
  //click할 때 데이터를 가져올 함수도 필요하다.!
  const getCoins = async () => {
    const json = await (
      await fetch(`https://api.coinpaprika.com/v1/tickers?quotes=KRW`)
    ).json();

    setCoins(json.slice(0, 100));
    // setLoading(false);
  };

  const getCoinInfo = async (coin) => {
    const response = await fetch(
      `https://crix-api-cdn.upbit.com/v1/crix/trades/days?code=CRIX.UPBIT.KRW-BTC&count=100`
    );
    const json = await response.json();
    setCoinInfo(json);
  };
  useEffect(() => {
    getCoins();
  }, []);

  const showModal = () => {
    setIsModal(true);
  };

  const saveCoinTitle = (coin) => setCoinInf(coin);
  const handleOnClose = () => setIsModal(false);
  return (
    <div className="table m-10">
      <table className="table-fixed text-white w-full text-center">
        <thead className="text-3xl pb-3 m-10">
          <tr className="border-separate border-bottom border-slate-400">
            <th className="p-5">순위</th>
            <th>종목</th>
            <th>기호</th>
            <th>가격(KRW)</th>
            <th>총 시가</th>
            <th>거래량(24H)</th>
            <th>변동(24H)</th>
            <th>변동(7D)</th>
          </tr>
        </thead>
        <tbody className="text-2xl">
          {coins.map((coin, idx) => (
            <tr
              className="hover:bg-indigo-900"
              key={idx}
              onClick={() => {
                showModal();
                getCoinInfo();
                saveCoinTitle(coin);
              }}
            >
              <td className="p-5">{coin.rank}</td>
              <td>{coin.name}</td>
              <td>{coin.symbol}</td>
              <td>{Math.round(coin.quotes.KRW.price.toFixed(1))} KRW</td>
              <td>
                {(coin.quotes.KRW.market_cap / 1000000000000).toFixed(2)}T
              </td>
              <td>
                {(coin.quotes.KRW.volume_24h / 1000000000000).toFixed(2)}T
              </td>
              <td
                className={
                  coin.quotes.KRW.percent_change_24h > 0
                    ? "text-red-500"
                    : "text-blue-500"
                }
              >
                {coin.quotes.KRW.percent_change_24h.toFixed(2)} %
              </td>
              <td
                className={
                  coin.quotes.KRW.percent_change_7d > 0
                    ? "text-red-500"
                    : "text-blue-500"
                }
              >
                {coin.quotes.KRW.percent_change_7d.toFixed(2)}%
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      <Modal
        onClose={handleOnClose}
        visible={isModal}
        data={coinInfo}
        title={coinInf}
      />
    </div>
  );
}
