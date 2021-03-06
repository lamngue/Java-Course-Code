package com.vietjack;

import java.util.HashSet;
import java.util.Set;

class Student{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
/*		result = prime * result + ((name == null) ? 0 : name.hashCode());*/
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
/*		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;*/
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class HelloWorldequalProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student(1,"An");
		Student st2 = new Student(1,"An");
		Student st3 = new Student(1,"Bao");
		if(st1.equals(st2)) {
			System.out.println("st1 equals st2");
		}else {
			System.out.println("st1 not equals st2");
		}
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(st1);
		studentSet.add(st2);
		studentSet.add(st3);
		for(Student student:studentSet) {
			System.out.println(student);
		}
		System.out.println("--------------------");
		if(st1.equals(st3)) {
			System.out.println("st1 equals st3");
		}else {
			System.out.println("st1 not equals st3");
		}
		String s1 = new String("Hello");
		String s2 = new String("Hello"); 
		String s7 = new String("heLlo");
		if(s1 == s2) { //so sanh vung nho, ko bao h bang nhau khi tao moi bang "new"
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		if(s1.equalsIgnoreCase(s7)) { //so sanh ve gia tri, ko bao h bang nhau khi tao moi bang "new"
			System.out.println("s1 equals s7");
		}else {
			System.out.println("s1 != s2");
		}
		String s3 = new String("Hello");
		String s4 = s3;
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		//String pool
		String s5="Hello";
		String s6 = "Hello";
		if(s5 == s6) {
			System.out.println("s5 == s6");
		}else {
			System.out.println("s5 != s6");
		}
	}

}
