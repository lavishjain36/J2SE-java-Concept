package com.encapsulation.college;

public class Student {
	private String name;
	private int age;
	private String city;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	//string representation of your data.
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public static void main(String[] args) {
	
		Student st1=new Student();
		st1.setName("Magesh");
		st1.setAge(25);
		st1.setCity("Delhi");

		
		Student st2=new Student();
		st2.setName("Lavish");
		st2.setAge(37);
		st2.setCity("Pune");
		
		System.out.println(st1.getName());
		System.out.println(st1.getCity());
		System.out.println(st1.getAge());



		System.out.println(st1.toString());
		System.out.println(st2.toString());

		Student std=new Student();
		}
}
