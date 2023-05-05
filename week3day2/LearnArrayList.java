package week3day2;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		List<String>list =new ArrayList<String>();
		list.add("Alpha");
		list.add("Sigma");
		list.add("Shrikanth");
		list.add("Delta");
		list.add("Gamma");
		list.add("Shilpa");
	    System.out.println(list);
	    list.add("Pie");
	    System.out.println(list);
	    System.out.println(list.size());
	    list.add("Pie");
	    System.out.println(list);
	    list.add(3,"Choco");
	    System.out.println(list);
	    list.set(1, "Zudio");
	    System.out.println(list);
	    list.remove("Pie");
	    System.out.println(list);
	   
	}

}
