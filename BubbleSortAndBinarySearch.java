import java.util.Scanner;

public class BubbleSortAndBinarySearch {

	public static void main(String[] args) {
		// Bubble Sort
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
		
		// Binary Search
		Scanner myObj = new Scanner(System.in);
		int key;
		// Enter key and press Enter
	    System.out.print("\nEnter key: "); 
	    key = myObj.nextInt();
	    boolean isFound = false;
	    int startPos = 0, endPos = myNum.length-1;
	    int currentPos = (endPos) / 2;
	    while(startPos <= endPos) {
	    	if (key == myNum[currentPos]) {
	    		System.out.println("There is " + key + " in array.");
	    		isFound = true;
	    		break;
	    	}
	    	if (key < myNum[currentPos]) {
	    		endPos = currentPos-1;
	    		currentPos = (startPos + endPos) / 2;
	    	} else if (key > myNum[currentPos]) {
	    		startPos = currentPos+1;
	    		currentPos = (startPos + endPos) / 2;
	    	}
	    }
	    if(!isFound) {
	    	System.out.println("There is not " + key + " in array.");
	    }
	}

}