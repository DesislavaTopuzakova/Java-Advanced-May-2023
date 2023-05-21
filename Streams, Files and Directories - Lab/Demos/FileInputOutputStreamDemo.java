package Streams_Files_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //FileInputStream (поток за четене) и FileOutputStream (поток за писане)
        //- четем byte по byte
        //- по-бавно действие

        String pathRead = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathWrite = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputTask2.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        int currentByte = inputStream.read();
        char currentSymbol = (char) currentByte;
        outputStream.write(currentSymbol);


        inputStream.close();
        outputStream.close();

    }
}
