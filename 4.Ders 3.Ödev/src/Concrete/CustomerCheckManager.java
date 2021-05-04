package Concrete;

import Entity.Customer;
import Abstract.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return false;
	}

}
