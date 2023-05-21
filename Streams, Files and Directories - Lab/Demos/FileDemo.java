package Streams_Files_Directories;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        //class File - работа с файлове и директории

        System.out.println(file.exists());
        //true -> ако съществува
        //false -> ако не съществува

        System.out.println(file.isDirectory());
        //true -> ако е папка
        //false -> ако не е папка

        System.out.println(file.getName()); //име на файл
        System.out.println(file.length()); //размер на файл

        System.out.println(file.canWrite());
        //true -> ако може да се пише във файла
        //false -> ако не може да се пише във файла

        System.out.println(file.canRead());
        //true -> ако може да се чете от файла
        //false -> ако не може да се чете от файла
    }
}
