package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
            int num1=0;
            int num2=1;
            int n=10;
			    for(int i=1;i<n;i++) {
				System.out.println(num1);
				int nexterm = num1 + num2;
				num1 = num2;
				num2 = nexterm;
				
			}
		}
}

	
