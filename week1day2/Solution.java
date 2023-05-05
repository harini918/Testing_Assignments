package week1day2;

public class Solution {
	public int getFact() {
	int fact=1;
	  for(int i=1;i<=5;i++){    
	      fact=fact*i;
	  }    
	  return fact;
	}
	
	public static void main(String[] args) {
	    Solution a=new Solution();
	   System.out.println( a.getFact());
	    
	 }  
	}

