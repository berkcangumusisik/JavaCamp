import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.SalesManager;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Order;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();
		OrderManager orderManager = new OrderManager();
		SalesManager salesManager = new SalesManager(orderManager);
		GameManager gameManager = new GameManager();
		
		Customer customer1 = new Customer(1,"BERKCAN", "GÜMÜŞIŞIK", 1999, "12345678901");
		customerManager.add(customer1);


		System.out.println("-------------------------EKLENEN OYUNLAR---------------");
		Game game1 = new Game(1,"Counter Strike",100.00);
		gameManager.add(game1);

		Game game2 = new Game(1,"PES 2021",65.00);
		gameManager.add(game2);
		
		System.out.println("-------------------------KAMPANYALAR---------------");
		Campaign campaign1 = new Campaign(1,"Herkes Oyun Oynasın İndirimi",30,true);
		campaignManager.add(campaign1);
		Campaign campaign2 = new Campaign(2,"Üniversitelilere Özel Yaz İndirimi",25,true);
		campaignManager.add(campaign2);
		Campaign campaign3 = new Campaign(3,"Liselilere Özel Yaz İndirimi",15,true);
		campaignManager.add(campaign3);
		Order order1 = new Order(1,2,2,2,LocalDate.now());
		Game[] games = {game1,game2};
		System.out.println("-------------2.Kampanya Uygulanmış Sepet-----------------");
		salesManager.buy(order1 , customer1, games, campaign2);
		System.out.println("------------Kampanya Uygulanmamış Sepet----------------");
		salesManager.buy(order1, customer1, games,null);
		gameManager.delete(game1);
		gameManager.update(game1);
		gameManager.delete(game2);
		gameManager.update(game2);
		customerManager.delete(customer1);
		customerManager.update(customer1);

	}

}
