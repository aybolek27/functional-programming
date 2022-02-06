import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

public static void main(String[] args) {
	List<Integer> numbers= Arrays.asList(3,5,6,6,7,8,89,2);
	
	//empty()  -  isPresent()
	
	Optional<String> empty=Optional.empty();
	System.out.println(empty.isEmpty());
	System.out.println(Optional.of(numbers).isPresent());
	
	//ifPresent
	Optional<Integer> bigNumber=numbers.stream().filter(x->x>100).findAny();
	bigNumber.ifPresent(System.out::println);
	
	//get -- throwing an exception no such element
	//System.out.println(bigNumber.get());
	
	//orElse
	System.out.println(bigNumber.orElse(0));
	
	
	
}
}
