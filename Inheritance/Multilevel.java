//MultiLevel Inheritance

class Morning{
	public Morning()
	{
		
		System.out.println("\t\tMorning\nWaking up\nBrushing\nTaking bath\nBreakFast");
	}
}
class AfterNoon extends Morning{
	public AfterNoon()
	{
		System.out.println("\t\tAfternoon\nWorking\nLunch\nNap");
	}
}
class Night extends AfterNoon{
	public Night()
	{
		System.out.println("\t\tNight\nWorking\ncoffee\ngetting home\ndinner\nsleep");
	}
}

public class Routine{
	public static void main(String args[])
	{
		Night day1= new Night();
	}
}
