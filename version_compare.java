public class Main 
{
public static void main(String[] args) 
{
String v1 = "1.02.003.4"; 
String v2 = "1.02.003.05"; 
String[] v1s = v1.split("\\."); 
String[] v2s = v2.split("\\."); 
int length = Math.max(v1s.length, v2s.length); 
for (int i = 0; i < length; i++) 
{ 
int num1 = i < v1s.length ? Integer.parseInt(v1s[i]) : 0;
int num2 = i < v2s.length ? Integer.parseInt(v2s[i]) : 0;
if (num1 > num2) 
{ 
System.out.println("v1 is greater than v2"); 
return;
} 
else if (num1 < num2) 
{ 
System.out.println("v1 is less than v2"); 
return; 
} 
} 
System.out.println("v1 is equal to v2"); 
} 
}
