import React from "react";

export const Coinrow = ({
  coin,
  name,
  changeLiteral,
  showModal,
  getCoinInfo,
}) => {
  return (
    <tr
      className="hover:bg-indigo-900"
      key={coin.code}
      onClick={() => {
        showModal();
        getCoinInfo(coin);
      }}
    >
      <td>{name}</td>
      <td>{Math.round(coin.trade_price.toFixed(1))} KRW</td>
      <td className="text-red-500">{coin.high_price} KRW</td>
      <td className="text-blue-500">{coin.low_price} KRW</td>
      <td>{coin.acc_trade_volume_24h.toFixed(2)}</td>
      <td className={coin.change === "FALL" ? "text-blue-500" : "text-red-500"}>
        {changeLiteral(coin.change)}
        {(coin.change_rate * 100).toFixed(2)}%
      </td>
    </tr>
  );
};
