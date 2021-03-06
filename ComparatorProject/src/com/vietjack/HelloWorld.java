package com.vietjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student{
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
	
}
class StringLengthOrderComparator implements Comparator<String>{
	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg0.length()-arg1.length();
	}
	
}
class AgeReverseComparator implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return -(arg0.getAge()-arg1.getAge());
	}
	
}
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<String>();
		animals.add("cow");
		animals.add("penguin");
		animals.add("elephant");
		animals.add("pig");
		for(String animal:animals) {
			System.out.println(animal);
		}
		System.out.println("------------");
		Collections.sort(animals, new StringLengthOrderComparator());
		for(String animal:animals) {
			System.out.println(animal);
		}
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(50);
		numbers.add(40);
		numbers.add(30);
		numbers.add(70);
		//sort kieu ngc lai (so to nhat tren dau)
		Collections.sort(numbers,new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return -(arg0-arg1);
			}
			
		});
		for(Integer number:numbers) {
			System.out.println(number);
		}
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1,23,"Ken"));
		studentList.add(new Student(2,20,"Hoa"));
		studentList.add(new Student(3,21,"Ken"));
		studentList.add(new Student(4,21,"Thong"));
/*		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				return arg0.getAge()-arg1.getAge();
			}	
		});*/
		Collections.sort(studentList,new AgeReverseComparator());
			for(Student student:studentList) {
				System.out.println(student);
			}
	}
}
