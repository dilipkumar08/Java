package Day4;
class boom
{
	private static int w=0;
	public static int z=20;
	public static int sum(int a ,int b)
	{
		
		w=10;
		return z+a+b+w;
	}
	int sub(int a,int b)
	{
		return a-b-w;
	}
}
public class Static {
	public static void main(String args[])
	{
		int res=boom.sum(1, 2);
		System.out.println(res+boom.z);
	}
}
