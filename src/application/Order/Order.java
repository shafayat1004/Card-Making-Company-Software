package application.Order;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import application.Assets.Assets;


public class Order implements Serializable{
    private String orderID;
    
    private String customerID, designerID, csEmployeeID, cardType, paperType, color, orderQuantity, deliverTo, orderType, orderNote, orderStatus;
    private LocalDateTime orderedOn, deliveredOn;
    private LocalDate deliverBy;

    private String draftFilePath;
    private String rejectionCause;
    
    public Order(String orderID, String customerID, String cardType, String paperType, String color,
    String orderQuantity, String deliverTo, String orderType, String orderNote, LocalDate deliverBy) {

        this.orderID = orderID;
        this.customerID = customerID;
        this.cardType = cardType;
        this.paperType = paperType;
        this.color = color;
        this.orderQuantity = orderQuantity;
        this.deliverTo = deliverTo;
        this.orderType = orderType;
        this.orderNote = orderNote;
        this.deliverBy = deliverBy;
        
        this.orderedOn = LocalDateTime.now();
        this.orderStatus = Assets.orderStatus[0];
    }
    
    public String getDraftFilePath() {
        return draftFilePath;
    }


    public void setDraftFilePath(String draftFilePath) {
        this.draftFilePath = draftFilePath;
    }

    public String getCardType() {
        return cardType;
    }


    public void setCardType(String cardType) {
        this.cardType = cardType;
    }


    public String getPaperType() {
        return paperType;
    }


    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getOrderQuantity() {
        return orderQuantity;
    }


    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity;
    }


    public String getDeliverTo() {
        return deliverTo;
    }


    public void setDeliverTo(String deliverTo) {
        this.deliverTo = deliverTo;
    }


    public String getRejectionCause() {
        return rejectionCause;
    }
    
    public void setRejectionCause(String rejectionCause) {
        this.rejectionCause = rejectionCause;
    }
    
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
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

    public LocalDate getDeliverBy() {
        return deliverBy;
    }

    public void setDeliverBy(LocalDate deliverBy) {
        this.deliverBy = deliverBy;
    }

    public LocalDateTime getOrderedOn() {
        return orderedOn;
    }

    public void setOrderedOn(LocalDateTime orderedOn) {
        this.orderedOn = orderedOn;
    }

    public LocalDateTime getDeliveredOn() {
        return deliveredOn;
    }

    public void setDeliveredOn(LocalDateTime deliveredOn) {
        this.deliveredOn = deliveredOn;
    }
 
}