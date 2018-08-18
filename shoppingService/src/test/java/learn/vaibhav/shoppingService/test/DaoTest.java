/**
 * 
 */
package learn.vaibhav.shoppingService.test;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import junit.framework.Assert;
import learn.vaibhav.shoppingService.dao.CategoryDao;
import learn.vaibhav.shoppingService.dao.GenericDao;
import learn.vaibhav.shoppingService.dao.ProductDao;
import learn.vaibhav.shoppingService.dto.Category;
import learn.vaibhav.shoppingService.dto.Product;
import learn.vaibhav.shoppingService.dto.ProductDetails;

/**
 * @author vaibhav.bansal
 *
 */
public class DaoTest {
	
	private static AnnotationConfigApplicationContext appContext;
	
	private static CategoryDao categoryDao;
	
	private static ProductDao productDao;
	
	private static GenericDao genericDao;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		appContext = new AnnotationConfigApplicationContext();
		appContext.scan("learn.vaibhav.shoppingService");
		appContext.refresh();
		
		categoryDao = appContext.getBean(CategoryDao.class);
		productDao = appContext.getBean(ProductDao.class);
		genericDao = (GenericDao) appContext.getBean("genericDao");
	}
	
/*	@Test
	@Ignore
	public void testAddCategory(){
		category= new Category();
		category.setName("mobile");
		category.setDescription("test description");
		category.setActive(true);
		
		Assert.assertEquals("passed", true, categoryDao.addItem(category));
	}
	
	@Test
	public void testGetCategory(){
				
		Assert.assertEquals("passed", "test", categoryDao.get(Category.class,2).getName());
	}
	
	@Test
	public void testUpdateCategory(){
		Category cat = categoryDao.get(Category.class,1);
		cat.setName("test update");
		categoryDao.updateItem(cat);
		Assert.assertEquals("passed", "test update", categoryDao.get(Category.class,1).getName());
	}
	
	@Test
	@Ignore
	public void testDeleteCategory(){
		Category cat = categoryDao.get(Category.class,1);
		categoryDao.deleteCategory(cat);
		Assert.assertEquals("passed", false, categoryDao.get(Category.class,1).isActive());
	}
	
	@Test 
	public void testGetActiveList(){
		Assert.assertEquals("passed", 3, categoryDao.list().size());;
	}*/
	
	@Test
	public void testProductDaoCrudOperation(){
		Category cat= categoryDao.get(Category.class, 3);
		Product product = new Product();
		product.setActive(true);
		product.setCategory(cat);
		ProductDetails pd = (ProductDetails) genericDao.get(ProductDetails.class, 1);
		//pd.setProduct(product);
		product.setProductDetails(pd);
		Assert.assertEquals(true, productDao.addItem(product));
	}

	@Test
	@Ignore
	public void testProductDetailsDaoCrudOperation(){
		ProductDetails productDetails = new ProductDetails();
		productDetails.setActive(true);
		productDetails.setActualPrice(100.00);
		productDetails.setMaximumQty(2);
		productDetails.setMinimumQty(1);
		productDetails.setProductDescription("This is honor 7x");
		productDetails.setProductName("HONOR 7x");
		productDetails.setTaxCategoryId(1);
		Assert.assertEquals(true, genericDao.addItem(productDetails));
	}
}
