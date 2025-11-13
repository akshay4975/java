class Swiggy
{
public static void main(String[]args){
	String name="SWIGGY";
	int users=13000000;
	int order=1500000;
	int rider=300000;
	int cancelOrder=300000;
	int onlinePayment=1000000;
	int refund=75000;
	int restaurants=196000;
	int vegRestaurants=50000;
	int nonVegRestaurants=restaurants-vegRestaurants;
	int takeAway=100000;
	int dineOut=order-takeAway;
	int feedback=40000;

	System.out.println(name);
	System.out.println("Users : "+users);
	System.out.println("Orders : "+order);
	System.out.println("Riders : "+rider);
	System.out.println("Canceled Orders : "+cancelOrder);
	System.out.println("Online Payments : "+onlinePayment);
	System.out.println("Refunds : "+refund);
	System.out.println("Restaurants : "+restaurants);
	System.out.println("Veg Restaurants : "+vegRestaurants);
	System.out.println("Non Veg Restaurants : "+nonVegRestaurants);
	System.out.println("Take Away : "+takeAway);
	System.out.println("Dine Out : "+dineOut);
	System.out.println("Feedback : "+feedback);
}
}