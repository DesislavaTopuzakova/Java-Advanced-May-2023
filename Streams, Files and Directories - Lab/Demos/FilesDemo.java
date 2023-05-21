package Streams_Files_Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FilesDemo {
    public static void main(String[] args) throws IOException {

        //Files
        //- редица полезни методи за работа с пътища
        //- readAllLines -> връща списък с всички редове
        //- write -> пише във файла
        //- работи пряко Path и Paths - представят пътища на компютър

        Path pathRead = Paths.get("C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path pathWrite = Paths.get("C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\sortedLines.txt");
        List<String> allLines = Files.readAllLines(pathRead);
        Files.write(pathWrite, allLines);
    }
}
