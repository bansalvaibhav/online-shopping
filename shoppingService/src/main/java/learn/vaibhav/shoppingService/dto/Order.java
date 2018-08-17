/**
 * 
 */
package learn.vaibhav.shoppingService.dto;

import java.util.Date;
import java.util.List;

/**
 * @author vaibhav.bansal
 *
 */
public class Order {
	
	private int id;
	private List<OrderItem> orderItemIds;
	private int userId;
	private Address billingAddress;
	private Address shippingAddress;
	private OrderStatusType orderStatus;
	private PaymentModeType paymentMode;
	private PaymentStatusType paymentStatus;
	private Double orderPriceWithoutTax;
	private Double orderPriceWithTax;
	private Double orderTax;
	private Date orderDate;
	private Date deliveredDate;
	
	public enum OrderStatusType{
		SUBMITTED,IN_PROGRESS,SHIPPING,DELIVERED,CANCELLED,UNDELIVERED,PARTIALLY_DELIVERED;
	}
	
	public enum PaymentModeType{
		ONLINE,COD;
	}
	
	public enum PaymentStatusType{
		PENDING,COMPLETED;
	}
}
