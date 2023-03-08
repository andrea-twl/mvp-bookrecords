import ActionBtnCopy from "../atoms/ActionBtnCopy";
import CustomerCopy from "../atoms/CustomerCopy";
import styles from "./Customer.module.scss";

const Customer = ({ name }) => {
  return (
    <div className={`${styles["customer"]}`} id={"action-btn"}>
      <CustomerCopy text={name} />
    </div>
  );
};

export default Customer;
