package eCommerce;

import java.util.List;

public class Order  implements OrderActions
{
	 private List<Product> productList;
	 private String orderStatus;

	    public Order(List<Product> productList) 
	    {
	        this.productList = productList;
	        this.orderStatus = "Pending";
	    }
	    @Override
	    public void placeOrder() 
	    {
	        System.out.println("Order placed.");
	        this.orderStatus = "Placed";
	    }
	    @Override
	    public void cancelOrder()
	    {
	        System.out.println("Order cancelled.");
	        this.orderStatus = "Cancelled";
	    }
	    @Override
	    public void trackOrder()
	    {
	        System.out.println("Order status: " + orderStatus);
	    } 
	   //  for getting order details
	    public String getOrderDetails()
	    {
	        String details = "Order Details:\n";
	        for (Product product : productList)
	        {
	            details += product.getProductDetails() + "\n";
	        }
	        details += "Status: " + orderStatus;
	        return details;    
	    } 
	    // for Updating order status
	    public void updateOrderStatus(String status)
	    {
	        this.orderStatus = status;
	        System.out.println("Order status updated to: " + status);
	    }
}
