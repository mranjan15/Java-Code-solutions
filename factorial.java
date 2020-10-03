public class Factorial {
	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)){
			
			System.out.println("Enter the value of n: ");
			int n = input.nextInt();
			int result = factorial(n);
			System.out.printf("the factorial of %d is %d.",n,result);
			
		}
		
	}

	private static int factorial(int n) {
		int temp = 0;
		temp = n <= 0 ? 1 : n*factorial(n-1); 
		return temp;
	}

}