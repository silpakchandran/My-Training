package pkg1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEg {
	
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();//generic array list
		al.add("silpa");
		al.add("chinnu");
		al.add("anu");
		//a1.add(10); integer 
		System.out.println(al);
		
		ArrayList bl = new ArrayList(); // non generic array
		bl.add(10);
		bl.add(2.6f);
		System.out.println(bl);
		
		al.remove(1); //remove the particular index value 
		System.out.println(al);
		int s = al.size(); // size of array
		System.out.println("size =" +s);
		
		ArrayList<String> cl = new ArrayList<String>();
		System.out.println(cl);
		cl.addAll(al); //add al al to cl
		System.out.println(cl);
		cl.removeAll(cl);//remove all n1 output is blank
		System.out.println(cl);
		System.out.println(al.get(0));
		
		boolean b = al.contains("chinnu");//true or false need to add element for that check that element is avaiable or not
		System.out.println(b);
		al.add("chinnu");
		System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
		
		
	}


