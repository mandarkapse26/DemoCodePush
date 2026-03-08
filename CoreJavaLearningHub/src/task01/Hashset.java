package task01;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>(); //type safe
		set.add("mandar");
		set.add("sonu");
		set.add("kapse");
		set.add("mk");
		set.add("jk");
		set.add("rr");
		set.add("ee");
		set.add("ee");
		System.out.println(set);
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>(); // untype safe
		set1.addAll(set);
		set1.add("ww");
		set1.add("yy");
		set1.add("ff");
		set1.add("rr");
		set1.add("cc");
		set1.add("e");
		set1.add("e");
		System.out.println(set1);



	}

}
