package CollectionsExamples;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Compare methods return positive value if first value is greater, negative if lesser, or 0 if equal
 * @author gluo7
 *
 */
public class ComparatorExample {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		
		cars[0] = new Car("Corolla",2011);
		cars[1] = new Car("Accord",2007);
		cars[2] = new Car("Prius",2003);
		
		Car.ModelComparator modelComparator = new Car.ModelComparator();
		Car.YearComparator yearComparator = new Car.YearComparator();
		
		System.out.println("Before sorting cars: " + Arrays.toString(cars));
		Arrays.sort(cars,modelComparator);
		System.out.println("After sorting cars by model: " + Arrays.toString(cars));
		Arrays.sort(cars,yearComparator);
		System.out.println("After sorting cars by year: " + Arrays.toString(cars));
	}

}

class Car{
	String model;
	int year;
	
	public Car(String m, int y){
		model = m;
		year = y;
	}
	
	@Override
	public String toString() {
		return model + "\t" + year;
	}



	public static class ModelComparator implements Comparator<Car>{
		@Override
		public int compare(Car c1, Car c2) {
			return c1.model.compareTo(c2.model);
		}
	}
	
	public static class YearComparator implements Comparator<Car>{
		@Override
		public int compare(Car c1, Car c2) {
			return c1.year - c2.year;
		}
		
	}
}

