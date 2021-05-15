package D4A3;

public class CampaignManager implements ICampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + "Eklendi. İndirim Oranı: "+campaign.getDiscountRate());
		
	}

	@Override
	public void updateCampaign(Campaign campaign,double discountRate) {
		System.out.print("Eski İndirim Orani: "+campaign.getDiscountRate());
		campaign.setDiscountRate(discountRate);
		System.out.println("Yeni indirim Oranı: "+campaign.getDiscountRate());
		
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign Silindi : " +campaign.getName());
		
	}

}
