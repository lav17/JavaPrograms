package InterviewPrograms;

public class TotalSingleChar {

	public static void main(String[] args) {
		
		String str = "lavisha";
        int total= str.length()-str.replace("p", "").length();
        System.out.println(total);
	}

}
