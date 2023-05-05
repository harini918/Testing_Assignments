package week1day2;

// get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count 
	
	// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
	
			// compare both the loop variables & check they're equal
		
					// print the matching value
	//step by step execution of the program.		
public class PrintDuplicates {

	public static void main(String[] args) {
		
			int[] arr= {2,3,4,5,6,7,2};
			//System.out.println(arr.length);
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[j]);
					}
				}
			}
			
		
	}

}
