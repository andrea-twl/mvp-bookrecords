import "./App.scss";
import ActionBtn from "./components/atoms/ActionBtn";
import BookList from "./components/organisms/BookList";
import { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [countryCode, setCountryCode] = useState("SG");
  const [data, setData] = useState();

  const handleClick = () => {
    getRandomCountry();
  };

  useEffect(() => {
    getTop3ReadBook();
  }, [countryCode]);

  const getRandomCountry = async () => {
    const res = await axios
      .get("http://localhost:8080" + "/getRandomCountry")
      .catch((err) => {
        alert(err.response.data.message);
        // console.log(err);
      });
    if (res && res.status === 200) {
      setCountryCode(res.data.country.country_code);
      // console.log(res.data);
    }
  };

  const getTop3ReadBook = async () => {
    const res = await axios
      .get("http://localhost:8080" + "/getTop3ReadBook", {
        params: { country_code: countryCode },
      })
      .catch((err) => {
        alert(err.response.data.message);
        // console.log(err);
      });
    if (res && res.status === 200) {
      setData(res.data);
      // console.log(data);
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
