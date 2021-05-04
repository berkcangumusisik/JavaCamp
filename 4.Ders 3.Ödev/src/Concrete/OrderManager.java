package Concrete;

import Abstract.OrderService;
import Entity.Order;

public class OrderManager implements OrderService{

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " ID'li siparişiniz eklendi");
		

		
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + "ID'li siparişiniz güncellendi");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId() + "ID'li siparişiniz silindi");
		
	}

}
