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
                <tr className="leading-12">
                    <th>Song</th>
                    <th>Artist</th>
                    <th>Year</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>The Sliding Mr. Bones (Next Stop, Pottersville)</td>
                    <td>Malcolm Lockyer</td>
                    <td>1961</td>
                </tr>
                <tr>
                    <td>Witchy Woman</td>
                    <td>The Eagles</td>
                    <td>1972</td>
                </tr>
                <tr>
                    <td>Shining Star</td>
                    <td>Earth, Wind, and Fire</td>
                    <td>1975</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
  );
}

export default App;
