package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;
import Abstract.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks validation succefull");
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}		
	}


	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

}
