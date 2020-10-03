import java.util.Scanner;
class Stack
{	final int MAX=5;
	Scanner scan = new Scanner(System.in);
	int arr[]= new int[MAX];
	int top=-1;
	boolean isFull()
	{
		if(top==MAX-1)
			return true;
		else
			return false;

	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	void pop()
	{
		if(isEmpty() ==true)
		{
			System.out.println("UNDERFLOW");
			return;
		}
		else
		{
			System.out.println(arr[top]);
			top--;
			
		}

	}
	void push()
	{
		if(isFull()==true)
		{
			System.out.println("OVERFLOW");
			return;
		}
		else
		{
			System.out.println("Enter the number : ");
			int a=scan.nextInt();
			top++;
			arr[top]=a;
		}
	}
	void display()
	{
		if(isEmpty()==true)
		{
			System.out.println("UNDERFLOW");
			return;
		}
		else
		{
			for(int i=top;i>=0;i--)
			System.out.println(arr[i]);
		}
	}
	void peep()
	{
		if(isEmpty()==true)
		{
			System.out.println("UNDERFLOW");
			return;
		}
		else
			System.out.println(arr[top]);
	}
	public static void main(String args[])
	{
		int choice,i=0,n;
		Stack obj=new Stack();

		while(true)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("1 for push");
			System.out.println("2 for pop");
			System.out.println("3 for pepe");
			System.out.println("4 for display");
			System.out.println("5 for exit");
			System.out.println("Enter your choice:");
			choice=in.nextInt();
			switch(choice)
			{
				case 1:obj.push();
					break;
				       
				case 2:obj.pop();
				       break;
				case 3:obj.peep();
					break;
				case 4:obj.display();
			       		break;
				case 5:System.exit(0);
				
				default:System.out.println("Enter the valid choice");
			}
		
		}
	}
}