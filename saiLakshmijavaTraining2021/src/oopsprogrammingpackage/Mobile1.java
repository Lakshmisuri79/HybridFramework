package oopsprogrammingpackage;

public class Mobile1 {
	
	private String name;
	private double price;
	private String os;
	private String version;
	private int GB;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		{
			if(price>0)
			{
				this.price = price;
			}
			else
			{
				this.price=0.0;
			}
		}
		
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getGB() {
		return GB;
	}

	public void setGB(int GB)
	{
		if(GB==64||GB==128)
		{
			this.GB = GB;
		}
		else
		{
			this.GB=0;
		}
	
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
