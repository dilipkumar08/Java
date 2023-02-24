package Day1;
import java.util.Scanner;
public class p7 {

	public static void main(String[] args) {
		System.out.println("Grades");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your mark:");
		int mark= sc.nextInt();
		int percent=mark/10;
		System.out.println(percent);
		switch(percent)
		{
		case 4:
			System.out.println("E Grade");
			break;
		case 5:
			System.out.println("D Grade");
			break;
		case 6:
			System.out.println("C Grade");
			break;
		case 7:
			System.out.println("B Grade");
			break;
		case 8:
			System.out.println("A Grade");
			break;
		case 9:
			System.out.println("S Grade");
			break;
		case 10:
			System.out.println("WOAHHHHHHHHHH");
			break;
		default:
			System.out.println("Reappear");
			
			
		}

	}

}
