import java.util.*;
class GoodDog{
	private int size;
	public int getSize(){
		return size;
	}
	
	public void setSize( int s){
		size=s;
		}
	
	void bark()
	{
		if(size>60){
			System.out.println("Woof! Woof! ");
		}
		else if (size>14){
			System.out.println("Ruff! Ruff! ");
		}
		else{
			System.out.println("Yip! Yip! ");
		}
	}
}
class GoodDogTestDrive{
	public static void main(String args[])
	{
		
		GoodDog gd1 = new GoodDog();
		GoodDog gd2 = new GoodDog();
		gd1.setSize(70);
		System.out.println("the size of dog one is : "+ gd1.getSize());
		gd2.setSize(12);
		System.out.println("the size of dog two is : "+ gd2.getSize());
		gd1.bark();
		gd2.bark();
	}
}