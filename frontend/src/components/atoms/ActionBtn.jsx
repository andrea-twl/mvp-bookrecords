import ActionBtnCopy from "./ActionBtnCopy";
import styles from "./ActionBtn.module.scss";

const ActionBtn = ({ countryCode, onClick }) => {
  return (
    <div
      className={`${styles["actionBtn__container"]}`}
      id={"action-btn"}
      onClick={onClick}
    >
      <ActionBtnCopy text={"Get country: " + countryCode} />
    </div>
  );
};

export default ActionBtn;
