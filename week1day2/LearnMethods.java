package week1day2;

public class LearnMethods {
	
   public void brandOfTheCar() {
	System.out.println("Nexa");
   }
	public int reg() {
		return 1234 ;	
	}
	public Boolean isPuncture() {
		return true;
	}
	public int multiply(int a,int b,int c) {
		return 5*8*9;
	}
	public String modelOfTheCar() {
		return "Baleno";
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  LearnMethods b=new LearnMethods();
  System.out.println(b.reg());
  
 System.out.println( b.isPuncture());
  
  System.out.println(b.multiply(0, 0, 0));
  
  System.out.println(b.modelOfTheCar());
  
	}

}
