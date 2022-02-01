import java.util.HashSet;
import java.util.Set;

public class SetReview {


public static void main(String[] args) {
	// 1. create a set
	Set<Student> mySet= new HashSet<>();
	
	// 2. add element
	
	mySet.add(new Student(1, "Jose"));
	mySet.add(new Student(2, "Sayed"));
	mySet.add(new Student(3, "Nick"));
	mySet.add(new Student(4, "Ronnie"));
	mySet.add(new Student(4, "Ronnie"));
	
	System.out.println(mySet);
	
	Set<Integer> numSet=new HashSet<>();
	
	//numSet.add(1);
	
	//numSet.add(2);
	//System.out.println(numSet);
	//System.out.println(numSet.add(2));
	
	//System.out.println(numSet.add(3));
	//System.out.println(numSet.add(4));
	
	//System.out.println(numSet);
	String str="Java developer";
	System.out.println("The first repeating character is: "+findFirstRepeatingCharacter(str));
}


		public static Character findFirstRepeatingCharacter(String str){
			//Create a HashSet
			Set<Character> chars=new HashSet<>();
			//Iteration return ch if add return false
			
			for(Character ch: str.toCharArray()) {
				if (!chars.add(ch))
					return ch;
			}
	return null	;
	}
}
