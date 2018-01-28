
public class Car {
	int numberOfWheels;
	int numberOfSeats;
	double maximumSpeedInKilometersPerHour;
	
	public Car(int wheels, int seats, double maximumSpeedInKilometersPerHour) {
		this.numberOfWheels = wheels;
		this.numberOfSeats = seats;
		this.maximumSpeedInKilometersPerHour = maximumSpeedInKilometersPerHour;
	}
	
	public String toString() {
		return "I am a car, and I have" + numberOfWheels  + "wheels, " +  numberOfSeats + " seats, and I can drive up to " + maximumSpeedInKilometersPerHour + "kilometers per hour.";
	}
}
