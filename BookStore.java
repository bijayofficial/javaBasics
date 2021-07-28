import java.util.*;
class BookStore
{
	String book_name, author, publication;
	double cost;
	double discount=13.5;
	
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the book : ");
		book_name = sc.next();
		System.out.println("Enter the name of the author : ");
		author = sc.next();
		System.out.println("Enter the publication : ");
		publication = sc.next();
		System.out.println("Enter the cost of the book : ");
		cost=sc.nextDouble();
		 
	}
	void Calculate()
	{
		cost=cost-(cost*discount/100);
	}
	void display()
	{
		System.out.println(" the name of the book : "+book_name);
		System.out.println("the name of the author : "+author);
		System.out.println("the publication : "+publication);
		System.out.println("the cost of the book : "+cost);
	}
	public static void main(String args[])
	{
		BookStore bs=new BookStore();
		bs.accept();
		bs.Calculate();
		bs.display();
	}
}