package selfstudy;

class MyDemo {
	private static int count = 0;
	private int x;
	
	public MyDemo(int i) {
		x=1;
	}
	public void incrementcount() {
		count++;
	}
	public void printX() {
		System.out.println("Value of x :"+x);
	}
	public static void printCount() {
		System.out.println("Value of Count :"+count);
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		MyDemo.count = count;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
}

public class MyclassPractice{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDemo myc1 = new MyDemo(5);
		MyDemo myc2 = new MyDemo(7);
		MyDemo myclass = new MyDemo(6);
		myclass.incrementcount();
		myc1.printX();
		myc1.setX(10);
		myc1.incrementcount();
		myc1.printCount();
		myc2.printX();
		myc2.incrementcount();
		myc2.printCount();
	}
}