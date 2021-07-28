import java.util.*;
class ElectricBill
{	
String n;
int unit;
double bill;
void Accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of the customer");
	n=sc.next();
	System.out.println("Enter the units of electricity");
	unit=sc.nextInt();
}
void Calculate()
{
	if(unit<=100)
		bill = unit*2.00;
	else if (unit<=300)
		bill = unit*2.00;
	else
		bill = unit*5.00;
}

void Display()
{
	System.out.println("Name of the customer is : "+n);
	System.out.println("Number of unit consumed is: "+unit);
	System.out.println("Bill amount is : "+bill);
}
	public static void main(String args[])
	{
		ElectricBill eb= new ElectricBill();
		eb.Accept();
		eb.Calculate();
		eb.Display();
	}
}