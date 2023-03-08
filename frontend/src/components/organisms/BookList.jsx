import { useState } from "react";
import BookToggleIcon from "../../assets/icons/BookToggleIcon";
import ActionBtnCopy from "../atoms/ActionBtnCopy";
import BookItemHeading from "../atoms/BookItemHeading";
import BookItemSubHeading from "../atoms/BookItemSubHeading";
import BookItem from "../molecules/BookItem";
import styles from "./BookList.module.scss";

const BookList = ({ data }) => {
  const [activeItem, setActiveItem] = useState(null);
  return (
    <>
      {data ? (
        <div className={`${styles["book__list"]}`} id={"container"}>
          {data.map((book, id) => (
            <BookItem
              book={book}
              id={id + 1}
              activeItem={activeItem}
              setActiveItem={setActiveItem}
            />
          ))}
        </div>
      ) : (
        <div id="error-message" data-value={"No data found"}>
          <ActionBtnCopy text="No data found" />
        </div>
      )}
    </>
  );
};

export default BookList;
