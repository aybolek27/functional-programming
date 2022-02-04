import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {


public static void main(String[] args) {
	
	//with initial value=0;
	System.out.println("*********************************");
	List<Integer> numbers= Arrays.asList(4, 5, 3, 9);
	int result=numbers.stream().reduce(0,(a,b)-> a+b);
	System.out.println(result);
	
	System.out.println("*********************************");
	//No initial value
	Optional<Integer> result2=numbers.stream().reduce((a, b)-> a+b);
	System.out.println(result2.get());
	
	//getting minimum
	System.out.println("*********************************");
	Optional<Integer> min=numbers.stream().reduce(Integer::min);
	System.out.println(min.get());
	
	//getting maximum
	System.out.println("*********************************");
	Optional<Integer> max=numbers.stream().reduce(Integer::max);
	System.out.println(max.get());
	
	///getting sum
	System.out.println("*********************************");
	Optional<Integer> sum=numbers.stream().reduce(Integer::sum);
	System.out.println(sum.get());
	
	//Task
	System.out.println("*********************************");
	int total=DishData.getAll().stream()
			.map(d -> 1).reduce(0, (a,b)-> a+b);
	System.out.println("Total dish count " + total);
	
	
	long dCount=DishData.getAll().stream().count();
	System.out.println("Total dish count with count method " + dCount);
	
	
}
}
