package com.matt.score;

public class Student {
    String name;
    int english;
    int math;
    public Student(String name){

        this.name = name;
    }
    public Student(String name, int english, int math){
        this(name);
        this.english = english;
        this.math = math;
    }
    public Student(){

        this("John Doe", -1, -1);
    }

    public void print(){
        int average = (english+math)/2;
        System.out.print(name + "\t" + english + "\t" + math + "\t" + average);
        if(average < 60){
            System.out.println("*");
        }else {
            System.out.println("!");
        }

    }


}
