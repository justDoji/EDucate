import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	
	public static void main(String[] parameters) {
		System.out.println("Well, hello there beautiful!");
		
		Car fancyNewMercedes = new Car(4, 2, 280.0);
		Car crappyOldVolvo = new Car(3, 1, 55.0);
		Car toyCar = new Car(4, 4, 2.5);
		List<Car> cars = new ArrayList<Car>();
		cars.add(fancyNewMercedes);
		cars.add(crappyOldVolvo);
		cars.add(toyCar);
		
		System.out.println("Let me brag about my " + cars.size() + "cars!");
		for(int i = 0; i < cars.size(); i++) {
			Car carToShow = cars.get(i);
			System.out.println(carToShow.toString());
		}
	}

}
