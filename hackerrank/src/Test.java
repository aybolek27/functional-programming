import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {



public static String getSmallestAndLargest(String s, int k) {
	String smallest = "";
	String largest = "";
	
	// Complete the function
	// 'smallest' must be the lexicographically smallest substring of length 'k'
	// 'largest' must be the lexicographically largest substring of length 'k'
	//List<String> result= new ArrayList<>();
	
//	String element;
	int count=0;
	for (int i=0; i<s.length()&&k<=s.length(); i++){
		//element=s.substring(i,k);
		//result[i]=s.substring(i,k);
		count++;
		k++;
		
	}
	
	
	//System.out.println(result.length);
	System.out.println(count);
	
	String[] result = new String[count];
	String element;
	for (int j=0; j<s.length()&&k<=s.length(); j++){
		element=s.substring(j,k);
		result[j]=element;
		k++;
		
	}
	
	
	
	largest=result[0];
//	System.out.println(largest);
//	for (int i=1; i< result.length-1;i++){
//		System.out.println(largest.compareTo(result[i])<0);
//		if (largest.compareTo(result[i])<0){
//		largest= result[i];
//			System.out.println(largest);
//
//		}
//
//	}
//
//	smallest=result[0];
//	System.out.println(smallest);
//	for (int i=1; i< result.length-1;i++){
//		System.out.println(smallest.compareTo(result[i])>0);
//		if (smallest.compareTo(result[i])>0){
//			smallest= result[i];
//			System.out.println(smallest);
//
//		}
//
//	}
//
	
	return smallest + "\n" + largest;
}


public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s = scan.next();
	int k = scan.nextInt();
	scan.close();
	
	System.out.println(getSmallestAndLargest(s, k));
}


}
