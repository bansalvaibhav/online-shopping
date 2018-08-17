/**
 * 
 */
package learn.vaibhav.shoppingService.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import learn.vaibhav.shoppingService.dao.CategoryDao;
import learn.vaibhav.shoppingService.dto.Category;

/**
 * @author vaibhav.bansal
 *
 */
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao{
	
	private static List<Category> staticCategory = new ArrayList<>();
	
	static{
		staticCategory.add(new Category(1, "Television", "tv category, static", null, true));
		staticCategory.add(new Category(2, "Mobile", "mobile category, static", null, true));
		staticCategory.add(new Category(3, "Laptop", "laptop category, static", null, true));
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return staticCategory;
	}

	@Override
	public Category get(int id) {
		for(Category cat: staticCategory){
			if(cat.getId()==id){
				return cat;
			}
		}
		return null;
	}

	
	
}
