class A
{
    {
        System.out.println(1);
    }
}
 class B extends A
{
    {
        System.out.println(2);
    }
}
 class C extends B
{
    {
        System.out.println(3);
    }
}
 
public class p2
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}

//---------------------------------------------

class A
{
    {
        System.out.println(1);
    }
}
 class B extends A
{
    {
        System.out.println(2);
    }
}
 class C extends B
{
    {
        System.out.println(3);
    }
}
 
public class p2
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}

//---------------------------------------------------------------
class X
{
    //Class X Members
}
 
class Y
{
    //Class Y Members
}
 
class Z extends X,Y
{
    //Class Z Members
}
//-------------------------------------------------------------------
class Ai
{
    String s = "Class A";
}
 
class Bi extends Ai
{
    String s = "Class B";
 
    {
        System.out.println(super.s);
    }
}
 
class Ci extends Bi
{
    String s = "Class C";
 
    {
        System.out.println(super.s);
    }
}
 
public class p5

{
	
    public static void main(String[] args)
    {
        Ci c = new Ci();
 
        System.out.println(c.s);
    }
}
//-----------------------------------------------------------
class A1
{
    static
    {
        System.out.println("THIRD");
    }
}
 
class B1 extends A1
{
    static
    {
        System.out.println("SECOND");
    }
}
 
class C1 extends B1
{
    static
    {
        System.out.println("FIRST");
    }
}
 
public class p6
{
    public static void main(String[] args)
    {
        C1 c = new C1();
    }
}
//----------------------------------------------------------------
class AA
{
    public AA()
    {
        System.out.println("Class A Constructor");
    }
}
 
class BB extends AA
{
    public BB()
    {
        System.out.println("Class B Constructor");
    }
}
 
class CC extends BB
{
    public CC()
    {
        System.out.println("Class C Constructor");
    }
}
 
public class p7
{
    public static void main(String[] args)
    {
        CC c = new CC();
    }
}
//------------------------------------------------------------

class XX
{
    static void staticMethod()
    {
        System.out.println("Class X");
    }
}
 
class YY extends XX
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }
}
 
public class p8
{
    public static void main(String[] args)
    {
        YY.staticMethod();
    }
}
//-------------------------------------------------------------------
package Inheritance;
class Xo
{
    public Xo( )
    {
        System.out.println(1);
    }
}
 
class Yo extends Xo
{
    public Yo()
    {
        System.out.println(2);
    }
}
public class p9
{
public static void main(String args[])
{
	Yo io =new Yo();
}
}
//--------------------------------------------------------
package Inheritance;


public class p11
{
    public p11()
    {
    	
        System.out.println(4);
        super();
 
        System.out.println(5);
    }
    public static void main(String args[])
    {
    	p11 oi =new p11();
    	
    }
    
}

//------------------------------------------------------------------
package Inheritance;

public class p12 {
	public p12(int i)
	    {
	 
	    }
	public static void main(String args[])
	{
		Boo ne=new Boo(1);
		
	}


	}
	 
class Boo extends p12
	{

	public Boo(int i) {
	
	}
	 
	}
	
