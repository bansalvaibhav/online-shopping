/**
 * 
 */
package learn.vaibhav.shoppingService.dto;

import java.util.List;

/**
 * @author vaibhav.bansal
 *
 */
public class Product {
	
	private int id;
	private int subCategoryId;
	private int categoryId;
	private boolean isActive;
	private List<ProductImages> images;
	private ProductDetails productDetails;
}
