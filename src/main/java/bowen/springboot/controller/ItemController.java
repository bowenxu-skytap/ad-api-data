package bowen.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bowen.springboot.bean.Ad;
import bowen.springboot.bean.Item;
import bowen.springboot.serviceImpl.ItemServiceImpl;




@RestController
public class ItemController {
	
	@Autowired
	private ItemServiceImpl itemService;
	
	@GetMapping("/ad/{partner_id}/items")
	public List<Item> retrieveAllItems(@PathVariable String partner_id) {
		return itemService.retrieveAllItems(partner_id);
	}

	@GetMapping("/ad/{partner_id}/items/{id}")
	public Item retrieveItem(@PathVariable("id") String id) throws IllegalStateException{
		return itemService.retrieveItem(id);
	}
	
	@PostMapping("/ad/{partner_id}/items")
	public void createItem(@RequestBody Item item, @PathVariable String partner_id) {
		item.setAd(new Ad(partner_id, 9999, ""));
		itemService.createItem(item);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/ad/{partner_id}/items/{id}")
	public void updateItem(@RequestBody Item item, @PathVariable String id, @PathVariable String partner_id) {
		item.setAd(new Ad(partner_id, 9999, ""));
		itemService.updateItem(item);
	}
	
	@DeleteMapping("/ad/{partner_id}/items/{id}")
	public void deleteItem(@PathVariable("id") String id) {
		itemService.deleteItem(id);
	}
	
}

