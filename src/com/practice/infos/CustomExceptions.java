package com.practice.infos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomExceptions extends Exception{
    public static void main(String[] args) {



    }
    public CustomExceptions(String errorMessage, Throwable tr){
         super(errorMessage,tr);
    }

    public static void getFile(String filename)throws Exception{
        try(Scanner s =new Scanner(new File(filename)))
        {
            if(s.hasNext()){
                //----
            }
        }
        catch(FileNotFoundException e){
          if(1==1){
              throw  new CustomExceptions("Incorrect file",e);
          }
        }
    }

}
