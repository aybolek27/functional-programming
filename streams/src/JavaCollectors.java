import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {


public static void main(String[] args) {
	
	List<Integer> numbers= Arrays.asList(3,4,5,6,7,6,8);
	
	//toCollection(supplier)
	
	System.out.println("***********************************************************");
	List<Integer> numberList=numbers.stream()
			.filter(x -> x%2==0)
			.collect(Collectors.toCollection(ArrayList::new));
	
	System.out.println(numberList);
	
	
	System.out.println("***********************************************************");
	Set<Integer> numberSet=numbers.stream()
			.filter(x -> x%2==0)
			.collect(Collectors.toCollection(HashSet::new));
	
	System.out.println(numberSet);
	
	//toList() : returns a Collector Interface that gathers the input data into new List
	System.out.println("***********************toList************************************");
	List<Integer> numberList2=numbers.stream()
			.filter(x -> x%2==0)
			.collect(Collectors.toList());
	
	System.out.println(numberList2);
	
	
	
	//toSet() : returns a Collector Interface that gathers the input data into new List
	System.out.println("**********************toSet*************************************");
	Set<Integer> numberList3=numbers.stream()
			.filter(x -> x%2==0)
			.collect(Collectors.toSet());
	
	System.out.println(numberList3);
	
	
	//toMap(Function, Function) : returns a Collector Interface that gathers the input data into new Map
	System.out.println("**********************toMap*************************************");
	Map<String, Integer> dishMap=DishData.getAll().stream()
		.collect(Collectors.toMap(Dish::getName, Dish::getCalories));
	System.out.println(dishMap);
	
	
	
	//counting() : returns a Collector that counts number of the elements
	System.out.println("**********************counting()*************************************");
	Long evenCount=numbers.stream()
			.filter(x -> x%2==0)
			.collect(Collectors.counting());
	
	System.out.println(evenCount);
	
	
	//summingInt(ToIntFunction) : returns a Collector that produces the sum of the
	System.out.println("**********************summingInt(ToIntFunction)*************************************");
	Integer sum=  DishData.getAll().stream()
			.collect(Collectors.summingInt(Dish::getCalories));
	
	System.out.println(sum);
	
	
	
	//averageInt(ToIntFunction) : returns the average of the integers passed
	System.out.println("**********************averageInt(ToIntFunction)*************************************");
	Double average=  DishData.getAll().stream()
			.collect(Collectors.averagingInt(Dish::getCalories));
	
	System.out.println(average);
	
	//joining() : is used to join various elements of the character or string array into a single string object
	System.out.println("**********************averageInt(ToIntFunction)*************************************");
	List<String> courses= Arrays.asList("Java","MS", "Java Script");
	String stringCourses=courses.stream()
			.collect(Collectors.joining(","));
	
	System.out.println(stringCourses);
	
	//partioningBy() : is used to partition a stream of object
	System.out.println("**********************partioningBy()*************************************");
	Map<Boolean, List<Dish>> veggieDish=DishData.getAll().stream()
			.collect(Collectors.partitioningBy(Dish::isVegetarian));
	
	System.out.println(veggieDish);
	
	//groupingBy() : is used by grouping
	System.out.println("**********************groupingBy*************************************");
	Map<Type, List<Dish>> groupedDishes= DishData.getAll().stream()
			.collect(Collectors.groupingBy(Dish::getType));
	System.out.println(groupedDishes);
	
	}

}
