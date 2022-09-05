package week1.day2;

public class OddCharaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="changeme";
		char[] testArray=test.toCharArray();
        char c;	
		for(int i=0;i<testArray.length;i++) {
			if(i%2==0) {
			  System.out.println(Character.toUpperCase(testArray[i]));
			}else {
				
				 System.out.println(testArray[i]);
		}
	}
	}
}
