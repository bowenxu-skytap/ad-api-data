package bowen.springboot.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bowen.springboot.bean.Ad;
import bowen.springboot.repository.AdRepository;
import bowen.springboot.service.AdService;


@Service
public class AdServiceImpl implements AdService {
	
	@Autowired
	private AdRepository adRepository;
	
	@Override
	public void createAd(Ad ad) {
		ad.setCreationTime(System.currentTimeMillis());
		adRepository.save(ad);
	}
	
	@Override
	public void updateAd(Ad ad, String partner_id) {
		ad.setCreationTime(System.currentTimeMillis());
		adRepository.save(ad);
	}
	
	@Override
	public List<Ad> retrieveAllAds() {
		List<Ad> ads = new ArrayList<>();
		adRepository.findAll().forEach(ads::add);
		return ads;
	}
	
	@Override
	public Ad retrieveAd(String partnerId) {
		return adRepository.findOne(partnerId);
	}

	@Override
	public void deleteAd(String partnerId) {
		adRepository.delete(partnerId);
	}

}
