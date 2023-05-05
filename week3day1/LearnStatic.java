package week3day1;

public class LearnStatic {
    public int a =5; //non-static variable 
    static int b=10; //static variable
    public void change() {
    	LearnStatic obj=new LearnStatic();
    	obj.a=obj.a+5;
    	b=b+5;
    	System.out.println(b);//value of b will be updated as it is static 
    	System.out.println(a);//value of a is not updated ad its is non-static
    	
    }
    public void print() {
    	
    	System.out.println("from non-static method");
    }
    public static void call() {
    	System.out.println("from  static method");
    }

	public static void main(String[] args) {
		/*LearnStatic obj=new LearnStatic();
		System.out.println(obj.a);     //accesing non static variable
		System.out.println(LearnStatic.b); //accessing static variable 
		obj.print();
		LearnStatic.call();*/
	}
}
