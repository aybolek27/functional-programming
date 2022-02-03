import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {


public static void main(String[] args) {
	
	///Creating stream from Array
	String[] courses={"Java", "JS", "TS"};
	Stream<String> courseStream= Arrays.stream(courses);
	
	////Creating Stream from Collection
	List<String> courseList=Arrays.asList("Java", "JS", "TS");
	Stream<String> courseStream2=courseList.stream();
	
	
	List<Courses> myCourses=Arrays.asList(new Courses("Java", 100),
										  new Courses("DS", 435),
										  new Courses("Microservice", 200),
										  new Courses("Spring", 125)
	
	);
	
	Stream<Courses> myCourseStream = myCourses.stream();
	
	
	///Creating stream from Values
	//Stream<Integer> stream=Stream.of(3,5,6,7,3,7,98);
	
	

}
}
