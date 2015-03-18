package com.stark.lessons.unit5.lesson5;

public class Student 
{
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private static int studentNum;
    private int studentID;
    private double gpa;
    
    public Student()
    {
        this("None", "None", 0, 0.0);
    }
    
    public Student(String fn, String ln, int gl, double gpad)
    {
        studentNum++;
        studentID = studentNum;
        firstName = fn;
        lastName = ln;
        gradeLevel = gl;
        gpa = gpad;
        
        if(gpa > 4.5)
        {
            gpa = 0.0;
        }
        
        if(gpa < 0)
        {
            gpa = 0.0;
        }
        
        if(gradeLevel > 12)
        {
            gradeLevel = 0;
        } 
        
        if(gradeLevel< 0)
        {
            gradeLevel = 0;
        }
    }
    
    @Override
    public String toString()
    {
        return 
            lastName + ", " + firstName + "\n " +
            "GPA: " + gpa + "\n" +
            "Grade Level: " + gradeLevel + " id # " + studentID;
    }
    
}
