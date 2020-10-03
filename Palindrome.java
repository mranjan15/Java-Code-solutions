
public class Palindrome { 

	// Function that returns true if 
	// str is a palindrome 
	static boolean isPalindrome(String str) 
	{ 

		// Pointers pointing to the beginning 
		// and the end of the string 
		int i = 0, j = str.length() - 1; 

		// While there are characters to compare 
		while (i < j) { 

			// If there is a mismatch 
			if (str.charAt(i) != str.charAt(j)) 
				return false; 

			// Increment first pointer and 
			// decrement the other 
			i++; 
			j--; 
		} 

		// Given string is a Palindrome 
		return true; 
	} 

	// Test code 
	public static void main(String[] args) 
	{ 
		String str = "wow"; 

		if (isPalindrome(str)) 
			System.out.print("Yes"); 
		else
			System.out.print("No"); 
	} 
} 


