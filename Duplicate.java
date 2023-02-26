package week5.day3;

import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {
		 //Declare a Array 
		   int[] a= {1,2,3,4,5,6,7,2,9,5};
		 //sort the array
		   Arrays.sort(a);
		 //iterate the values
		   for (int i = 0; i < a.length; i++) {
			   for (int j =i+1; j < a.length; j++) {
				//Use if condition
				   if(a[i]==a[j]) {
					   System.out.println("Duplicate values are:"+a[i]);
				   }
			}
			
		   }

}
}
