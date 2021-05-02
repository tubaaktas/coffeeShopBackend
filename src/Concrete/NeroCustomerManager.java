package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckServices) {
		this.customerCheckService=customerCheckServices;
	}
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Nero validation succesfull");
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}		
	}
}
