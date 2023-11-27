package InterviewPrograms;

public class ReverseANo {

	public static int reverseNum(int num) {

		int revNum = 0;

		while (num != 0) {

			int n = num % 10;

			revNum = revNum * 10 + n;

			num = num / 10;

		}

		return revNum;
	}

	public static void main(String[] args) {

		int Num = 9876;

		int revNum = reverseNum(Num);

		if (revNum == Num) {

			System.out.println("The number " + Num + " is a palindrome");
		}

		else {

			System.out.println("The reverse of number " + Num + " is " + revNum);
		}

	}

}
