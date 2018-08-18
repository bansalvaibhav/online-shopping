package learn.vaibhav.shoppingService.dao;

import java.util.List;

import learn.vaibhav.shoppingService.dto.Product;

public interface ProductDao extends GenericDao<Product> {

	List<Product> getActiveProducts();
	
	List<Product> getActiveProductsByCategory(int categoryId);
	
	List<Product> getLatesActiveProductsByCategory(int categoryId, int maxCount);
	
	List<Product> getLatesActiveProducts(int maxCount);
}
