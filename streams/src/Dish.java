import java.util.Objects;

public class Dish {

private String name;
private boolean vegetarian;
private Integer calories;
private Type type;

public Dish(String name, boolean vegetarian, Integer calories, Type type) {
	this.name = name;
	this.vegetarian = vegetarian;
	this.calories = calories;
	this.type = type;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isVegetarian() {
	return vegetarian;
}

public void setVegetarian(boolean vegetarian) {
	this.vegetarian = vegetarian;
}

@Override
public String toString() {
	return "Dish{" +
			       "name='" + name + '\'' +
			       ", vegetarian=" + vegetarian +
			       ", calories=" + calories +
			       ", type=" + type +
			       '}';
}

public Integer getCalories() {
	return calories;
}

public void setCalories(Integer calories) {
	this.calories = calories;
}

public Type getType() {
	return type;
}

public void setType(Type type) {
	this.type = type;
}
}
