import React, { useEffect } from "react";
import { getMarket, useExchangeDispatch } from "../contexts/CoinContext";
import Cointable from "./Cointable";
import Cointitle from "./Cointitle";

function CoinSimulator() {
  const dispatch = useExchangeDispatch();

  //처음 거래소 오픈시 유저정보 등록
  useEffect(() => {
    getMarket(dispatch);
  }, [dispatch]);

  return (
    <div className="container mx-auto px-10">
      <Cointitle />
      <Cointable />
    </div>
  );
}
export default CoinSimulator;
