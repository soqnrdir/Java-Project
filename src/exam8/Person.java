package exam8;

import kim.chopper.MyArrays;

public class Person implements Comparable<Person> {
	private String name;
	private double height;
	
	public Person() {
	}
	public Person(String name, double height) {
	  this.name = name;
	  this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public static String getTallest(Person[] people) {
		int name = MyArrays.getMaximum(people);
		return people[name].getName();
	}	
	
	@Override
	public String toString() {
		return "이름: " + name + ", 키: " + String.format("%.1f",height);
	}
	@Override
	public int compareTo(Person o) {
		//return name.compareTo(o.getName()); //이름 내림차순
		if (height > o.height) {
			return 1;
		} else if (height == o.height) {
			return 0;
		} else {
			return -1;
		}
		
	}
	
}
