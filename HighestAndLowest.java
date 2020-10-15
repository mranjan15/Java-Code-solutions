public class HighestAndLowest {
    public static void main(String[] args)
    {
        int [] numbers = {10,6,10,12,15,4,1};
        System.out.print("Array: ");
        for (int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println();

        int high = numbers[0];
        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > high)
            {
                high = numbers[i];
            }
        }
        System.out.println("The highest value is: " + high);

        int low = numbers[0];
        for(int i = 1; i <numbers.length; i++)
        {
            if(numbers[i] < low)
            {
                low = numbers[i];
            }
        }
        System.out.println("The lowest value is: " + low);
    }
}
