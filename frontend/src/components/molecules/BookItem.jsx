import { useEffect, useState } from "react";
import BookToggleIcon from "../../assets/icons/BookToggleIcon";
import BookItemHeading from "../atoms/BookItemHeading";
import BookItemSubHeading from "../atoms/BookItemSubHeading";
import Customer from "../atoms/Customer";
import styles from "./BookItem.module.scss";

const BookItem = ({ book, index, activeItem, setActiveItem }) => {
  const [toggle, setToggle] = useState(false);
  useEffect(() => {
    if (activeItem != index) {
      setToggle(false);
    }
  }, [activeItem]);

  const handleClick = () => {
    if (toggle) {
      setActiveItem(null);
      setToggle(false);
    } else {
      if (book.borrower.length == 0) {
        alert("No results found");
      } else {
        setActiveItem(index);
        setToggle(true);
      }
    }
  };

  return (
    book && (
      <div className={`${styles["book__item"]}`} id={`book-item-${index}`}>
        <div className={styles["book__details"]}>
          <div className={styles["book__id"]}>
            <BookItemHeading text={index} />
          </div>
          {book.name && (
            <div className={styles["book__name"]}>
              <BookItemHeading text={book.name} />
            </div>
          )}
          <div className={styles["book-toggle"]} onClick={handleClick}>
            <BookToggleIcon />
          </div>
          {book.author && (
            <div className={styles["book__author"]}>
              <BookItemSubHeading text={"by " + book.author} />
            </div>
          )}
        </div>
        {toggle &&
          book.borrower &&
          book.borrower.map((borrower, index) => (
            <Customer key={index} className={"customer"} borrower={borrower} />
          ))}
      </div>
    )
  );
};

export default BookItem;
