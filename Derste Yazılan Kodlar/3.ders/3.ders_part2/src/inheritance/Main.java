package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer berkcan = new IndividualCustomer();
		berkcan.customerNumber = "12345";
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {berkcan, hepsiBurada, abc}; 
		customerManager.addMultiple(customers);
		

	}

}
