import java.util.*;

class AreaOfCircle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//float r, area; 

		System.out.println(" Enter the radious of the circle : ");
		float r = sc.nextFloat();

		double area  = (22/7)*r*r;

		System.out.println("The area of the circle with radious - " +r+  " is = "+area);
	}
}