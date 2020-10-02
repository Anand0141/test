import java.util.Scanner;
public class sample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		int a=sc.nextInt();
		System.out.print("Enter any number:");
		int b=sc.nextInt();
		System.out.println("1.addition");
		System.out.println("2.subraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.print("Enter your chioice:");
		int ch=sc.nextInt();
		if(ch>=1 && ch<=4)
		{
			switch(ch)
			{
			case 1: int c=a+b;
					System.out.println("sum is:"+c);
					break;
			case 2: int d=a-b;
					System.out.println("sub is:"+d);
					break;
			case 3: int e=a*b;
					System.out.println("mul is:"+e);
					break;
			case 4: int f=a/b;
					System.out.println("div is:"+f);
					break;
					
			}
		}
	}

}
			