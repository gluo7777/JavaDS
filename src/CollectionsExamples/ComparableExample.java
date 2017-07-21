package CollectionsExamples;
import java.util.Arrays;
import java.util.Random;

public class ComparableExample {
	public static void main(String[] args) {
		// create objects to compare
		ComparableObject[] arr = new ComparableObject[10];
		int rand; 
		Random random = new Random();
		for(int i=0; i<arr.length ; i++){
			rand = random.nextInt(11); // nextInt((max - min) + 1) + min
			arr[i] = new ComparableObject(rand);
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

class ComparableObject implements Comparable<ComparableObject> {

	int data;

	public ComparableObject(int data) {
		this.data = data;
	}

	@Override
	public int compareTo(ComparableObject o) {
		if (this.data > o.data) {
			return 1;
		} else if (this.data < o.data) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return Integer.toString(data);
	}

}
