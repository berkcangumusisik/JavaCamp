package Entity;

import Abstract.EntityService;
import java.time.LocalDate;

public class Order implements EntityService {
	private int id;
	private int customerId;
	private int gameId;
	private int campaignId;
	private LocalDate date;
	public Order() {
		
	}
	public Order(int id, int customerId, int gameId, int campaignId, LocalDate date) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getGameId() {
		return gameId;
	}
	
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	public int getCampaignId() {
		return campaignId;
	}
	
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
