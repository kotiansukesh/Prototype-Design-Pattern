/*
Properties
	• Creational design pattern
	• Used when you want to avoid the multiple Object creation of the same instance; instead you copy the object to new object and then we can modify as per our need.

Implementation
	• Object which we're copying should provide copying feature by implementing Cloneable interface.
	• We can override clone() method to implement as per our need.

*/

import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
	Vehicle a = new Vehicle();
	a.insertData();

	Vehicle b = (Vehicle) a.clone();
	List<String> list = b.getVehicleList();
	list.add("Audi A6");

	System.out.println(a.getVehicleList());
	System.out.println(list);

  }
}