import java.util.Scanner;

public class OddEven_Checker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter any integer number : ");
        num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " is an even number.");
        }else {
            System.out.println(num + " is an odd number.");
        }

    }

}
