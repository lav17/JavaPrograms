package InterviewPrograms;

public class PrintPalindrome {
	
public static void main(String args[]) {
	
	String s1 = "maliuytm";
	String revStr="";
	
	for (int i=s1.length()-1;i>=0;i--) {		
		revStr = revStr + s1.charAt(i);				
	}
	
	if(s1.equals(revStr)) {
		System.out.println("Palindrome");		
	}
	else {
		System.out.println("Not a Palindrome");	
	}
}

}
