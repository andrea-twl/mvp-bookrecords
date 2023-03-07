import styles from "./CustomerCopy.module.scss";

const CustomerCopy = ({ text, children }) => {
  return (
    <div className={`${styles.text}`}>
      {text}
      {children}
    </div>
  );
};

export default CustomerCopy;
