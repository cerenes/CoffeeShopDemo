import java.time.LocalDate;

import CoffeeShopDemo.Adapters.MernisServiceAdapter;
import CoffeeShopDemo.Business.Concrete.BaseCustomerManager;
import CoffeeShopDemo.Business.Concrete.StarbucksCustomerManager;
import CoffeeShopDemo.Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.add(new Customer(1, "Ceren", "Esirgenci", LocalDate.of(1999, 8, 23), "22222222222"));	
		

	}

}
