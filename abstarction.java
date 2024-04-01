final variables:


package com.tnsif.finalvariable;

public class Finalvariable {

	final int x=8;   // final variable
	final static int y;
	static void change() {
		
	}
	static {
		y=70;
		
	}
	}
	

final method :

package com.tnsif.finalvariable;

public  class Finalmethod {
final int a=9;

final void show() {   // final method
	System.out.println("value of a"+ a);
}
}

package com.tnsif.finalvariable;

public class FinalmethodDemo extends Finalmethod{

	@Override
	final void show() {   // final method
		System.out.println("welcome");
	}
}

Final class : Make class as final you will get


Abstarction:

package com.tnsif.abstraction;
// to demostrate the abstraction
public abstract class Shape {

	protected float area;      // variable
	
	// abstract method
	
	abstract void calarea();
	
	// concreate method
	void show() {
		System.out.println("area of a shape"+area);
	}
}

package com.tnsif.abstraction;

public class Square extends Shape {

	private float side;

	public Square() {
		side=2.0f;
		
	}

	public Square(float side) {
		this.side = side;
	}

	@Override
	void calarea() {
		super.area=side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}

package com.tnsif.abstraction;

public class Demo {
public static void main(String[] args) {
//	Square s=new Square();
//System.out.println(s);
//	Shape p1 =new Shape();
	
	Shape p=new Square(4.5f);
	p.calarea();
	p.show();
}
}






