package User.Employee.CustomerService;

import java.util.ArrayList;

import Privilages.CustomerService.CSPrivilages;
import User.Customer.Customer;
import User.Employee.Employee;

public class CustomerService extends Employee implements CSPrivilages{
    ArrayList<Customer> customersUnderEmp;
}
