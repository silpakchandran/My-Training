package pkg1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> p1 = new ArrayList<String>();
System.out.println("enter colors");
p1.add("red");
p1.add("orange");
p1.add("yellow");
p1.add("green");
System.out.println(p1);

System.out.println(p1.get(0));

Iterator itr = p1.iterator();  //Iterative Interface

while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}


	}


