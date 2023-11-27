package InterviewPrograms;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		/*
		 * String str = "poihyt&6%$#g*k(";
		 * 
		 * String strNew = str.replaceAll("[^\\w\\s-]", "");
		 * 
		 * System.out.println(strNew);
		 */
		
		String str = "uyt jyftg hhgdryf";
		String	newStr="";
				
		for(int i=0; i<=str.length()-1; i++) {
			
			if(str.charAt(i)!=32) { //32 is ASCII value for space
				
			newStr = newStr + str.charAt(i);
				
			}
		}

		System.out.println(newStr);
		
	}

}
