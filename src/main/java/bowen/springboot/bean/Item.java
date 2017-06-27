package bowen.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	
	/**
	 * unique string representing partner
	 */
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Ad ad;
	
	public Item() {}

	public Item(String id, String name, String description, String partner_id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.ad = new Ad(partner_id, 9999, "");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ad getAd() {
		return ad;
	}

	public void setAd(Ad ad) {
		this.ad = ad;
	}

	
	
}
