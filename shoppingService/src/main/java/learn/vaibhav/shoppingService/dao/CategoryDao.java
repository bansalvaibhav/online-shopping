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
public interface CategoryDao extends GenericDao<Category>{
	
	public List<Category> list();
	
	boolean deleteCategory(Category cat);

}
