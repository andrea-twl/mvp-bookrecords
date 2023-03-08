import styles from "./ActionBtnCopy.module.scss";

const ActionBtnCopy = ({ text, children }) => {
  return (
    <div className={`${styles.text}`}>
      {text}
      {children}
    </div>
  );
};

export default ActionBtnCopy;
