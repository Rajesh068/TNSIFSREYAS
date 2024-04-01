Exception handling program:

package com.tnsif.exception;
//to demostarte exception
public class Division {

	public static void divide() {
		int a=6,b=0,c;
		try {
			c=a/b;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught"+e.getMessage());
		}
	catch(ArithmeticException e) {
		System.out.println("exception welcome caught"+e.getMessage());
	}
		catch(Exception e) {
			System.out.println("exception caught"+e.getMessage());
		}
	}
	
}

package com.tnsif.exception;
//to demonstrate nested try block
public class NestedTryblock {

	public static void check() {
		String str="TNS";    // data member
		int slength=str.length();
		System.out.println("length of the string"+slength);
		
		String anotherstring=null;    // data member
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("index out of bound"+e.getMessage());
			}
			System.out.println("string length"+anotherstring.length());
		}
		catch(NullPointerException e) {
			System.out.println("exception is thrown"+e.getMessage());
		}
	}
}

package com.tnsif.exception;

public class Demo {

	public static void main(String[] args) {
		Division.divide();

	}

}
package com.tnsif.exception;
//to demostarte exception
public class Division {

	public static void divide() {
		int a=6,b=0,c;
		try {
			c=a/b;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught"+e.getMessage());
		}
	catch(ArithmeticException e) {
		System.out.println("exception welcome caught"+e.getMessage());
	}
		catch(Exception e) {
			System.out.println("exception caught"+e.getMessage());
		}
	}
	
}

package com.tnsif.exception;

public class NestedDemo {

	public static void main(String[] args) {
		NestedTryblock.check();
	}
}

package com.tnsif.exception;
// finally block (no exception)
public class Test {
public static void main(String[] args) {
	
	try {
		System.out.println("welcome");
	}
	catch(Exception e) {
		System.out.println("hi");
	}
	finally {
		System.out.println("hello java");
	}
}
}

package com.tnsif.exception;
//Exception with matching catch block
public class Test1 {
public static void main(String[] args) {
	try {
		System.out.println(100/0);
	}
	catch(NullPointerException ez) {
		System.out.println("exception caught"+ez.getMessage());
	}
	finally {
		System.out.println("end");
	}
}
}

package com.tnsif.exception;

import java.io.IOException;

public class Test2 {
public static void main(String[] args) {
	ThrowsDemo t=new ThrowsDemo();
	try {
		t.display();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
}
}

package com.tnsif.exception;

import java.util.Scanner;

// to demostarte throw keyword
public class TestDemo {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the rollnumber");
	
	int rollno=sc.nextInt();
	
	if(rollno<0) {
		
		throw new ArithmeticException("rollnumber cannot be negative");
		
	}
	else {
		System.out.println("valid rollnumber");
	}
}
}

package com.tnsif.exception;

import java.io.IOException;

// to demostarte throws keyword
public class ThrowsDemo {

	static void display()throws IOException{
	throw new IOException();
}
}

package com.tnsif.exception;
// to demostarte userdefined exception
import java.util.Scanner;

public class Userdefined {
	
private static int age;

static void validate() throws Age{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	if(age<18) {
		throw new Age("invalid age, you are not eligiable");
	}
	else {
		System.out.println("you can vote");
	}
}

}
package com.tnsif.exception;

public class Userdemo {
public static void main(String[] args) {
	try {
		Userdefined.validate();
	} catch (Age e) {
		// TODO Auto-generated catch block
		System.out.println("exception caught"+e.getMessage());
	}
}
}

package com.tnsif.exception;

public class withoutexception {

	public static void main(String[] args) {
	 int d=9;
	 try {
	 int s=9/0;
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("exception caught"+e.getMessage());
	 }
	

	}

}


