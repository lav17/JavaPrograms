package InterviewPrograms;

public class RotaionString {
	public static void main(String args[]) {
		
		String str1= "abcd";
		String str2="acdb";
		boolean flag= false;
		
		if(str1.length() != str2.length()) {
			flag=false;			
		}
		else{
			
			String concatenated = str1+str1;
			flag = concatenated.contains(str2);
			
		}
			
		System.out.println(flag);
		
		
	}

}
