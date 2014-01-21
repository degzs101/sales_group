
public class machinery extends company{ //the use of inheritance from the class company
	
public machinery(int newproductcode, String newitem) {
		super(newproductcode, newitem);// called from base class
	}
// members
private String items; 
private int serialno;
private int baseprice;
private boolean warranty;
private String newitems;
{
}
// construtors
public void Machinery (String newitems, int newproductcode, int newserialno, int newbaseprice,boolean newwarranty) {
	items = newitems;
	serialno = newserialno;
	baseprice = newbaseprice;
	warranty = newwarranty;
}
	
// methods to see if warrenty is needed
	public void includewarrenty(){
		warranty=true;
	}
	public void excludewarranty(){
		warranty=false;
	}
	
	public int getserialno(){
		return serialno;
	}
	
	// method to get price
	public int getprice()
	{
		if (warranty==true)
		{
			return (baseprice+((baseprice/100)*10));
		}
		else
			return baseprice;

	}
	}	

