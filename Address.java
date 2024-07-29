package classrelationexample.hashrelation;

public class Address {
	
	private String flatno , socityname,area;
	private int pincode;
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	public String getSocityname() {
		return socityname;
	}
	public void setSocityname(String socityname) {
		this.socityname = socityname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", socityname=" + socityname + ", area=" + area + ", pincode=" + pincode
				+ "]";
	}
	
	

}
