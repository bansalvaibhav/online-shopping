package learn.vaibhav.shoppingService.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import learn.vaibhav.shoppingService.dao.ProductDetailsDao;
import learn.vaibhav.shoppingService.dto.ProductDetails;
@Repository("productDetailsDao")
@Transactional
public class ProductDetailsDaoImpl extends GenericDaoImpl<ProductDetails> implements ProductDetailsDao {


}
