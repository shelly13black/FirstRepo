package com.jetbrains;

public class Course
{
    private String courseName;
    private String [] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student)
    {
        students[numberOfStudents] = student;
        numberOfStudents ++;

    }
    public void dropStudent(String student)
    {
        //left out for now.
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public String[] getStudent()
    {
        return students;
    }
}
