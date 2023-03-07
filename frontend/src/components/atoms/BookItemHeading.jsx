import styles from "./BookItemHeading.module.scss";

const BookItemHeading = ({ text, children }) => {
  return (
    <div className={`${styles.text}`}>
      {text}
      {children}
    </div>
  );
};

export default BookItemHeading;
