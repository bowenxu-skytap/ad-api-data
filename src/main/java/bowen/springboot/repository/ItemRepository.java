package bowen.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import bowen.springboot.bean.Item;

public interface ItemRepository extends CrudRepository<Item, String>{

	public List<Item> findByName(String name);
	public List<Item> findByDescription(String description);
	public List<Item> findByAdPartnerId(String partner_id);
}
