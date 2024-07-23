package com.amigoscode;

import java.io.*;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
//        START FROM LESSON 131
        String brand = "Better designs";
        Optional<String> brandOptional =Optional.ofNullable(brand);
        if(brandOptional.isEmpty()){
            System.out.println("Brand is empty");
        } else{
            System.out.println(brandOptional.get().toUpperCase());
        }
//        the other way
        brandOptional.ifPresentOrElse(b -> {
            System.out.println(b.toUpperCase());
        },() -> {
            System.out.println("Brand is empty");
        });
//        the other way
        printInUpperCase(brand);
//        try {
//            System.out.println(brand.toUpperCase());
//        } catch (NullPointerException e){
//           e.printStackTrace();
//        }
//        Working with Files
    File file = createFile("src/foo.txt");
    writeToFile(file,true);


        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void printInUpperCase(String input){
        Objects.requireNonNull(input,"input can not be null");
        System.out.println(input.toUpperCase());
    }

    private static void writeToFile(File file,boolean append){
        //TRY WITH RESOURCES
        try(
                FileWriter fileWriter = new FileWriter(file,append);
                PrintWriter writer = new PrintWriter(fileWriter);
                ) {
            writer.println("Jamila");
        }
         catch (IOException e){
             System.out.println(e.getMessage());
         }
//        try {
//            FileWriter fileWriter = new FileWriter(file,append);
//            PrintWriter writer = new PrintWriter(fileWriter);
//            writer.println("Come");
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
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