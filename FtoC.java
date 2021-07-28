// farenhite to celcious 


import java.util.Scanner; // java utilities libraries , scanner is a CLASS of util Package 
class FtoC
{ public static void main(String arg[])	
	{
	    double a,c;
        Scanner sc=new Scanner(System.in);	 // scanf()

	    System.out.println("Enter  Fahrenheit temperature");
        // code for input
        a=sc.nextDouble();
	    FtoC fah=new FtoC( );
	    double result = fah.celsius(a);	
	    System.out.println("Celsius temperature is = "+result);	  	  	     
	} 
	

	double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
		
}