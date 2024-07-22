package selfstudy;

public class Book {
	private String title;
	private double price;
	private Author name;
	
	public Book(String title, Author name,double price) {
		this.title = title;
		this.price = price;
		this.name=name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getName() {
		return name;
	}
	public void setName(Author name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nBook [Title=" + title + ", Name=" + name + ", Price=" + price + "]";
	}
	
	
}
