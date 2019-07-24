import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		int num;
		int sum=0;
		int num1;
		int rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		num = sc.nextInt();
		num1 = num;
		while(num1 > 0)
		{
		rem = num1 % 10;
		sum = (sum * 10) + rem;
		num1 = num1 / 10;
		}
		if(num == sum)
			{
				System.out.println("Your given number is Palindrome Number.");
			}
		else
			{
				System.out.println("Your given number is not Palindrome Number");
			}
	}

}
//
