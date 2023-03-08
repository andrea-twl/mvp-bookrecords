import logo from "./logo.svg";
import "./App.scss";
import BookItemHeading from "./components/atoms/BookItemHeading";
import BookItemSubHeading from "./components/atoms/BookItemSubHeading";
import CountryBtnCopy from "./components/atoms/ActionBtnCopy";
import CustomerCopy from "./components/atoms/CustomerCopy";
import BookItem from "./components/molecules/BookItem";
import CountryBtn from "./components/molecules/ActionBtn";
import Customer from "./components/atoms/Customer";
import BookList from "./components/organisms/BookList";
import { useState } from "react";

function App() {
  const [data, setData] = useState([
    {
      name: "Mort",
      author: "Terry Pratchet",
      customers: ["Andrea Tan", "Keane Tan", "Matthew Tham"],
    },
    {
      name: "Guards! Guards!",
      author: "Terry Pratchet",
      customers: ["Andrea Tan", "Keane Tan", "Matthew Tham"],
    },
  ]);
  return (
    <div className="App">
      <CountryBtn countryCode={"SG"} />

      <BookList data={data} />
    </div>
  );
}

export default App;
