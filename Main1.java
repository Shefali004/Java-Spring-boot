package Calculator_main;
import java.util.*;
public class Main1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter values of a and b:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Calculator c =	new Calculator();
	c.add(a,b);
	c.sub(a,b);
	c.mul(a,b);
	c.div(a,b);
	
}
}
