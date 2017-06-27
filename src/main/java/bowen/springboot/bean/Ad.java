package bowen.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Ad {
	
	/**
	 * unique string representing partner
	 */
	@Id
	private String partnerId;
	
	
	/**
	 * campaign duration in seconds from now
	 */
	@NotNull
	private int duration;
	
	
	/**
	 * content to be displayed as an ad
	 */
	@NotEmpty
	private String ad_content;
	
	private long creationTime;
	
	public Ad() {}

	public Ad(String partner_id, int duration, String ad_content) {
		super();
		this.partnerId = partner_id;
		this.duration = duration;
		this.ad_content = ad_content;
	}

	public String getPartner_id() {
		return partnerId;
	}

	public void setPartner_id(String partner_id) {
		this.partnerId = partner_id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getAd_content() {
		return ad_content;
	}

	public void setAd_content(String ad_content) {
		this.ad_content = ad_content;
	}

	public long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}

	
}
