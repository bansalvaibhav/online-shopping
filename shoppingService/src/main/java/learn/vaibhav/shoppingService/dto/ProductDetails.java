/**
 * 
 */
package learn.vaibhav.shoppingService.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vaibhav.bansal
 *
 */
@Entity
@Table(name="product_details")
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="actual_price")
	private Double actualPrice;
	@Column(name="normal_price")
	private Double normalPrice;
	@Column(name="offer_price")
	private Double offerPrice;
	@Column(name="min_qty")
	private int minimumQty;
	@Column(name="max_qty")
	private int maximumQty;
	@Column(name="tax_category_id")
	private int taxCategoryId;
	@Column(name="active_from")
	private Date activeFrom;
	@Column(name="active_to")
	private Date activeTo;
	@Column(name="is_active")
	private boolean isActive;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_description")
	private String productDescription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(Double actualPrice) {
		this.actualPrice = actualPrice;
	}
	public Double getNormalPrice() {
		return normalPrice;
	}
	public void setNormalPrice(Double normalPrice) {
		this.normalPrice = normalPrice;
	}
	public Double getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}
	public int getMinimumQty() {
		return minimumQty;
	}
	public void setMinimumQty(int minimumQty) {
		this.minimumQty = minimumQty;
	}
	public int getMaximumQty() {
		return maximumQty;
	}
	public void setMaximumQty(int maximumQty) {
		this.maximumQty = maximumQty;
	}
	public int getTaxCategoryId() {
		return taxCategoryId;
	}
	public void setTaxCategoryId(int taxCategoryId) {
		this.taxCategoryId = taxCategoryId;
	}
	public Date getActiveFrom() {
		return activeFrom;
	}
	public void setActiveFrom(Date activeFrom) {
		this.activeFrom = activeFrom;
	}
	public Date getActiveTo() {
		return activeTo;
	}
	public void setActiveTo(Date activeTo) {
		this.activeTo = activeTo;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
}
