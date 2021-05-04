package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getId()+" Numaralı "+ campaign.getName()+ " kampanyası sisteme eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId()+" Numaralı "+ campaign.getName()+ " kampanyası güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getId()+" Numaralı "+ campaign.getName()+ " kampanyası sona erdiği için sistemden silindi.");
		
	}

}
