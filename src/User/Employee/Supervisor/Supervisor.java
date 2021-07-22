package User.Employee.Supervisor;

import java.util.ArrayList;

import Privilages.CustomerService.CSPrivilages;
import Privilages.Supervisor.SupervisorPrivilages;
import User.Employee.Employee;
import User.Employee.CustomerService.CustomerService;

public class Supervisor extends Employee implements SupervisorPrivilages, CSPrivilages{
    ArrayList<CustomerService> CSEmpUnderSup;
}
