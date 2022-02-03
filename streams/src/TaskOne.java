import java.util.Arrays;
import java.util.List;

public class TaskOne {

public static void main(String[] args) {
	
	List<String> words= Arrays.asList("JAVA","APPLE", "HONDA");
	
	words.stream().map(i-> i.length()).forEach(System.out::print);
	
}
}
