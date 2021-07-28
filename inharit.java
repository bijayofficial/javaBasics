import java.util.*;
class increment
{
	
	int x;
	public increment()
	{
		x=5;
	}
	void incre(int b)
	{
		x=x+b;
	}
	void print()
	{
		System.out.println(x);
	}
}
class add extends increment
{
	int y;
	public add()
	{
		y=6;
	}
	void incr(int a)
	{
		super.incre(b);
		y=y+a;
	}
	void print2()
	{
		System.out.println(y);
	}
}
public class inharit
{
	
	public static void main(String ty[])
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();

		add obj=new add();
		System.out.println("all values after creation and increament are :-");
		obj.print();
		obj.print2();

		obj.incr(a);
		System.out.println("values after adding:-");
		obj.print();
		obj.print2();

		obj.incre(b);
		System.out.println("values again after adding:-");
		obj.print();
		obj.print2();
   	}
}
