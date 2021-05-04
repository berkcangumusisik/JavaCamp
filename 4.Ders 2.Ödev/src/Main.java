import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Berkcan", "Gümüşışık", 1999, "12345678901");
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(customer1);
		
		System.out.println();
	}
}

