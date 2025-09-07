package com.studentapp.model;

public class Student {
	private int id;
	private String name;
	private String email;
	private int age;
	
	//Constructor with ID (for new students)
public Student(String name, String email, int age) {
	 this.name=name;
	 this.email=email;
	 this.age=age;
	}
 
    //Constructor without ID (for existing students)
 public Student(int id, String name, String email, int age) {
	 this.id=id;
	 this.name=name;
	 this.email=email;
	 this.age=age;
 }

     //Getters
 public int getId() {
	 return id;
 }
 public String getName() {
	 return name;
 }
 public String getEmail() {
	 return email;
 }
 public int getAge() {
	 return age;
 }
     
     //Setters
 public void setId(int id) {
	 this.id=id;
 }
 public void setName(String name) {
	 this.name=name;
 }
 public void setEmail(String email) {
	 this.email=email;
 }
 public void setAge(int age) {
	 this.age=age;
 }
     // for easy printing
 @Override
 public String toString() {
	 return "Student{"+
             "id="+id +
             ",name='" + name + '\'' +
             ",email=" + email + '\'' +
             ", age=" + age +
             '}';
             
            
 }
 }
