package eCommerce;

public class Product
{ 
	// Product Field are private 
	private int	productId;
	private String productName;
	private double price;
	private int quantity;
	private String category;

	// Getter And Setter method for achieve encapsulation

	public int getProductId()
	{
		return productId;
	}
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		if(price>0) {
		this.price = price;
		}
		else
		{
			System.out.println("Error: Invalid Price");
		}
	}
	public int getQuantit()
	{
		return quantity;
	}
	public void setQuantit(int quantity) 
	{
		if(quantity>0) 
		{
		this.quantity = quantity;
		}
		else
		{
			System.out.println("Error: Invalid Quantity");
		}
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
	// override toString method for print data
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + ", category=" + category + "]";
	}
	// field constructor
	public Product(int productId, String productName, double price, int quantity, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	// some method for operations on product

	// for getting product Details
	public String getProductDetails()
	{
		return "Product ID: " + productId + ", Name: " + productName + ", Price: $" + price + ", Quantity: " + quantity + ", Category: " + category;
	}
	// for Updating old quantity to new quantity
	public void updateQuantity(int newQuantity)
	{
		setQuantit(newQuantity);		
	}
	// for Updating old price to new price
	public void	updatePrice(double newPrice)
	{
		setPrice(newPrice);
	}



}
