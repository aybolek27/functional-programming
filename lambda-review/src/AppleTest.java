import java.util.ArrayList;
import java.util.List;

public class AppleTest {


public static void main(String[] args) {
	
	
	List<Apple> inventory=new ArrayList<>();
	
	inventory.add(new Apple(300,Color.GREEN));
	inventory.add(new Apple(154,Color.RED));
	inventory.add(new Apple(218,Color.GREEN));
	inventory.add(new Apple(157,Color.RED));
	inventory.add(new Apple(287,Color.GREEN));
	inventory.add(new Apple(50,Color.RED));
	inventory.add(new Apple(70,Color.GREEN));
	
	//List<Apple> heavyApple=filterApples(inventory, new AppleHeavyPredicate());
	//System.out.println(heavyApple);
	
	List<Apple> greenApple=filterApples(inventory, new AppleGreenColorPredicate());
	System.out.println(greenApple);
	
	
	}

	private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
		
		List<Apple> result=new ArrayList<>();
		
		for (Apple apple: inventory) {
			
			if(applePredicate.test(apple)){
				result.add(apple);
				
			}
			
		}
return result;
			}
	
	
}
