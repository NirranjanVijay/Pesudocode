package week5.day3;

public class Palindrome {
	public static void main(String[] args) {
		String pal="madam";
		//create another string 
		String rev="";
		// we are giving the input value as string 
		//If it is a char value we can simply give length
		for(int i=pal.length()-1;i>=0;i--) {
			//In string length is a method
			//we don't have any direct method to reverse a string
			//hence we convert string to characters and convert it.
			rev=rev+pal.charAt(i);
			//print it
					}System.out.println(rev);
			//use if condition
		if(pal.equals(rev)) {
			//print the values
			System.out.println("The given string is a palindrome");
		}
		else
			
			System.out.println("The given string is not a palindrome");
}
}
