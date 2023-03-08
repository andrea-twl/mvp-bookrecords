import BookToggleIcon from "../../assets/icons/BookToggleIcon";
import BookItemHeading from "../atoms/BookItemHeading";
import BookItemSubHeading from "../atoms/BookItemSubHeading";
import styles from "./BookItem.module.scss";

const BookItem = ({ id, name, author }) => {
  return (
    <div className={`${styles["book__item"]}`} id={`book-item-${id}`}>
      <div className={styles["book__id"]}>
        <BookItemHeading text={id} />
      </div>
      <div className={styles["book__name"]}>
        <BookItemHeading text={name} />
      </div>
      <div className={styles["book-toggle"]}>
        <BookToggleIcon />
      </div>
      <div className={styles["book__author"]}>
        <BookItemSubHeading text={"by " + author} />
      </div>
    </div>
  );
};

export default BookItem;
