package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entity.Customer;

public class CustomerManager implements CustomerService{

	private CustomerCheckService customerCheckService;
	

	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("---------------------YENİ MÜŞTERİ---------------");
			System.out.println(customer.getFirstName() + " "+ customer.getLastName()+ "  Müşterisi Eklendi.");
		} else {
			System.out.println(customer.getNationalityId() + " Mernis Sisteminde Bulunamadı. Müşteri Eklenemedi");
			System.exit(0);
		
	}
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+ " "+customer.getLastName() + " kişisi sistemde bilgilerini güncelledi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+ " "+customer.getLastName() + " kişisi sistemden silindi.");
		
	}

}
