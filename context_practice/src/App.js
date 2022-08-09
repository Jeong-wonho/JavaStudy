import { ThemeProvider } from "./Context/ThemeContext";
import { ThemedButton } from "./Components/ThemedButton";
import { Toolbar } from "./Components/Toolbar";

function App() {
  return (
    <div>
      <ThemeProvider>
        <ThemedButton />
      </ThemeProvider>
    </div>
  );
}

export default App;
