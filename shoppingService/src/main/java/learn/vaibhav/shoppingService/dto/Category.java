/**
 * 
 */
package learn.vaibhav.shoppingService.dto;

/**
 * @author vaibhav.bansal
 *
 */
public class Category {
	
	private int id;
	private String name;
	private String description;
	private String imageUrl;
	private boolean isActive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Category(int id, String name, String description, String imageUrl, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.isActive = isActive;
	}
	public Category() {
		super();
	}
	
	

}
