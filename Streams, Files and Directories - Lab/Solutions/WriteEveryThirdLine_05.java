package Streams_Files_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) throws FileNotFoundException {
        String pathRead = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathWrite = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\everyThirdLine.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        Scanner reader = new Scanner(inputStream);
        PrintWriter writer = new PrintWriter(outputStream);

        int count = 1;
        String line = reader.nextLine();
        while (reader.hasNextLine()) {
            if (count % 3 == 0) {
                writer.println(line);
            }
            count++;
            line = reader.nextLine();
        }

        writer.close();
        reader.close();
    }
}
