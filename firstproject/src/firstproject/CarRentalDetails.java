package firstproject;

public class CarRentalDetails {

	public static void main(String[] args) {
		CarRental cr = new CarRental();
		cr.setCarId(01);
		cr.setCarType("SUV");
		System.out.println(cr.GetCarRent());
	}

}
