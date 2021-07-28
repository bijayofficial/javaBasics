class Constructor
{
	String name;
	int salary;
	void Setvalue(String n,int sal)
	{
     name=n;
     salary=sal;
	}
	void Setvalue(String n)
	{
     name=n;
	}
	Constructor()
	{
   name=" ";
   salary=0;
	}
	Constructor(String n)
	{
		name=n;
	}
	Constructor(String n,int sal)
	{
		name=n;
		salary=sal;
	}
	void getvalue()
	{
		System.out.println(name+" "+salary);
	}
public static void main(String[] args)
{
	Constructor obj1=new Constructor();
	Constructor obj2=new Constructor("Bijay Ghosh");
	Constructor obj3=new Constructor("BIJAY GHOSH",8000);
	System.out.println("\n  CREATING OBJECTS WITH CONSTRUCTORS");

	obj1.Setvalue("Salman Khan",9000);
	obj2.Setvalue("Priyanka Chopra",5000);
	obj3.Setvalue("Dangal",10000);
	System.out.println("\n AFTER SETTING THE VALUE OF OBJECTS WITH METHODS");
    obj1.getvalue();
	obj2.getvalue();
	obj3.getvalue();
}
}

