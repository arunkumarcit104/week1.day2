package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="I am a software tester";
	
		String s[]=test.split(" ");
	 
		for(int i=0;i<s.length;i++) {
			if(i%2!=0) {
			
			char[] charArray=s[i].toCharArray();
			
			for(int j=charArray.length-1;j>=0;j--) {
				
				System.out.print(charArray[j]);
			
					}
			}
			
			else {
				
				System.out.print(" "+s[i]+" ");
			}
			
		}
	
	}
}