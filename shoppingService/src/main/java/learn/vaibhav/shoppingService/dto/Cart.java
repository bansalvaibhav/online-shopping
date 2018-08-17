/**
 * 
 */
package learn.vaibhav.shoppingService.dto;

import java.util.List;

/**
 * @author vaibhav.bansal
 *
 */
public class Cart {
	
	private int id;
	private List<CartItem> cartItems;
	private int userId;
	private Double cartPriceWithoutTax;
	private Double cartPriceWithTax;
	private Double cartTax;
	private CartStatusType status;
	
	public enum CartStatusType{
		IN_PROGRESS,DISCARDED,ORDERED;
	}
}
