import React, { useState } from "react";
import "chart.js/auto";
import { Chart } from "react-chartjs-2";

const Mychart = ({ coinData }) => {
  const chartDatas = [];
  const chartColors = [];
  coinData.forEach((coin) => {
    let color =
      coin.change === "RISE" ? "rgb(255, 99, 132)" : "rgb(54, 162, 235)";
    chartColors.push(color);
    //chartData만들기
    chartDatas.push({ x: coin.tradeDate, y: coin.tradePrice });
  });

  const data = {
    datasets: [
      {
        type: "line",
        label: "LineGraph",
        borderColor: "#32393e",
        borderWidth: 3,
        data: chartDatas.reverse(),
        yAxisID: "가격",
      },
      {
        type: "bar",
        label: "BarGraph",
        backgroundColor: chartColors,
        data: chartDatas.reverse(),
        yAxisID: "가격",
      },
    ],
  };

  const options = {
    spanGaps: true,
    maxBarThickness: 100,
    grouped: true,
    interaction: {
      mode: "index",
    },
    plugins: {
      legend: {
        labels: {
          usePointStyle: true,
          padding: 10,
          font: {
            family: "'Noto Sans KR', 'serif'",
            lineHeight: 1,
          },
        },
      },
      tooltip: {
        backgroundColor: "rgba(124, 35, 35, 0.4)",
        padding: 10,
        bodySpacing: 5,
        bodyFont: {
          font: {
            family: "'Noto Sans KR', sans-serif",
          },
        },
        usePointStyle: true,
        filter: (item) => item.parsed.y !== null,
        callbacks: {
          title: (context) => context[0].label + "💙",
          label: (context) => {
            let label = context.dataset.label + "" || "";

            return context.parsed.y !== null
              ? label + ": " + context.parsed.y + "배"
              : null;
          },
        },
      },
    },
    scales: {
      x: {
        afterTickToLabelConversion: function (scaleInstance) {
          const ticks = scaleInstance.ticks;

          const newTicks = ticks.map((tick) => {
            return {
              ...tick,

            };
          });

          scaleInstance.ticks = newTicks;
        },
        grid: {
          display: false,
          drawTicks: true,
          tickLength: 4,
          color: "#E2E2E230",
        },
        axis: "x",
        position: "bottom",
        ticks: {
          minRotation: 45,
          padding: 5,
        },
      },
      y: {
        type: "linear",
        grid: {
          color: "#E2E2E230",
        },
        afterDataLimits: (scale) => {
          scale.max = scale.max * 1.2;
        },
        axis: "y",
        display: true,
        position: "left",
        title: {
          display: true,
          align: "end",
          color: "#808080",
          font: {
            size: 12,
            family: "'Noto Sans KR', sans-serif",
            weight: 300,
          },
          text: "단위: KRW",
        },
      },
      y_sub: {
        position: "right",
        title: {
          display: true,
          align: "end",
          color: "#808080",
          font: {
            size: 12,
            family: "'Noto Sans KR', sans-serif",
            weight: 300,
          },
          text: "단위: KRW",
        },
        afterDataLimits: (scale) => {
          scale.max = scale.max * 1.2;
        },
      },
    },
  };

  return (
    <div className="w-full p-10">
      <Chart type="line" data={data} options = {options} />
    </div>
  );
};

export default Mychart;
