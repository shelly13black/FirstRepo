package com.jetbrains;

public class Main {

    public static void main(String[] args)
    {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Data Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        //getting the number of students in the class.
    }
}
