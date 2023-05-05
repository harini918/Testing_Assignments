package week1day2;

import java.util.Arrays;

public class MissingEle {

	public static void main(String[] args) {
	int[] arr = {1,2,3,4,6,7,8};
	int n= arr.length +1 ;
	int sum=(n*(n+1))/2;
	for(int i=0;i<arr.length;i++) {
		sum=sum-arr[i];
		
	}
System.out.println(sum);
}
}
