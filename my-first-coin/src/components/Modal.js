import React from "react";
import Mychart from "./Mychart";
export const Modal = ({ visible, onClose, data }) => {
  const handleOnClose = (e) => {
    if (e.target.id === "modalmain") {
      onClose();
    }
  };

  if (!visible) return null;

  return (
    <div
      id="modalmain"
      onClick={handleOnClose}
      className="fixed inset-0  bg-black bg-opacity-30 backdrop-blur-sm flex justify-center items-center"
    >
      <div className="bg-white p-2 rounded w-3/4">
        <h1 className="text-5xl text-blue-900 border-b-2 border-blue-900 pb-2">
          {data.name}
        </h1>
        <div className="text-4xl text-blue-900 border-b-2 border-blue-900 p-4">
          차트
        </div>
        <Mychart coinData={data} />
      </div>
    </div>
  );
};
