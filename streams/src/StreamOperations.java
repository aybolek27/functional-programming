import java.util.Arrays;
import java.util.List;

public class StreamOperations {


public static void main(String[] args) {

	List<Integer> myList= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
	
	myList.forEach(x-> System.out.print(x+" "));
	
	///Filter
	myList.stream().filter(i-> i%3==0).forEach(System.out::print);
	System.out.println();
	
	myList.stream().filter(i-> i%3==0).distinct().forEach(System.out::print);
	
	System.out.println();
	
	//LIMIT
	myList.stream()
			.filter(i-> i%3==0)
			.limit(3)
			.forEach(System.out::print);
	
	System.out.println();
	
	
	//SKIP
	myList.stream()
			.filter(i-> i%3==0)
			.skip(2)
			.forEach(System.out::print);
	System.out.println();
	
	//MAP
	myList.stream()
			.map(i-> i*2)
			.filter(i -> i%3==0)
			.forEach(System.out::print);
	System.out.println();
	
	//MAP
	myList.stream()
			.map(i-> i*2)
			.forEach(System.out::print);
	
	
}
}
