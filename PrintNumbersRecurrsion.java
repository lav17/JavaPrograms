package InterviewPrograms;

public class PrintNumbersRecurrsion {
	
	public static void main(String args[]) {
		printNum(1,70);
				
	}
	public static void printNum(int startNum, int endNum) {
		
		if(startNum<=endNum) {
		System.out.println(startNum);
		startNum++;
		printNum(startNum,endNum);
	}

}}
