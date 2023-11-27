package InterviewPrograms;

public class LargestOfThreeNo {

	public static int largestNo(int num1, int num2, int num3) {

		int largest;

		if (num1 > num2) {

			largest = num1;

		} else {
			largest = num2;
		}

		if (largest < num3) {
			largest = num3;
		}
		return largest;
	}

	public static void main(String[] args) {

		System.out.println(largestNo(345, 8, 97));

	}

}
