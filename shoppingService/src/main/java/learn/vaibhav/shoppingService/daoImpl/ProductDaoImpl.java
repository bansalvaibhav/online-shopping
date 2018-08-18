package learn.vaibhav.shoppingService.daoImpl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import learn.vaibhav.shoppingService.dao.ProductDao;
import learn.vaibhav.shoppingService.dto.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao {

	@Override
	public List<Product> getActiveProducts() {
		Query<Product> query = session.getCurrentSession().createQuery("FROM Product where isActive =:isActive",Product.class);
		query.setParameter("isActive", true);
		return query.getResultList();
	}

	@Override
	public List<Product> getActiveProductsByCategory(int categoryId) {
		Query<Product> query = session.getCurrentSession().createQuery("FROM Product where isActive =:isActive and category.Id= :category_id",Product.class);
		query.setParameter("isActive", true);
		query.setParameter("category_id", categoryId);
		return query.getResultList();
	}

	@Override
	public List<Product> getLatesActiveProductsByCategory(int categoryId, int maxCount) {
		// TODO Auto-generated method stub
		Query<Product> query = session.getCurrentSession().createQuery("FROM Product where isActive =:isActive and category.Id= :category_id",Product.class);
		query.setParameter("isActive", true);
		query.setParameter("category_id", categoryId);
		return query.setFirstResult(0).setMaxResults(maxCount).getResultList();
	}

	@Override
	public List<Product> getLatesActiveProducts(int maxCount) {
		Query<Product> query = session.getCurrentSession().createQuery("FROM Product where isActive =:isActive",Product.class);
		query.setParameter("isActive", true);
		return query.setFirstResult(0).setMaxResults(maxCount).getResultList();
	}
}
