package tasks;

import java.util.List;

public class State {


private String name;
private List<String> cities;


public State() {

}

public List<String> getCities(){
	return this.cities;
}

public void addCity(String city){
	cities.add(city);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void setCities(List<String> cities) {
	this.cities = cities;
}

@Override
public String toString() {
	return "State{" +
			       "name='" + name + '\'' +
			       ", cities=" + cities +
			       '}';
}
}
