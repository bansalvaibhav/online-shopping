/**
 * 
 */
package learn.vaibhav.shoppingService.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author vaibhav.bansal
 *
 */
public interface GenericDao<T extends Serializable> {
	
	
	T get(Class<T> clas, int id);
	
	boolean addItem(T item);
	
	boolean updateItem(T item);

}
