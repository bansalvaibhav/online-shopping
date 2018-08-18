/**
 * 
 */
package learn.vaibhav.shoppingService.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author vaibhav.bansal
 *
 */
@Entity
@Table(name="product")
public class Product implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="sub_category_id")
	private SubCategory subCategory;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="category_id")
	private Category category;
	
	@Column(name="is_active")
	private boolean isActive;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	private List<ProductImages> images;*/
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="product_details_id")
	private ProductDetails productDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public ProductDetails getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}
	
	
}
