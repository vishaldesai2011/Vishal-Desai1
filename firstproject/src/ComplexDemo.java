package selfstudy;


class Complex {
	private double realPart,imaginaryPart;
	
	
	public Complex() {
		this.realPart = 0;
		this.imaginaryPart = 0;
	}
	
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex add(Complex otherNumber) {
		 this.realPart+=otherNumber.realPart;
		 this.imaginaryPart+= otherNumber.imaginaryPart;
		 return this;	
			
	}
	public Complex subtract(Complex otherNumber) {
		this.realPart -=otherNumber.realPart;
		this.imaginaryPart -= otherNumber.imaginaryPart;
		return this;	
		
	}
	public Complex multiply(Complex otherNumber) {
		this.realPart*=otherNumber.realPart;
		this.imaginaryPart*= otherNumber.imaginaryPart;
		return this;	
		
	}
	public Complex division(Complex otherNumber) {
		this.realPart/=otherNumber.realPart;
		this.imaginaryPart/= otherNumber.imaginaryPart;
		return this;	
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	@Override
	public String toString() {
		return "Complex [realPart=" + realPart + ", imaginaryPart=" + imaginaryPart + "]";
	}
}

public class ComplexDemo{
	public static void main(String args[]) {
		 	Complex c1 = new Complex(2.0, 3.0);
		 	Complex c2 = new Complex(1.0, 4.0);
		 	System.out.println(c1.add(c2));
		 	System.out.println(c1.subtract(c2));
		 	System.out.println(c1.multiply(c2));
		 	System.out.println(c1.division(c2));
		 	
	}
}