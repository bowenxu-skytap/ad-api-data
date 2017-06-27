package bowen.springboot.service;

import java.util.List;

import bowen.springboot.bean.Ad;


public interface AdService {
	
	public List<Ad> retrieveAllAds();
	
	public void createAd(Ad ad);
	
	public void updateAd(Ad ad, String partner_id);

	public Ad retrieveAd(String partner_id);

	public void deleteAd(String partner_id);

}
