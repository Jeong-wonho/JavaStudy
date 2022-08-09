import React from "react";
import { ThemedButton } from "./ThemedButton";
export const Toolbar = (props) => {
  return <ThemedButton onClick={props.changeTheme}>Change Theme</ThemedButton>;
};
