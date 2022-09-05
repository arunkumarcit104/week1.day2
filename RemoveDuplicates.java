package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="We learn java basics as part of java sessions in java week1";
		int count=0;
		String arrayStr[]=str.split(" ");
	
		 for(int i=0;i<arrayStr.length;i++) {
			 count=1;
    		 for(int j=i+1;j<arrayStr.length;j++) {
    			 
          	      	 if(arrayStr[i].equals(arrayStr[j])) {
          	      		 count++;
          	      		 arrayStr[j]=" ";
			       }         	      	 
    		 }
    		 
          	      if(count>1 ) {
          	    	arrayStr[i]=" ";
          	                 }        	    
          	  } 
		 for(int k=0;k<arrayStr.length;k++) {
			 System.out.print(arrayStr[k]+" ");
		 }
 }

}
