package com.practice;

class Studentt
{
	int roll_no;
	String sname; //data member-- instance variable
	void printdata() //member function
	{
		System.out.println(roll_no+" "+sname);
	}
}

class Studentt
{
	public static void main(String args[])
	{
		Studentt s1=new Studentt (); //creating objects for class student
		s1.roll_no = 101;
		s1.sname = "Ravi";
		s1.printdata();
	}
}
