package tuesdayOzzy;

import java.util.function.Predicate;

public class Test {

public static void main(String[] args) {
	Predicate<Integer> pred =(p)-> p%2==0?true:false;
	System.out.println(pred.test(10));
	
	
	
}





}
