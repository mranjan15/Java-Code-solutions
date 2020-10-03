/*
	**************************** One-dimensional Arrays ****************************
	****************************** Reversing an Array ******************************
*/


import java.util.Scanner;

public class ReverseArray{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int n,i, temp;
		System.out.print("Enter the size of array: ");
		n = inp.nextInt();
		int[] a;
		a = new int[n];
		System.out.println("Enter the array element:");
		for(i=0; i<n; i++){
			a[i] = inp.nextInt();
		}
		for(i=0; i<(n/2); i++){
			temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp;
		}
		System.out.print("The Reversed Array is: ");
		for(i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
	}
}
