import logo from "./logo.svg";
import "./App.scss";
import BookItemHeading from "./components/atoms/BookItemHeading";
import BookItemSubHeading from "./components/atoms/BookItemSubHeading";
import CountryBtnCopy from "./components/atoms/ActionBtnCopy";
import CustomerCopy from "./components/atoms/CustomerCopy";
import BookItem from "./components/molecules/BookItem";
import ActionBtn from "./components/atoms/ActionBtn";
import Customer from "./components/atoms/Customer";
import BookList from "./components/organisms/BookList";
import { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [countryCode, setCountryCode] = useState("SG");
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

  const handleClick = () => {
    console.log("hai");
    getRandomCountry();
    //getTop3ReadBook();
  };

  useEffect(() => {
    getTop3ReadBook();
  }, [countryCode]);

  const getRandomCountry = async () => {
    const res = await axios
      .get("http://localhost:8080" + "/getRandomCountry")
      .catch((err) => {
        console.log(err.response.data.message);
        // if (err.response.status === 400) {
        //   alert(err);
        // } else {
        //   alert("Please try again later");
        //   console.log("error: ", err);
        // }
      });
    if (res && res.status === 200) {
      setCountryCode(res.data);
      console.log(res.data);
    }
  };

  const getTop3ReadBook = async () => {
    const res = await axios
      .get("http://localhost:8080" + "/getTop3ReadBook", {
        params: { country_code: countryCode },
      })
      .catch((err) => {
        if (err.response.status === 400) {
          alert(err);
        } else {
          alert("Please try again later");
          console.log("error: ", err);
        }
      });
    if (res && res.status === 200) {
      setData(res.data);
      console.log(data);
    }
  };

  return (
    <div className="App">
      <ActionBtn countryCode={countryCode} onClick={handleClick} />
      <BookList data={data} />
    </div>
  );
}

export default App;
