import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {

public static void main(String[] args) {
	
	
	//Print all dish's name that has less than 400 calories
	System.out.println("****************************************");
	DishData.getAll().stream()
			.filter(dish -> dish.getCalories() <400)
			.map(Dish::getName)
			.forEach(System.out::println);
	
	//Print all dish's name and calories that has less than 400 calories
	System.out.println("****************************************");
	DishData.getAll().stream()
			.filter(dish -> dish.getCalories() <400)
			.map(Dish -> Dish.getName()+"---"+Dish.getCalories())
			.forEach(System.out::println);
	
	
	//Print the length of the name of each dish
	System.out.println("****************************************");
	DishData.getAll().stream()
			.map(Dish::getName)
			.map(String::length)
			.forEach(System.out::println);
	
	
	//Print Three High Caloric Dish Name(>300)
	System.out.println("****************************************");
	DishData.getAll().stream()
			.filter(dish -> dish.getCalories() >400)
			.map(Dish::getName)
			.limit(3)
			.forEach(System.out::println);
	
	//Print all dish name that are below 400 Calories in sorted
	System.out.println("****************************************");
	DishData.getAll().stream()
			.filter(dish -> dish.getCalories() <400)
			.sorted(comparing(Dish::getCalories))
			.map(Dish::getName)
			.forEach(System.out::println);
	
	
	//Print all dish name that are below 400 Calories in descending order
	System.out.println("****************************************");
	DishData.getAll().stream()
			.filter(dish -> dish.getCalories() <400)
			.sorted(comparing(Dish::getCalories).reversed())
			.map(Dish::getName)
			.forEach(System.out::println);
	
	
	
	}
}
