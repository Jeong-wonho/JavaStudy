import React, { useContext } from "react";
import { CountContext } from "../../Contexts/Count";

export const PlusButton = () => {
  const { plusCount } = useContext(CountContext);
  return <button onClick={plusCount}>+1</button>;
};
