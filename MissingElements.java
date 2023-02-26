package week5.day3;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
	    //declare the array
		int [] a = {1,2,3,4,5,6,9,8};
		//sort the array
		Arrays.sort(a);
	    //use the length
		int n = a.length+1; 
		//use sum formula
		int sum =( n*(n+1)/2);
		//iterate the value
		for(int i =0; i<a.length; i++) {
			sum = sum - a[i]; 
		}
		//print the values
		System.out.println(sum);
}

}
