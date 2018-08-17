/**
 * 
 */
package learn.vaibhav.shoppingService.dto;

import java.util.Date;

/**
 * @author vaibhav.bansal
 *
 */
public class ProductDetails {
	
	private int id;
	private int productId;
	private Double productActualPrice;
	private Double productNormalPrice;
	private Double productOfferPrice;
	private int minimumQty;
	private int maximumQty;
	private int taxCategoryId;
	private Date activeFrom;
	private Date activeTo;
	private boolean isActive;
	private String productName;
	private String productDescription;
	
}
