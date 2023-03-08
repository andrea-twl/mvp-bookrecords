import BookToggleIcon from "../../assets/icons/BookToggleIcon";
import BookItemHeading from "../atoms/BookItemHeading";
import BookItemSubHeading from "../atoms/BookItemSubHeading";
import BookItem from "../molecules/BookItem";
import styles from "./BookList.module.scss";

const BookList = ({ data, id, name, author }) => {
  return (
    <div className={`${styles["book__list"]}`} id={`book-item-${id}`}>
      {data.map((book, id) => (
        <BookItem book={book} id={id + 1} />
      ))}
    </div>
  );
};

export default BookList;
