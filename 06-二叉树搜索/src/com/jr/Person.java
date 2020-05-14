package com.jr;

public class Person implements Comparable<Person> {
	
	Integer age;
	
	private Integer height;
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	private String name;

	public Person(int age, int height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	public Person(int age) {
		this.age = age;
		this.height = 0;
		this.name = "aaa";
	}

	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		return this.age.compareTo(o.age);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.age + "";
	}
}
