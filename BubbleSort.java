
public class BubbleSort {

	public static void main(String[] args) {
		int[] myNum = {10, 50, 20, 40};
		boolean swap = true;
		int sizeOfNestedLoop = myNum.length-1, index = 0;
		while(index < myNum.length && swap == true) {
			swap = false;
			int nestedIndex = 0;
			while(nestedIndex < sizeOfNestedLoop){
				if (myNum[nestedIndex] > myNum[nestedIndex + 1]) {
					int tmp = myNum[nestedIndex];
					myNum[nestedIndex] = myNum[nestedIndex+1];
					myNum[nestedIndex+1] = tmp;
					swap = true;
				}
				nestedIndex++;
			}
			index++;
			sizeOfNestedLoop--;
		}
		for (int i = 0; i < myNum.length; i++) {
			System.out.print(myNum[i]+ " ");
		}
	}

}
