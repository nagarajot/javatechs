package in.codersclub.javatechs.dom;

public class Item
{
	private int itemId;
	private String categoryCode;
	private String description;
	private int price;
	public Item(int itemId, String categoryCode, String description, int price) {
		super();
		this.itemId = itemId;
		this.categoryCode = categoryCode;
		this.description = description;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}