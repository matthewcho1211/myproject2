package com.matt.score;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ScoringFile {
    public static void main(String[] args) {
        String lines = null;
        ArrayList<String[]>list = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("scores.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            while ((lines = bufferedReader.readLine()) != null){
//                String[] line = lines.split(",");
//                list.add(line);
//            }
            int data = fileReader.read();
            System.out.println(data);
            data = fileReader.read();
            System.out.println(data);

        }catch (FileNotFoundException e){
            System.out.println("檔案讀取失敗");
        }catch (IOException e){
            System.out.println("檔案讀取失敗");
        }

//        for(String[] x : list){
//            System.out.println(x[0]+"\t"+x[1]+"\t"+x[2]);
//        }

    }
}
