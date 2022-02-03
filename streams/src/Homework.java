import java.util.Arrays;
import java.util.List;

public class Homework {

public static void main(String[] args) {
	
	
	List<Dish> menu= Arrays.asList(new Dish("pork", false, 800, Type.MEAT),
			new Dish("beef", false, 700, Type.MEAT),
			new Dish("chicken", false, 400, Type.MEAT),
			new Dish("fries", true, 530, Type.OTHER),
			new Dish("rice", true, 350, Type.OTHER),
			new Dish("fruit", true, 120, Type.OTHER),
			new Dish("pizza", true, 550, Type.OTHER),
			new Dish("prawns", false, 300, Type.FISH),
			new Dish("salmon", false, 450, Type.FISH)
			);
	
	//All dishes that have less than 400 calories
	menu.stream().filter(i-> i.getCalories()<400).forEach(System.out::println);
	System.out.println();
	
	//Only names of the dishes that have less than 400 calories
	menu.stream().filter(i-> i.getCalories()<400).forEach(dish -> System.out.println(dish.getName()));
	System.out.println();
	//second way of getting name only
	menu.stream()
			.filter(dish -> dish.getCalories() < 400)
			.map(Dish::getName)
			.forEach(System.out::println);
	System.out.println();
	// task 1
	//print the length of the name of each dish
	//way1:
	menu.stream()
			.map(dish -> dish.getName().length())
			.forEach(System.out::print);
	System.out.println();
	//way2:
	menu.stream()
			.map(Dish::getName)
			.map(String::length)
			.forEach(System.out::print);
	
}
}
