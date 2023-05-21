package Streams_Files_Directories;

import java.io.Serializable;

public class Cube implements Serializable {
    private String color;
    private int width;
    private int length;
    private int height;

    public Cube(String color, int width, int length, int height) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.height = height;
    }
}
