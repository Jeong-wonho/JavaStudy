import Hello from "./components/Hello"
import Wrapper from "./components/Wrapper";

function App() {
  return (
      <Wrapper>
        <Hello name="react" color="red" isSpecial/>
          <Hello color="pink"/>
      </Wrapper>

  );
}

export default App;
