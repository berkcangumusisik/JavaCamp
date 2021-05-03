package interfaces;

public class CustomerManager {
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	public void Add(Customer customer) {
		System.out.println("Musteri Eklendi:"+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void Delete(Customer customer) {
		System.out.println("Musteri Silindi:"+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
