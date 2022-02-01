package functionalInterfaces;

import java.util.function.*;

public class Example {

public static void main(String[] args) {
	
//	Predicate<Integer> lesserThan=new Predicate<Integer>() {
//
//		@Override
//		public boolean test(Integer a) {
//			return integer<18;
//		}}; we have overwritten above method with lambda
	
	//==========Predicate===================
	Predicate<Integer> lesserThan = a -> a<18; //Implementation of test method that belongs to Predicate interface
	Boolean result = lesserThan.test(5);
	System.out.println(result);
	
	//==========Consumer===================
	Consumer<Integer> display= i -> System.out.println(i);
	display.accept(50);
	
	//==========BiConsumer===================
	
	BiConsumer<Integer, Integer> addTwo= (i, a) -> System.out.println(i+a);
	addTwo.accept(50,10);
	
	//==========Function===================
	Function<String, String> fun= s -> "Hello " +s;
	System.out.println(fun.apply("Aybolek"));
	
	//==========SUPPLIER===================
	Supplier<Double> randomValue= ()-> Math.random();
	System.out.println(randomValue.get());
	}
}
