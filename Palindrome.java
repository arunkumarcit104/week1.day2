package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam";
		
		String rev="";
				
		for(int i=str.length()-1;i>=0;i-- ) {
		
		 rev=rev+ str.charAt(i);		
		
          if (rev.equals(str)) {
		
		System.out.println("palinDrome");
				}
		}
    
	}
}
