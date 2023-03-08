import logo from "./logo.svg";
import "./App.css";
import BookItemHeading from "./components/atoms/BookItemHeading";
import BookItemSubHeading from "./components/atoms/BookItemSubHeading";
import CountryBtnCopy from "./components/atoms/CountryBtnCopy";
import CustomerCopy from "./components/atoms/CustomerCopy";
import BookItem from "./components/molecules/BookItem";

function App() {
  return (
    <div className="App">
      <BookItem name={"Coraline"} author={"Neil Gaiman"} id={1} />
      <BookItem
        name={"Guards! Guards! Guards!"}
        author={"Terry Pratchet"}
        id={1}
      />

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
