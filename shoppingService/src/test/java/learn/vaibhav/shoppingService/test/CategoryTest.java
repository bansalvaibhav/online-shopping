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
import learn.vaibhav.shoppingService.dto.Category;

/**
 * @author vaibhav.bansal
 *
 */
public class CategoryTest {
	
	private static AnnotationConfigApplicationContext appContext;
	
	private static CategoryDao categoryDao;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		appContext = new AnnotationConfigApplicationContext();
		appContext.scan("learn.vaibhav.shoppingService");
		appContext.refresh();
		
		categoryDao = appContext.getBean(CategoryDao.class);
	}
	
	@Test
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
	}

}
