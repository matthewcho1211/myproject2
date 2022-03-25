package com.matt.score;

public class Scoring {
    public static void main(String[] args) {
        Student matt = new Student("Matt", 60, 70);
        Student rayy = new Student("Rayy", 59, 58);
        Student s = new Student();
        System.out.println(s.name);
        GraduateStudent hank = new GraduateStudent("Hank", 60, 70, 79);
        matt.print();
        rayy.print();
        hank.print();

    }
}
