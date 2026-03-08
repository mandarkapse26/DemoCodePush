package data;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {

	public static void main(String[] args) throws IOException {
		
//		FileWriter obj = new FileWriter("C:\\Users\\manda\\OneDrive\\Desktop\\daTA.txt");
//		obj.write("i am a mandar");
//		System.out.println("file successfully wrote");
//		obj.close();
		
		
		FileReader obj1 = new FileReader("M:\\daTA.txt");
		char s[] = new char[50];
		obj1.read(s);
		for(char q : s) {
		    System.out.print(q);   // print instead of println
		}
		obj1.close();
		
		

	}

}
