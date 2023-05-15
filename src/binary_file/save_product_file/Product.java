package binary_file.save_product_file;

import java.io.Serializable;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String manufacturer;
	private int price;
	public Product(int id, String name, String manufacturer, int price) {
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}
	
	

}
