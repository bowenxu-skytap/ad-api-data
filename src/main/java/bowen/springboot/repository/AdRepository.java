package bowen.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import bowen.springboot.bean.Ad;

public interface AdRepository extends CrudRepository<Ad, String>{

}
