import { useState } from "react";
import BookToggleIcon from "../../assets/icons/BookToggleIcon";
import BookItemHeading from "../atoms/BookItemHeading";
import BookItemSubHeading from "../atoms/BookItemSubHeading";
import Customer from "../atoms/Customer";
import styles from "./BookItem.module.scss";

const BookItem = ({ book, id }) => {
  const [toggle, setToggle] = useState(false);
  return (
    book && (
      <div className={`${styles["book__item"]}`} id={`book-item-${id}`}>
        <div className={styles["book__details"]}>
          <div className={styles["book__id"]}>
            <BookItemHeading text={id} />
          </div>
          <div className={styles["book__name"]}>
            <BookItemHeading text={book.name} />
          </div>
          <div
            className={styles["book-toggle"]}
            onClick={() => setToggle(!toggle)}
          >
            <BookToggleIcon />
          </div>
          <div className={styles["book__author"]}>
            <BookItemSubHeading text={"by " + book.author} />
          </div>
        </div>
        {toggle &&
          book.customers.map((borrower) => (
            <Customer className={"customer"} borrower={borrower} />
          ))}
      </div>
    )
  );
};

export default BookItem;
