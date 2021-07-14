package pkg1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> d1 = new ArrayList<Integer>();
d1.add(10);
d1.add(15);
d1.add(20);
d1.add(100);

int j = d1.size();
System.out.println("size is " +j);

System.out.println(d1);

d1.remove(1);
System.out.println(d1);

int k = d1.size();
System.out.println("size is " +k);

List<Integer> e1 = new ArrayList<Integer>();
d1.addAll(e1);
System.out.println(d1);

System.out.println(e1);


e1.removeAll(e1);
System.out.println(e1);

System.out.println(d1.get(1));

boolean b = d1.contains(100);
System.out.println(b);
boolean a = d1.contains(45);
System.out.println(a);

d1.add(15);
System.out.println(d1);

Iterator itr = d1.iterator();  //Iterative Interface

while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
