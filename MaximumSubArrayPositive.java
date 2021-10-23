package DSAUDemy;

//
public class MaximumSubArrayPositive {
    static int maxSubArraySumPositive(int a[]) {

        int LargestSum = 0;
        for (int i = 0; i < a.length; i++) {
            int currentSum = 0;
            int head = i;
            if (a[head] < 0) {
                head++;
                while (head!=a.length && a[head] > 0 ) {
                    currentSum += a[head];
                    head++;
                }
    
                LargestSum = Math.max(LargestSum, currentSum);
            }
           
        }

        return LargestSum;
    }

    public static void main(String[] args) {
        int a[] = { -1, 2, 3, 4, -2, 6, -8, 3 };

        int sum = maxSubArraySumPositive(a);
        
        System.out.println(sum);

    }
}
