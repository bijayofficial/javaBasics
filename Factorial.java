import java.util.*;
public class Factorial{
	Scanner sc = new Scanner(System.in);
	int x;
	void input() //method1
	{
		x = sc.nextInt();
	}
	void output()  // method2
	{
		int i, fact1 =1;
		for(i =1; i<=x;i++)
		{
			fact1=fact1*i;
		}
		System.out.println("The factorial of "+x+" is= "+fact1);
	}
	public static void main(String args[])
	{
		Factorial obj = new Factorial();
		obj.input();
		obj.output();
	}
}