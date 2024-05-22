package eCommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User
{
	// for add product for customer choices 
	private  List<Product> cart;

	// for login 
	public Customer(int priuserId, String username, String password, String email) 
	{
		super(priuserId, username, password, email);
		// for add the item in this cart
		this.cart=new ArrayList<Product>();
	}

	//Add item into the cart
	public void addToCart(Product product)
	{
		cart.add(product);
		System.out.println("add to the cart :- "+product.getProductName());
	}
	//Remove product on that cart
	public void removeFromCart(Product product)
	{ 
		cart.remove(product);
		System.out.println("remove product on that cart :- "+product.getProductName());
	}
	//checkout
	public void checkout()
	{
		System.out.println("Check out the cart :- "+ cart.size());
		// for remove all the product in the cart
		cart.clear();
	}

	@Override
	public void viewProfile()
	{	
		System.out.println("Viewing profile for customer:-  " + getUsername());
	}

	@Override
	public void updateProfile() 
	{
		System.out.println("Updating profile for customer:-  " + getUsername());
	}

}
