import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="container mx-auto px-4 ">
        <div className="coin-title text-center text-6xl text-white p-20 border-solid border-b-white border-2 rounded-md border-solid border m-10">
            Coin Title
        </div>
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
                </tr>
                </thead>
                <tbody className="text-2xl">
                <tr>
                    <td className="p-5">1</td>
                    <td>Bitcoin</td>
                    <td>BTC</td>
                    <td>28292784.2</td>
                    <td>88952950.5</td>
                    <td>55770995753435</td>
                    <td>124.14</td>
                </tr>
                <tr>
                    <td className="p-5">1</td>
                    <td>Bitcoin</td>
                    <td>BTC</td>
                    <td>28292784.2</td>
                    <td>88952950.5</td>
                    <td>55770995753435</td>
                    <td>124.14</td>
                </tr>
                <tr>
                    <td className="p-5">1</td>
                    <td>Bitcoin</td>
                    <td>BTC</td>
                    <td>28292784.2</td>
                    <td>88952950.5</td>
                    <td>55770995753435</td>
                    <td>124.14</td>
                </tr>
                </tbody>
            </table>
        </div>

    </div>
  );
}

export default App;
