import styles from "./BookItemHeading.module.scss";

const BookItemHeading = ({ text }) => {
  return (
    <p className={`${styles.text}`}>
      {text}
      {children}
    </p>
  );
};

export default BookItemHeading;
