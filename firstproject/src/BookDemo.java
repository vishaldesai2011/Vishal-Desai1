package selfstudy;

public class BookDemo {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author name = new Author("Russel","Winderand");
		Book detail = new Book("Developing Java Software",name,79.75);
		System.out.println(detail);
	}
}