import ActionBtnCopy from "./ActionBtnCopy";
import CustomerCopy from "./CustomerCopy";
import styles from "./Customer.module.scss";

const Customer = ({ borrower }) => {
  return (
    <div className={`${styles["customer"]}`} id={"action-btn"}>
      <CustomerCopy text={borrower} />
    </div>
  );
};

export default Customer;
