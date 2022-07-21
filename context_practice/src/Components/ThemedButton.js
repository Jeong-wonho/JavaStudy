import { ThemeContext } from "../Context/ThemeContext";

import React, { useContext } from "react";

export const ThemedButton = () => {
  const theme = useContext(ThemeContext);
  return <div>ThemedButton</div>;
};
