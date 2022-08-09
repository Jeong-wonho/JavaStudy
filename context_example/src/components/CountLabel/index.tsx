import React, { useContext } from "react";
import { CountContext } from "../../Contexts/Count";

export const CountLabel = () => {
  const { count } = useContext(CountContext);
  return <div>{count}</div>;
};
