multithreading using static keyword:

package com.tnsif.multithreadingDemo;
// to demostarte synchronization

public class Example {
	// using static keyword
 synchronized static void display() {
	
	Thread g=Thread.currentThread();
	
	for(int i=0;i<3;i++) {
		try {
			Thread.sleep(1000);
			System.out.println(g.getName()+" "+i);
			System.out.println("--------------");
		
		} catch (Exception e) {
			
		}
	}
}
}

package com.tnsif.multithreadingDemo;

public class T extends Thread{
Example e;

//T(Example e){
//	this.e=e;
//}
public void run() {
	Example.display();
}
}


package com.tnsif.multithreadingDemo;

public class Tsynch {
public static void main(String[] args) {
//	Example ex=new Example();
	T t1=new T();
	T t2=new T();
	T t3=new T();
	
	t1.start();
	t2.start();
	t3.start();
	
}
}


strings program:

package com.tnsif.stringdemo;

public class Demo {
public static void main(String[] args) {
	String str1="sachin";
	String str2=str1;
	String str3=str1;
	System.out.println("before modification");
	System.out.println("str1 " + str1);
	System.out.println("str2 "+ str2);
	System.out.println("str3 "+ str3);
	
	str1="tendulkar";
	System.out.println("after modification");
	
	System.out.println("str1 " + str1);
	System.out.println("str2 "+ str2);
	System.out.println("str3 "+ str3);
	
}

}
package com.tnsif.stringdemo;
// to demostrate compareto method
public class CompareDemo {
	public static void main(String[] args) {
		
	
String s1="sachin";
String s2="sachin";
String s3="ratan";

System.out.println(s1.compareTo(s2)); // 0

System.out.println(s1.compareTo(s3));

System.out.println(s3.compareTo(s1));
}
}

package com.tnsif.stringdemo;
// to demostrate equals operator
public class Equaloperator {
 public static void main(String[] args) {
	String s1="sachin";
	String s2="sachin"; // both refer to same instance
	
	String s3=new String("sachin"); // s3 refers to instance created in non pool
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
}
}

package com.tnsif.stringdemo;
// to demostarte equals 
public class EqualsDemo {
public static void main(String[] args) {
	String s1="sachin";
	String s2="sachin";
	
	String s3=new String("sachin");
	String s4="rahul";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
}
}


package com.tnsif.stringdemo;
// to demostarte ignoredemo
public class IgnorecaseDemo {
public static void main(String[] args) {
	String s1="sachin";
	String s2="SACHIN";
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
}
}

package com.tnsif.stringdemo;
// to demostarte string buffer
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer b=new StringBuffer("welcome");
	//b.append("welcome to java");   // original object changed
	//System.out.println(b);
	
	//b.insert(2, "hi");
	System.out.println(b);
	
	//b.replace(1, 3, "word");
	System.out.println(b);
	
	//b.delete(0, 3);
	//System.out.println(b);
	b.reverse();
	System.out.println(b);
}
}


package com.tnsif.stringdemo;
// to demostarate the stringimmutable

public class Testimmutable {
 public static void main(String[] args) {
	String s="     sachin     ";
	System.out.println(s);
//	s=s.concat("tendulkar");
//	System.out.println(s);
	System.out.println(s.length());  // length
	
	
	System.out.println(s.charAt(3));
	
	System.out.println(s.replace("a", "welcome"));
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());// to remove the whitespace
	
}
}
