import logo from "./logo.svg";
import "./App.css";
import BookItemHeading from "./components/atoms/BookItemHeading";
import BookItemSubHeading from "./components/atoms/BookItemSubHeading";
import CountryBtnCopy from "./components/atoms/CountryBtnCopy";
import CustomerCopy from "./components/atoms/CustomerCopy";

function App() {
  return (
    <div className="App">
      <BookItemHeading text={"hey"} />
      <BookItemSubHeading text={"hi"} />
      <CountryBtnCopy text={"hello"} />
      <CustomerCopy text={"ho"} />
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
