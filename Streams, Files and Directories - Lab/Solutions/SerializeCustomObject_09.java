package Streams_Files_Directories;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCustomObject_09 {
    public static void main(String[] args) throws IOException {
        Cube cube = new Cube("blue", 1, 5, 6);
        String pathCubeInfo = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\Java-Adv-May-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\cubeInfo.ser";

        //записваме обект във файл (serialization - сериализация)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathCubeInfo));
        oos.writeObject(cube);
        oos.close();
    }
}
