package com.stark.assignments.School;

/**
 * Created by EbenCarek on 2/9/15.
 */
public class HighSchoolStudent extends Student
{
    double gpa;

    public HighSchoolStudent(String firstName, String lastName, int level, double gpa)
    {
        super(firstName, lastName, level);
        this.gpa = gpa >= 0 && gpa <= 5 ? gpa : 0;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n   GPA: " + gpa;
    }
}
