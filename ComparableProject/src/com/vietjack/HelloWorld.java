package com.vietjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private long id;
	private int age;
	private String name;
	public long getId() {
		return id;
	}
	public Student(long id,int age,String name) {
		super();
		// TODO Auto-generated constructor stub
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student arg0) {
		if(this.age == arg0.getAge()) {
			return 0;
		}else if(this.age > arg0.getAge()) {
			return -1;
		}else {
			return 1;
		}
		//return this.age - arg0.getAge(); 
	}
	
}
public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1,23,"Ken"));
		studentList.add(new Student(2,20,"Hoa"));
		studentList.add(new Student(3,21,"Ken"));
		studentList.add(new Student(4,21,"Thong"));
		//chi sort dc khi viet compareTo
		Collections.sort(studentList);
		for(Student student:studentList) {
			System.out.println(student);
		}
	}

}
