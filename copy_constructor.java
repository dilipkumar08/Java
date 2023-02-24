package Day1;

public class p12{
	private int a;
	private int b;
	public p12(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public p12(p12 d)
	{
		a=d.a;
		b=d.b;
	}
	
	public static void main(String[] args)
	{
		p12 s1=new p12(10,20);
		p12 s2=new p12(s1);
		System.out.println(s1.a);
		System.out.println(s2.a);
		
		
	}

}
