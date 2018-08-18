package learn.vaibhav.shoppingService.daoImpl;

import java.util.List;

import org.hibernate.query.Query;

import learn.vaibhav.shoppingService.dao.ProductDao;
import learn.vaibhav.shoppingService.dto.Product;

public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao {

	@Override
	public List<Product> listOfActiveProducts() {
		Query<Product> query = session.getCurrentSession().createQuery("FROM Product where isActive =:isActive",Product.class);
		query.setParameter("isActive", true);
		return query.getResultList();
	}

}
