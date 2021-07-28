import java.util.*;

class FruitJuice
{
	int product_code, pack_size, product_price;
	String flavor, pack_type;
	
	FruitJuice()
	{
		product_code=0;
		pack_size=0;
		product_price=0;
		flavor="";
		pack_type="";
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product code");
		product_code=sc.nextInt();
		System.out.println("Enter the flavor of the product : ");
		flavor=sc.next();
		System.out.println("Enter the pack_type of the product : ");
		pack_type=sc.next();
		System.out.println("Enter the pack size : ");
		pack_size=sc.nextInt();
		System.out.println("Enter the product_price : ");
		product_price=sc.nextInt();
	}
	void discount()
	{
		product_price=product_price-10;
	}
	void display()
	{
		System.out.println("the product code "+product_code);
		System.out.println("flavor of the product :"+flavor);
		System.out.println("pack_type of the product : "+pack_type);
		System.out.println("the pack size : "+pack_size);
		System.out.println("the product_price : "+product_price);
		
	}
	public static void main(String args[])
	{
		FruitJuice fj=new FruitJuice();
		fj.input();
		fj.discount();
		fj.display();
	}
}