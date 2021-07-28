import java.util.*;
class employee
{
	String pan;
	String name;
	double taxincome, tax;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pan number: ");
		pan=sc.next();
		System.out.println("Enter your name :");
		name=sc.next();
		System.out.println("Enter your taxincome : ");
		taxincome=sc.nextDouble();
		
	}
	void calc()
	{
		if(taxincome<=100000)
			tax=0;
		else if (taxincome<=150000)
			tax = taxincome*10/100;
		else if (taxincome<=250000)
			tax = 5000+(taxincome*20/100);
		else
			tax = 25000+(taxincome*30/100);
	} 
	void display()
	{
		System.out.println("Pan Number \t Name \t Tax_income \t Tax");
		System.out.println(pan +"\t"+ name+"\t"+taxincome+"\t"+tax);
	}
	
	public static void main(String args[])
	{
		employee ep = new employee();
		ep.input();
		ep.calc();
		ep.display();
	}
}