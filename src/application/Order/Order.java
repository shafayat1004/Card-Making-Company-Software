package application.Order;

import java.util.Date;

public class Order {
    private String customerID, designerID, csEmployeeID, orderType, orderNote, orderStatus;
    private Date deliverBy, orderedOn, deliveredOn;
    
    public Order(String customerID, String designerID, String csEmployeeID, String orderType, String orderNote,
            String orderStatus, Date deliverBy, Date orderedOn, Date deliveredOn) {
        this.customerID = customerID;
        this.designerID = designerID;
        this.csEmployeeID = csEmployeeID;
        this.orderType = orderType;
        this.orderNote = orderNote;
        this.orderStatus = orderStatus;
        this.deliverBy = deliverBy;
        this.orderedOn = orderedOn;
        this.deliveredOn = deliveredOn;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getDesignerID() {
        return designerID;
    }

    public void setDesignerID(String designerID) {
        this.designerID = designerID;
    }

    public String getCsEmployeeID() {
        return csEmployeeID;
    }

    public void setCsEmployeeID(String csEmployeeID) {
        this.csEmployeeID = csEmployeeID;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getDeliverBy() {
        return deliverBy;
    }

    public void setDeliverBy(Date deliverBy) {
        this.deliverBy = deliverBy;
    }

    public Date getOrderedOn() {
        return orderedOn;
    }

    public void setOrderedOn(Date orderedOn) {
        this.orderedOn = orderedOn;
    }

    public Date getDeliveredOn() {
        return deliveredOn;
    }

    public void setDeliveredOn(Date deliveredOn) {
        this.deliveredOn = deliveredOn;
    }
 
}