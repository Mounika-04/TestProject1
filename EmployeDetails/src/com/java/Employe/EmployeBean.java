package com.java.Employe;

public class EmployeBean {
 private int id;
 private String name;
 private String grade;
 

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return "EmployeBean [id=" + id + ", name=" + name + ", grade=" + grade + "]";
}

 
}
