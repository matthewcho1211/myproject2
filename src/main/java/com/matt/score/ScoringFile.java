package com.matt.score;


import java.io.BufferedReader;

import java.io.FileReader;

public class ScoringFile {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lines = bufferedReader.readLine();
            while (lines != null){
                String[] token = lines.split(",");
                if(token.length == 4){
                    String name = token[0];
                    int english = Integer.parseInt(token[1]);
                    int math = Integer.parseInt(token[2]);
                    int thesis = Integer.parseInt(token[3]);
                    GraduateStudent graduateStudent = new GraduateStudent(name, english, math, thesis);
                    graduateStudent.print();
                }else{
                    String name = token[0];
                    int english = Integer.parseInt(token[1]);
                    int math = Integer.parseInt(token[2]);
                    Student stu = new Student(name, english, math);
                    stu.print();
                }
                lines = bufferedReader.readLine();
            }
//            int data = fileReader.read();
//            while (data != -1){
//                System.out.print((char)data);
//                data = fileReader.read();
//            }
        }catch (Exception e){
            System.out.println("檔案讀取失敗");
        }



    }
}
