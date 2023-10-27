package com.practice.infos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteFromFile  {

    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("demo1.txt");
            fw.write("Hello world");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
