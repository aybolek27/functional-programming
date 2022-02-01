import java.util.Scanner;

public class Strings2 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String A = sc.next();
	String B = sc.next();
	
	int sum = A.length() + B.length();
	System.out.println(sum);
	
	System.out.println(A.compareTo(B));
	if (A.compareTo(B) < 0||A.compareTo(B)==0)
		System.out.println("No");
	else if (A.compareTo(B) > 0)
		System.out.println("Yes");

	
	System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
	
	

	
	
}

}
