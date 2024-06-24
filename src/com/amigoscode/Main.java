package com.amigoscode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args)  {
//        START FROM LESSON 129
//        Working with Files
    File file = createFile("src/foo.txt");
    writeToFile(file,true);
    }

    private static void writeToFile(File file,boolean append){
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Come");
            writer.println("");
            writer.println("Here");

            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File  createFile(String path){
        try {
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            return  file;
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }


}