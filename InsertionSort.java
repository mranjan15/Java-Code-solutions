
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNext()) {
			n = sc.nextInt();
		}
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int val = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > val) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = val;
		}
		for (int b : a) {
			System.out.print(b + " ");
		}

	}

}
