import java.util.Scanner;

public class StringTrick {

public static void main(String[] args) {
	int i = 4;
	double d = 4.0;
	String s = "HackerRank ";
	
	Scanner scan = new Scanner(System.in);
	
	/* Declare second integer, double, and String variables. */
	int a;
	double b;
	String str="";
	a=scan.nextInt();
	b=scan.nextDouble();
	scan.nextLine();
	str=scan.nextLine();
	
	System.out.println(a+i);
	System.out.println(b+d);
	System.out.println(s+str);
	
	/* Print the sum of both integer variables on a new line. */
	
	/* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
	
	scan.close();
}
}
