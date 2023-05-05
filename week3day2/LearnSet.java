package week3day2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(1);
HashSet<Integer>set=new HashSet<Integer>();
HashSet<Integer>set1=new HashSet<Integer>();	
		
		for (Integer integer : list) {
			if(!set.add(integer)) {
				set1.add(integer);
			}
			
		}
		
		System.out.println(set1);
	}
}
		