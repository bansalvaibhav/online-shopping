package learn.vaibhav.shoppingService.dao;

import java.util.List;

import learn.vaibhav.shoppingService.dto.Product;

public interface ProductDao extends GenericDao<Product> {

	List<Product> listOfActiveProducts();
}
