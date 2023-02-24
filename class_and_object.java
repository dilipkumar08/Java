package Day1;

public class p3 {
	int rollno;
	int age;
	String name;
	p3(String n,int r,int a)
	{
		name=n;
		rollno=r;
		age=a;
	}
	void disp()
	{
		System.out.println("Name "+name);
		System.out.println("age "+age);
		System.out.println("Roll no "+r);
		}
	
	public static void main(String args[])
	{
		p3 id=new p3("Dilip",21,20);
		id.disp();
	}

}

