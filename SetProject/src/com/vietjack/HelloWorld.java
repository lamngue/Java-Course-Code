package com.vietjack;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
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
		/*Set<String> set1 = new HashSet<String>();*/ //in Random
		Set<String> set1 = new HashSet<String>(); //in theo thu tu
		// ko the them phan tu giong nhau
		set1.add("dog");
		set1.add("cat");
		set1.add("elephant");
		set1.add("pig");
		System.out.println(set1);
		set1.add("cat");
		/*System.out.println(set1);
		for(String element:set1) {
			System.out.println(element);
		}*/
		Set<Student> studentList = new TreeSet<Student>();
		studentList.add(new Student(1,23,"Ken"));
		studentList.add(new Student(2,20,"Hoa"));
		studentList.add(new Student(3,21,"Ken"));
		studentList.add(new Student(4,21,"Thong"));
		for(Student student:studentList) {
			System.out.println(student);
		}
		if(set1.contains("ant")) {
			System.out.println("set 1 contains ant");
		}
		if(set1.contains("cat")) {
			System.out.println("set 1 contains cat");
		}
		Set<String> set3 = new HashSet<String>(); 
		set3.add("dog");
		set3.add("cat");
		set3.add("ant");
		set3.add("cow");
		//clone set1
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println(intersection);
		//intersection.retainAll(set3); // lay giao cua set1 va set3
		intersection.removeAll(set3); // lay nhung gi thuoc set3 tu set1
		System.out.println(intersection);
	}

}
