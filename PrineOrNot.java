package InterviewPrograms;

public class PrineOrNot { // if no is only divisible by itself

	public static void main(String args[]) {

		int num = 23;
		int flag = 0;

		for (int i = 1; i <= num / 2; i++) {

			int rem = num % i;

			if (rem == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("prime no.");

		} else {
			System.out.println("Not a prime no.");
		}
	}

}
