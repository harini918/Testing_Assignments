package week3day1;

public class NewClassStatic {
     //accessing methods and variables from other classes
	public static void main(String[] args) {
		LearnStatic obj=new LearnStatic();
		System.out.println(obj.a);          //accesing non static variable
		System.out.println(LearnStatic.b); //accessing static variable 
		obj.print();
		LearnStatic.call();
		obj.change();
	}

}
