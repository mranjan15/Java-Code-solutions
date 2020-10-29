import java.util.Scanner;
public class FloydTriangle {
 
    public static void main(String[] args) {
        
        int i,j,k=1,n;
        System.out.print("Enter how many lines u want : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
           
            for(j=1;j<=i;j++)
            {
                
                System.out.print(" "+k);
                k++;
            }
            System.out.println("");
        }
    }
    
}
