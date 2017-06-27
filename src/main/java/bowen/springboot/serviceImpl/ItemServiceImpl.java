package bowen.springboot.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bowen.springboot.bean.Item;
import bowen.springboot.repository.ItemRepository;


@Service
public class ItemServiceImpl {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public void createItem(Item item) {
		itemRepository.save(item);
	}
	
	public void updateItem(Item item) {
		itemRepository.save(item);
	}
	
	public List<Item> retrieveAllItems(String partner_id) {
		List<Item> items = new ArrayList<>();
		itemRepository.findByAdPartnerId(partner_id).forEach(items::add);
		return items;
	}
	
	public Item retrieveItem(String id) {
		return itemRepository.findOne(id);
	}

	public void deleteItem(String id) {
		itemRepository.delete(id);
	}

}
