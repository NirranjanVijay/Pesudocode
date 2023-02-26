package week5.day3;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("Enter the name");
		//Use Scanner() to get input in runtime
		Scanner val=new Scanner(System.in);
		String rev = val.next();
		//Use toCharArray to convert string to array
		char[] charArray = rev.toCharArray();
		System.out.println("Reverse name");
		//Use reverse for loop
		for (int i =charArray.length-1; i>=0; i--) {
			//Print the values
			System.out.print(charArray[i]);
		}
	}


}
