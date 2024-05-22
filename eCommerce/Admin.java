package eCommerce;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User
{
	// for save here all product
	private List<Product> productList;
	
	// for login Admin
	public Admin(int priuserId, String username, String password, String email)
	{
		super(priuserId, username, password, email);
		// for List of Product
		this.productList=new ArrayList<Product>();
	}
	// Admin Add the Product 
	public void addProduct(Product product)
	{
		productList.add(product);
		//System.out.println("Admin Add product into the list :-  "+product.getProductName());
		System.out.println("Admin Add product into the list :-  "+product+" \n");
	}

	//Remove Product From the list
	public void removeProduct(Product product)
	{
		for(Product pRemove:productList)
		{
			if(pRemove.getProductId()==product.getProductId())
			{
				productList.remove(product);
				System.out.println("Product remove from the List :- "+pRemove.getProductName());
				return;
			}
		}
		System.out.println("Error: Product is not found for remove opertion");
	}

	// updateProduct
	public void updateProduct(Product product)
	{
		for(Product pUpdate:productList)
		{
			if(pUpdate.getProductId()==product.getProductId())
			{
				pUpdate.updatePrice(product.getPrice());
				pUpdate.updateQuantity(product.getQuantit());
				//System.out.println("Update Product :- "+ pUpdate.getProductName());
				System.out.println("Update Product :- "+ pUpdate);
				return;
			}
		}
		System.out.println("Error: Product Not found for update ");
	}

	@Override
	public void viewProfile() 
	{
		System.out.println("Viewing profile for admin:- " + getUsername());	
	}
	@Override
	public void updateProfile() 
	{
		System.out.println("Updating profile for admin:- " + getUsername());	
	}
}
