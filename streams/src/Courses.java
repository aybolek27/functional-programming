public class Courses {

private String name;


private Integer courseID;

public Courses(String name, Integer courseID) {
	this.name = name;
	this.courseID = courseID;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getCourseID() {
	return courseID;
}

public void setCourseID(Integer courseID) {
	this.courseID = courseID;
}
}
