package com.practice;

class Student
{
	int roll_no;
	String sname; //data member-- instance variable
	void printdata() //member function
	{
		System.out.println(roll_no+" "+sname);
	}
}

class UseStudent
{
	public static void main(String args[])
	{
		Student s1=new Student (); //creating objects for class student
		s1.printdata();
	}
}