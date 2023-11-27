package InterviewPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		

		int[] arr = { 2765, 3, 2, 2, 1 };
		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {

			sum = sum + arr[i];

		}

		System.out.println(sum);

	}

}
