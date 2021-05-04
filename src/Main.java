import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
			customerManager.save(new Customer(1,"Burcu Fatma", "Aslan", LocalDate.of(1992, 7,11), "11"));
			

	}

}
