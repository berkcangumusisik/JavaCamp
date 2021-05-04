package Concrete;
import Abstract.OrderService;
import Abstract.SalesServices;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Order;

public class SalesManager  implements SalesServices{
	
	private OrderService orderService;
	

	public SalesManager(OrderService orderService) {
		super();
		this.orderService = orderService;
	}


	public void buy(Order order, Customer customer, Game[] games, Campaign campaign) {
		// TODO Auto-generated method stub
		Double totalPrice = 0.0;
		
		System.out.println("Merhaba " + customer.getFirstName() + " " + customer.getLastName());
		for (Game game : games) {
			System.out.println("Game ID: " + game.getId() + " numaralı " + game.getName() + " oyunun fiyatı: " + game.getPrice() + " TL'dir.");
			totalPrice += game.getPrice();
		}
		System.out.println("Toplam sepet tutarınız : " + totalPrice + " TL'dir.");
		
		if (campaign != null) {
			calculate(campaign, totalPrice);
		} else {
		orderService.add(order);
		}
		
	}
	
	private void calculate(Campaign campaign,Double totalPrice) {
		System.out.println(campaign.getName() + " Kampanyasından %" + campaign.getDiscount() + " indirim alarak " + totalPrice + " TL Fiyatından Güncel Sepet Tutarınız: " + (totalPrice * ( 100 - campaign.getDiscount()) /100) + " TL olmuştur.");
	}
		
}


	
	
	

