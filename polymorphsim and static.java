16/02/24 code   : Method overriding

package com.tnsif.override;
// to demostarte override

public class Rbi {
public float getRateofInterest() {
	return 7.8f;
}
}

package com.tnsif.override;

public class Sbi extends Rbi {
@Override
public float getRateofInterest() {
	return 5.6f;
}
}


package com.tnsif.override;

public class OverrideDemo {
	public static void main(String[] args) {
		Sbi s=new Sbi();  //object creation
	  System.out.println(s.getRateofInterest());
	  Rbi r=new Rbi();
	  System.out.println(r.getRateofInterest());
	}
}



Method overloading  :


package com.tnsif.overloading;

// to demostarte overloading

public class Addition {
int add(int a,int b) {
	return a+b;
}
int add(int a,int b,int c) {
	return a+b+c;
}
}


package com.tnsif.overloading;

public class Testoverloading {
	
public static void main(String[] args) {
	Addition a=new Addition();
	System.out.println(a.add(7, 2));
	System.out.println(a.add(6, 5, 4));
}
}


Static keyword :


package com.tnsif.staticprogram;

//to demostarate static program

public class Employee {
 int eid;
 String name;  //non-static variable
 static String company="TNS"; //static variable
 
 
 Employee(int e,String n){
	 eid=e;
	 name=n;
 }
 void display() {
	 System.out.println(eid +" "+name+" "+company);
 }
}


package com.tnsif.staticprogram;

public class Demo {
public static void main(String[] args) {
	Employee e1=new Employee(1,"sushma");
	Employee e2=new Employee(2,"kushma");
	Employee e3=new Employee(3,"reshma");
	e1.display();
	e2.display();
	e3.display();
}
}


package com.tnsif.staticprogram;

public class Student1 {
int rollno;
String name;
static String college="BIT";

//static method change value
 static void change() {     //static method
	 college="sreyas";
 }
 
 Student1(int r,String n){
	 rollno=r;
	 name=n;
 }
  void display() {
	  System.out.println(rollno+" "+name+" "+college);
  }
}


package com.tnsif.staticprogram;

public class Demo1 {
public static void main(String[] args) {
	Student1.change();
	Student1 s1=new Student1(1,"ravi");
	Student1 s2=new Student1(2,"suhas");
	s1.display();
	s2.display();
}
}


package com.tnsif.staticprogram;

// to demostarte static block

public class Staticblockdemo {
	
	// static block
static {
	System.out.println("welcome");
}
public static void main(String[] args) {
	System.out.println("hello world");
}
}

