package InterviewPrograms;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		int num = 87652;
		int oddCount=0;
		int evenCount=0;
		
		
		while(num!=0) {
			
			int n = num % 10; 
			
			int rem = n % 2;
					
			if(rem==0) {
				evenCount++;
			}
			else {
				oddCount++;
				
			};
			num = num / 10;
		}
	
		
		System.out.println("oddCount :" + oddCount + " " + "evenCount :" + evenCount);

	}

}
