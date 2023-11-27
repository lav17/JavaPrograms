package InterviewPrograms;

public class LargestInArray {

	public static void main(String[] args) {

		int array1[] = { 44, 766, 99, 77, 33, 22, 55 };
		int largest = 0;

		// Using a method causes something to happen to an object, while using a
		// property returns information about the object or causes a quality about the
		// object to change

		for (int i = 1; i <= array1.length - 1; i++) { // length is a property

			if (array1[i] > largest) {

				largest = array1[i];
			}

		}
		System.out.println(largest);

	}

}
