package com.stark.assignments.School;

public class Student extends Person
{
    static int countID = 1;
    int studentID, level;

    public Student(String firstName, String lastName, int level)
    {
        super(firstName, lastName);
        this.level = level <= 12 && level >= 0 ? level : 0;
        this.studentID = countID++;
    }

    public int getLevel()
    {
        return level;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n   Grade Level: " + level + "\n   ID #: " + studentID;
    }
}
