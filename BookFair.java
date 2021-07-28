import java.util.*;
class BookFair
{
	String Bname;
	double price;
	BookFair()
	{
		Bname="\0";
		price=0;
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the book: ");
		Bname=sc.next();
		System.out.println("Enter the price of the book: ");
		price=sc.nextFloat();
		
	}
	void calculate()
	{
		if(price<=1000)
			price=price-(price*2/100);
		else if(price<=3000)
			price=price-(price*10/100);
		else
			price=price-(price*15/100);
		
	}
	void Display()
	{
		System.out.println("the name of this book is : "+Bname);
		System.out.println("the price of this book is : "+price);
	}
public static void main(String args[])
{	
	 BookFair bf = new BookFair();
	 bf.input();
	 bf.calculate();
	 bf.Display();
}
}
