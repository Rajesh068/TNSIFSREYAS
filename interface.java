package com.tnsif.interfacedemo;
// to demostrate interface program
public interface Bank {

	float rateofinterest();
	
}
package com.tnsif.interfacedemo;

public class SBI implements Bank {

	@Override
	public float rateofinterest() {
		
		return 9.15f;
	}
}

package com.tnsif.interfacedemo;

public class PNB implements Bank{

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 9.2f;
	}

}

package com.tnsif.interfacedemo;

public class Testinterface {
	
public static void main(String[] args) {
	Bank b=new SBI();
	System.out.println("ROI"+b.rateofinterest());
	
	Bank p=new PNB();
	System.out.println("ROI " + p.rateofinterest());
}
}


nested interface:

package com.tnsif.interfacedemo;
// outter interface
public interface Myinterface {

	 void calculatearea();
	 
	 // nested(inner ) interface
	 
	 interface Myinnerinterface{
		 int id=20;    // data member
		 
		 void print();
	 }
}


package com.tnsif.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface{

	@Override
	public void print() {
		System.out.println("welcome to inner interface");
		
	}

}
package com.tnsif.interfacedemo;

public class Demo {
public static void main(String[] args) {
	Nestedinterface n=new Nestedinterface();
	n.print();
	System.out.println(Nestedinterface.id);
}
}

Interface to intreface

package com.tnsif.interfacedemo;

public interface ParentInterface {
void print();
}
package com.tnsif.interfacedemo;

public interface Childinterface extends ParentInterface {

	void show();
}
package com.tnsif.interfacedemo;

public class Test implements Childinterface {

	@Override
	public void print() {
		System.out.println("print ");
		
	}

	@Override
	public void show() {
		System.out.println("show");
		
	}
}

package com.tnsif.interfacedemo;

public class Excecute {
public static void main(String[] args) {
	Test t =new Test();
	t.show();
	t.print();
}
}


multiple inheritance:

package com.tnsif.interfacedemo;
// to demostrate multiple inheritance
public interface Character {

	void attack();
	
}
package com.tnsif.interfacedemo;

public interface Weapon {

	void use();
	
}

package com.tnsif.interfacedemo;

public   class Warrior implements Character{

	@Override
	public void attack() {
		System.out.println("use");
		
	}

}

package com.tnsif.interfacedemo;

public class Demo1 {
public static void main(String[] args) {
	Warrior w=new Warrior();
	w.attack();
	w.use();
}
}
