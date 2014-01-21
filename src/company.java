
public abstract class company { // abstract class
	public  int productcode; //members
	public String items;
	
	//construtors	
	public company(int newproductcode, String newitem) {
	productcode = newproductcode;
	items = newitem;
	}
	
	public String getitems() // returns items
	{
	return items;
	}	
	public int getcode()
	{
		return productcode; // returns code
				
	}
	public abstract int getprice();
	public String toString()
	{
	return "productcode" + productcode + "items is " + items + " the price is " + getprice();
			
	// product code and item and price returned
	
	}

}

