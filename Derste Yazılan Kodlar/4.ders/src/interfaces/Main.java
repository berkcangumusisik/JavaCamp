package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new EmailLogger(), new DatabaseLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer berkcan = new Customer(1,"Berkcan","Gumusisik");
		customerManager.Add(berkcan);
	}

}
