package Streams_Files_Directories;

import java.io.*;

public class DemoSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube("blue", 1, 5, 6);
        String pathCubeInfo = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\cubeInfo.ser";

        //записваме обект във файл (serialization - сериализация)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathCubeInfo));
        oos.writeObject(cube);
        oos.close();

        //прочитаме обект от файл (deserialization - десериализация)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathCubeInfo));
        Cube cube1 = (Cube) ois.readObject();
        System.out.println();

    }
}
