package task01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListCollection {

	public static void main(String[] args) {

		ArrayList<String> obj =new ArrayList<String>(); // type safe only add one object data type
		obj.add("mukul");
		obj.add("ganesh");
		obj.add("rupesh");
		obj.add("sanika");
		obj.add("ganesh");
		obj.addFirst("Mandar");
		obj.contains(false);
		obj.contains(true);
		obj.equals("mandar");
		obj.getClass();
		System.out.println(obj.clone());
		System.out.println(obj.size());
		System.out.println(obj);
		
		LinkedList obj2= new LinkedList(); //untype adding data also in string abd integer
		obj2.addAll(obj);
		obj2.add(32323);
		obj2.add("java");
		obj2.poll();
		obj2.removeFirst();
		obj2.addLast("kapse");
		obj2.iterator();
		obj2.push(obj);
		obj2.removeLast();
		obj2.reversed();
		System.out.println(obj.size());
		
		System.out.println(obj2);
		
	}

}
