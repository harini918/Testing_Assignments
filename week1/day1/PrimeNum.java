package week1.day1;

public class PrimeNum {

	public static void main(String[] args) {
		//2,3,5,7,11 should be divisible by itself
		int n =8;
		boolean isprime=false;
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				isprime=true;
				break;
				
			}
		}
		if(!isprime)
		System.out.println(n + "is prime");
		else
			System.out.println(n + "is not prime");
	

	}

}