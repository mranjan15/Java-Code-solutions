import java.util.Scanner;

public class CollatzConjecture {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int n;
		// Enter key and press Enter
	    System.out.print("\nEnter n: "); 
	    n = myObj.nextInt();
	    System.out.print(n + " ");
	    while(n != 0) {
	    	if (n%2 == 0) {
	    		n = n/2;
	    	} else if (n == 1 || n == 0) {
	    		break;
	    	}else {
	    		n = (3*n) + 1;
	    	}
	    	System.out.print(n + " ");
	    }
	}

}