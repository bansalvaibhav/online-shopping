/**
 * 
 */
package learn.vaibhav.shoppingService.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import learn.vaibhav.shoppingService.dao.CategoryDao;
import learn.vaibhav.shoppingService.dto.Category;

/**
 * @author vaibhav.bansal
 *
 */
@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl extends GenericDaoImpl<Category> implements CategoryDao{

	@Override
	public List<Category> list() {
		String queryString = "FROM Category where isActive= :active";
		Query<Category> query = session.getCurrentSession().createQuery(queryString,Category.class);
		query.setParameter("active", true);
		return query.getResultList();
		
	}

	@Override
	public boolean deleteCategory(Category cat) {
		cat.setActive(false);
		return updateItem(cat);	
	}


	
	
}
