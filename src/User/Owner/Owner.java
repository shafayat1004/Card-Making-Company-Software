package User.Owner;

import Privilages.CustomerService.CSPrivilages;
import Privilages.Owner.OwnerPrivilages;
import Privilages.Supervisor.SupervisorPrivilages;
import User.User;

public class Owner extends User implements OwnerPrivilages, SupervisorPrivilages, CSPrivilages{
    
}
