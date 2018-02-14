/**
 * A simple program that finds the maximum and minimum numbers within an array
 * 
 */

public class MainSrc {

	public static void main(String[] args) {
		
		int arr[] = {75, 2, 22, 70, 69};
		int i; int max=0; int min=0;
		
		for(i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if (arr[i] > max) {
				max = arr[i];
				min= max;
			} 
			
			if (arr[i] < min) {
				min= arr[i];
			}
			
		}
		System.out.println("\n\nMaximum number is " + max);
		System.out.println("Minimum number is "+min);
	}
	// Hope you liked it! :)
}
