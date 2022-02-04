import java.util.Optional;

public class MatchingAndFinding {


public static void main(String[] args) {
	
	//All Match
	System.out.println("***************************************************");
	boolean isHealthy =DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
	System.out.println(isHealthy);
	
	///Any Match
	System.out.println("***************************************************");
	 if(DishData.getAll().stream().anyMatch(dish -> dish.isVegetarian()))
	System.out.println("The menu is vegetarian friendly");
	
	
	///None Match
	System.out.println("***************************************************");
	boolean isHealthy2=DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>1000);
		System.out.println(isHealthy2);
	
	///Find Any
	System.out.println("***************************************************");
	Optional<Dish>  dish=DishData.getAll().stream()
			.filter(Dish::isVegetarian)
			.findAny();
	System.out.println(dish.get());
	
	///Find First
	System.out.println("***************************************************");
	Optional<Dish>  dish2=DishData.getAll().stream()
			.filter(Dish::isVegetarian)
			.findFirst();
	
	System.out.println(dish.get());
	

	
	
	
}



}
