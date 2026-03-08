package fileHandling;

import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        try {
            // ================= WRITE USING FILEWRITER =================
            FileWriter writer = new FileWriter("M:\\testcase\\daTA.txt");
            writer.write("MANDAR IS DITI STUDENT. Java language do this 123....\n");
            writer.close();
            System.out.println("Initial text written successfully.");

            // ================= WRITE USER INPUT =================
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text to write into file:");
            String text = sc.nextLine();

            FileWriter writer2 = new FileWriter("M:\\testcase\\daTA.txt", true);
            writer2.write(text + System.lineSeparator());
            writer2.close();
            System.out.println("User text written successfully.");

            // ================= READ USING FILEREADER =================
            FileReader reader = new FileReader("M:\\testcase\\daTA.txt");
            char[] data = new char[500];
            reader.read(data);
            System.out.println("File Content:");
            System.out.println(data);
            reader.close();

            // ================= WRITE USING FILEOUTPUTSTREAM =================
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\manda\\OneDrive\\Desktop\\daTA.txt", true);

            System.out.println("Enter text for desktop file:");
            String input = sc.nextLine();

            byte[] byteArray = (input + System.lineSeparator()).getBytes();
            fileOut.write(byteArray);
            fileOut.close();
            System.out.println("Successfully written to desktop file.");

            // ================= RENAME FILE =================
            File oldFile = new File("M:\\testcase\\daTA.txt");
            File newFile = new File("M:\\testcase\\kapse.txt");

            if (oldFile.exists()) {
                if (!newFile.exists()) {
                    boolean result = oldFile.renameTo(newFile);
                    if (result) {
                        System.out.println("File renamed successfully.");
                    } else {
                        System.out.println("Rename failed.");
                    }
                } else {
                    System.out.println("Destination file already exists.");
                }
            } else {
                System.out.println("Source file does not exist.");
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
