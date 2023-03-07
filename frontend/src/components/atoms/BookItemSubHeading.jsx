import styles from "./BookItemSubHeading.module.scss";

const BookItemSubHeading = ({ text, children }) => {
  return (
    <div className={`${styles.text}`}>
      {text}
      {children}
    </div>
  );
};

export default BookItemSubHeading;
