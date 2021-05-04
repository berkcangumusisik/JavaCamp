package Abstract;

import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Order;

public interface SalesServices {
	public void buy(Order order,Customer customer,Game[] games,Campaign campaign);
}
