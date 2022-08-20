package co.grandcircus.CART.API;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface CartRepository extends MongoRepository<CartItems, String> {

	List<CartItems> findByProduct(String product);

}