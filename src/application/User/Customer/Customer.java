package application.User.Customer;


import java.time.LocalDate;

import application.Assets.Assets;
import application.Database.DatabaseManipulator;
import application.Order.Order;
import application.User.User;


public class Customer extends User{
    
    public Customer(String name, String emailFromField, String userIDFromField, String passFromField) {
        super(name, emailFromField, userIDFromField, passFromField);
    }
    
    public Customer(String userIDFromField) {
        super(userIDFromField);
        this.getClass().cast(DatabaseManipulator.getObjectFromDatabase(id, Assets.userTypes[0], Assets.customersFilePath));
        
    }
    public Order createOrder(String cardType, String paperType, String color,
    String orderQuantity, String deliverTo, String orderType, String fileName, String orderNote, LocalDate deliverBy){

        int orderNum = DatabaseManipulator.getCount(Assets.ordersFilePath) + 1;
        String orderID = "" + orderNum;
        Order newOrder = new Order(orderID, id, cardType, paperType, color, orderQuantity, deliverTo, orderType, fileName, orderNote, deliverBy);

        return newOrder;

    }
    public Order getOrder(){
        return (Order)DatabaseManipulator.getObjectFromDatabase(id, Assets.userTypes[0], Assets.ordersFilePath);
    }


}
