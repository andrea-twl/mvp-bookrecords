import logo from "./logo.svg";
import "./App.css";
import BookItemHeading from "./components/atoms/BookItemHeading";

function App() {
  return (
    <div className="App">
      <BookItemHeading />
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
