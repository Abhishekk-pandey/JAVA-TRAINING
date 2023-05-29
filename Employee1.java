
    public class Employee1{
	String name;
	int year;
	String address;
	
     Employee1(String k,int m,String l)
	{
		name=k;
		year=m;
		address=l;
	}
	public void display()
	{
		System.out.println(name+" "+year+" "+" "+address);
	}



    public static void main(String[] args) {
		Employee1 e = new Employee1("Robert",1994,"64-c Wall Street");
		Employee1 e1 = new Employee1("Sam",2000,"68-D Wall Street");
		Employee1 e2= new Employee1("John",1999,"26-B Wall Street");
		
		e.display();
		e1.display();
		e2.display();
    }

 }

