package eCommerce;

import java.util.*;
public class E_Commers
{
	public static void main(String[] args) 
	{

		UserManager userManager=new UserManager();
		// Register Admin
		Admin  admin=new Admin(1,"Admin","admin", "admin@gmail.com");

		userManager.register(admin);
		userManager.login("Admin", "admin");
		//  for admin operations
		Admin loggedInAdmin = (Admin) userManager.getLoggedInUser();
		// Admin Operations

		// Add Product 
		Product laptop = new Product(1, "Laptop", 1000.0, 10, "Electronics");
		Product phone = new Product(2, "TV", 50000.0, 20, "Electronics");	
		Product mobile = new Product(3, "Mobile", 1500.0, 20, "Electronics");
		loggedInAdmin.addProduct(laptop);
		loggedInAdmin.addProduct(phone);
		loggedInAdmin.addProduct(mobile);

		// for update product 
		loggedInAdmin.updateProduct(new Product(1, "Laptop", 900.0, 15, "Electronics"));
		loggedInAdmin.updateProduct(new Product(3, "Mobiles", 15000.0, 20, "Electronics"));
		// Remove Product
		loggedInAdmin.removeProduct(phone);
		// Logout Admin
		userManager.logout();	

		// Customer

		// Register Customer
		Customer customer = new Customer(2, "Customer", "customer", "customer@gmail.com");
		userManager.register(customer);

		// Login as Customer
		userManager.login("Customer", "customer");

		// for making object everey customer there own operations
		Customer loggedInCustomer = (Customer) userManager.getLoggedInUser();

		// Customer operations

		loggedInCustomer.addToCart(mobile);
		loggedInCustomer.addToCart(laptop);
		// view Profile
		loggedInCustomer.viewProfile();

		//Add to Cart
		List<Product> cart = new ArrayList<>();
		cart.add(laptop);
		cart.add(mobile);

		//order Product
		Order order=new Order(cart);
		order.placeOrder();
		System.out.println(order.getOrderDetails());

		// order status update
		order.updateOrderStatus("Placed");
		order.trackOrder();
		userManager.logout();



	}
}
