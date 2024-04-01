15/02/24  program

Topic Inheritance and Super keyword


package com.tnsif.inheritance;
//to demostarte inheritance
public class Citizen {

	private String name;         // data members
	private String address;
	private long aadharno;
	private long phoneno;
	// default constructor
	public Citizen() {
		super();
	
	}
// parameterzised constructor
	public Citizen(String name, String address, long aadharno, long phoneno) {
		super();
		this.name = name;
		this.address = address;
		this.aadharno = aadharno;
		this.phoneno = phoneno;
	}
	
	// getter and setter method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", aadharno=" + aadharno + ", phoneno=" + phoneno
				+ "]";
	}
	}





package com.tnsif.inheritance;

public class Student extends Citizen {

	private int roolno;                   // data members
	private String collegename;
	// default constructor
	public Student() {
		super();
		
	}
// parameterzied constructor
	
	
	// getter and setter method
	public int getRoolno() {
		return roolno;
	}
	
	// parent class parameterzied 
	public Student(String name,String address,long aadharno,long phoneno) {
	super(name,address,aadharno,phoneno);
	this.roolno = roolno;
	this.collegename = collegename;
}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
// students class parameterized 

	public Student(int roolno, String collegename) {
		super();
		this.roolno = roolno;
		this.collegename = collegename;
	}


	@Override
	public String toString() {
		return "Student [roolno=" + roolno + ", collegename=" + collegename + "]";
	}
	
}



package com.tnsif.inheritance;

public class Singlelevelinheritence {

	public static void main(String[] args) {
		Student s=new Student("suma","bangalore",8765479l,9845094342l);
		System.out.println(s);
		
		Student s1=new Student(1,"shreys");
		System.out.println(s1);
	}
}




super keyword:


package com.tnsif.superkeyword;
//To demostarte super keyword
public class SuperDemo {
 int a=60;   // data member
 
 void drink() {
	 System.out.println("tea");
 }
 
 SuperDemo(){  //constructor
	 System.out.println("welcome");
 }
}


package com.tnsif.superkeyword;

public class Demo extends SuperDemo {
int a=50;

void drink() {
	System.out.println("coffe");
}
void show() {
	drink();
	super.drink();
}

Demo(){
	
	System.out.println("hello world");
}

public static void main(String[] args) {
	Demo d =new Demo();
	//d.show();

	
}
}


	

