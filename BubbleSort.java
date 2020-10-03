
public class BubbleSort {

	public static void main(String[] args) {
		int[] myNum = {10, 20, 30, 40};
		boolean swap = true;
		int sizeOfArray = myNum.length, index = 0;
		while(index < sizeOfArray && swap == true) {
			swap = false;
			int nestedIndex = index;
			while(nestedIndex > 0){
				if (myNum[index] > myNum[index + 1]) {
					int tmp = myNum[index];
					myNum[index] = myNum[index+1];
					myNum[index+1] = tmp;
					swap = !swap;
				}
				nestedIndex--;
			}
		}
		for (int i = 0; i<sizeOfArray;i++) {
			System.out.print(myNum[i]+ " ");
		}
	}

}
