/**
 * 
 */
package learn.vaibhav.shoppingService.dao;

import java.util.List;

import learn.vaibhav.shoppingService.dto.Category;

/**
 * @author vaibhav.bansal
 *
 */
public interface CategoryDao {
	
	List<Category> list();
	
	Category get(int id);

}
