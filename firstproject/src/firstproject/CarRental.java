package firstproject;

public class CarRental {

	public static void main(String[] args) {
		

	}
	private int CarId;
	private String CarType;
	private float Rent;
	
	
	public int getCarId() {
		return CarId;
	}
	public void setCarId(int carId) {
		CarId = carId;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public float getRent() {
		return Rent;
	}
	public void setRent(float rent) {
		Rent = rent;
	}
	
	public float showCar(String Type) {
		if(Type.equals("SUV")) {
			Rent = (float) 2500.0;
		}
		else if(Type.equals("VAN")) {
			Rent = (float) 1500.0;
		}
		else if(Type.equals("Small Car")) {
			Rent = (float) 800.0;
		}
		return Rent;
	}
	public float GetCarRent() {
		showCar(CarType);
		return Rent;
	}
	
	
	

}
