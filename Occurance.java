package week5.day3;

public class Occurance {
	public static void main(String[] args) {
		//declare the string
		String a="Nirranjan";
		//use tocharArray to convert string to Array
		char[] b=a.toCharArray();
		//initialize temporary variable 
		int count=0;
		//iterate the characters
		for(int i=0;i<b.length;i++) {
			
			//use if condition
			if(b[i]=='r') {
				count++;
				
			}
		//print the value	
		}System.out.println("r oocurance is" +count);
	}
 
}
