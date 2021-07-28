import java.util.*;

class Dog{
	 
	String name;
	public static void main(String[] args) {
	
		Dog dg1= new Dog();
		dg1.bark();
		dg1.name = "Pinki";

		// this is the dog array

		Dog[] myDog = new Dog[3];
		myDog[0] = new Dog();
		myDog[1] = new Dog();
		myDog[2] = dg1;

		// Access the dogs using array

		myDog[0].name = "Finance Dept.";
		myDog[1].name = "Market Dept.";

		System.out.println("First Dog's name is " + myDog[0]);
		System.out.println("Second Dog's name is " + myDog[1]);
		System.out.println("Last Dog's name is " + myDog[2]);


		// bark methods
		int x=0;
		while(x<myDog.length)
		{
			myDog[x].bark();
			x++;

		}
	}

	//Access_Specifier  returnType method_name
	public void bark()
	{
		System.out.println(name + "Vuuuuuuuu");
	}
}