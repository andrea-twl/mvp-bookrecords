import ActionBtnCopy from "../atoms/ActionBtnCopy";
import styles from "./ActionBtn.module.scss";

const ActionBtn = ({ countryCode }) => {
  return (
    <div className={`${styles["actionBtn__container"]}`} id={"action-btn"}>
      <ActionBtnCopy text={"Get country: " + countryCode} />
    </div>
  );
};

export default ActionBtn;
