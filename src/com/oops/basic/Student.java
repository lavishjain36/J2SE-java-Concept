package com.oops.basic;


//Simple jav class with Student-Pascal case convention
public class Student {
	//variable->Has-part->variable/fields/data members/identifiers->Camelcase
	
	//instance variable->
  	int id;
    String name;
	int age;
	char gender;
	String address;
	static String company="Guvi";//static variable
	
	int accountnumber;
	
	public Student() {
		System.out.println("Deafult 0-argument constructor");
	}
	
	public Student(int id,String name,int age,char gender,String address) {
	 System.out.println("Parameterized constructor");
	  this.id=id;//101
	  this.name=name;//Swapnil
	  this.age=age;//38
	  this.gender=gender;//M
	  this.address=address;//Bengaluru
	}
	
	//Does part->Method-it is to write business logic->CamelCase
	//method in java
	void play() {
		System.out.println("Student is playing games");
	}
	void study() {}
	void drink() {}
	void sleep() {
		System.out.println("Student is sleeping");
	}
	void getData() {
		System.out.println(this.id+" "+this.name+" "+this.age);
	}
	void calculateData() {}
	
    void displayScreen() {};
	//java -Camel case
	

	public static void main(String[] args) {
		
		//Local ->variable->variable created inside main method 
		int num1=10;
		int num2=20;
		//add this 2 number
		int sum=num1+num2;
		System.out.println(sum);
		
		//main method is controller for your java program.
		//create an object of class Student->instantiation
//		Student s1=new Student();//0-argument constructors->hashcode()
//		Student std1=new Student(101,"Swapnil",38,'M',"Bengaluru");//parameterized constructor
//	
//		//object reference, i can call method-
//		s1.play();//calling method->play()
//		s1.sleep();
//		System.out.println(s1.hashCode());
//		System.out.println(std1.hashCode());
//		std1.getData();
//		
//		System.out.println(std1.name);
		
		
		//To acess static varible->Classname
		
	   System.out.println(Student.company);
	   
	   //Reference access or instance or instantiation->Object
	   
	}

}
