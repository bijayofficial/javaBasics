import java.util.*;
class Parent
{
  int Parent_Data;
 
  public Parent()
  {
    System.out.println("\n BASE CLASS CONSTRUCTOR INVOKED.\n");
    Parent_Data=10;
  }

  public void setValue(int b)
  {
    Parent_Data+=b;
  }

  public void getValue()
  {
    System.out.println("\nParent_Data incermented by 10 ="+Parent_Data);
  }
}

class inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parent b1 = new Parent();
		int k = sc.nextInt();
		b1.setValue(k);
		b1.getValue();
	}
}