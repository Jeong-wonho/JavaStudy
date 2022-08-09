import { CountProvider } from "./Contexts/Count/index";

import { CountLabel } from "./components/CountLabel/index";
import { PlusButton } from "./components/PlusButton/index";

function App() {
  return (
    <CountProvider>
        <CountLabel />
        <PlusButton />
    </CountProvider>
  );
}

export default App;
