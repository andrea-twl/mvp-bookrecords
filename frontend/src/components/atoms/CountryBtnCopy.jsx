import styles from "./CountryBtnCopy.module.scss";

const CountryBtnCopy = ({ text, children }) => {
  return (
    <div className={`${styles.text}`}>
      {text}
      {children}
    </div>
  );
};

export default CountryBtnCopy;
