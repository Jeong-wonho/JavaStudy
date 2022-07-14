import CoinSimulator from "./components/CoinSimulator";
import { ExchangeProvider, SummaryProvider } from "./contexts/CoinContext";
function App() {
  return (
    <ExchangeProvider>
      <SummaryProvider>
        <CoinSimulator />
      </SummaryProvider>
    </ExchangeProvider>
  );
}

export default App;
