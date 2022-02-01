package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {


public static void main(String[] args) {
	List<Orange> inventory= new ArrayList<>();
	
	inventory.add(new Orange(200, Color.GREEN));
	
	inventory.add(new Orange(156, Color.RED));
	inventory.add(new Orange(300, Color.GREEN));
	inventory.add(new Orange(675, Color.RED));
	inventory.add(new Orange(50, Color.GREEN));
	
	
	OrangeFormatter simpleFormatter=(Orange orange) -> "An orange of " + orange.getWeight() + " g";
	
	OrangeFormatter fancyFormatter=orange -> {
		
		String characteristic=orange.getWeight()>150?"Heavy":"Light";
		return "A " + characteristic + " " + orange.getColor() + " orange";
			};
	prettyPrintApple(inventory, simpleFormatter);
	
	System.out.println("=====================================");
	prettyPrintApple(inventory, fancyFormatter);
}

private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
	
	for (Orange orange: inventory) {
		String output =orangeFormatter.accept(orange);
		System.out.println(output);
		
		
		}
	
	
	}
}
