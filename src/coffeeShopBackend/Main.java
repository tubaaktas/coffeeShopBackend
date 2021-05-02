package coffeeShopBackend;

import java.io.Console;
import java.sql.Date;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();//fake 
		customer1.Id = 1;
		customer1.setNationalityId("000000000000");
		customer1.setFirstName("Tuðba");
		customer1.setLastName("Aktaþ");
		customer1.setDateOfBirth(new Date(2510,8,23));
		
		
		Customer customer2 = new Customer(2,"28861499108","Engin","Demiroð",new Date(1985,1,6));//real

		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.Save(customer1);
		neroCustomerManager.Save(customer2);
		
		BaseCustomerManager starCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starCustomerManager.Save(customer1);
		starCustomerManager.Save(customer2);


	}
}
