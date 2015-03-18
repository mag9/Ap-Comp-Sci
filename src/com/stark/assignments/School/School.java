package com.stark.assignments.School;

import java.util.ArrayList;

public class School
{
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;

    public School(ArrayList<Student> students, ArrayList<Teacher> teachers)
    {
        this.students = students;
        this.teachers = teachers;
    }

    public String getGradeLevel(int level)
    {
        String str = "";

        for (Student s : students)
        {
            if (s.getLevel() == level)
            {
                str += s.toString();
                str += "\n";
            }
        }

        return str;
    }

    @Override
    public String toString()
    {
        String str = "Faculty:\n";

        for (Teacher t : teachers)
        {
            str += t.toString();
            str += "\n";
        }

        str += "\n\nStudent Body:\n";

        for (Student s : students)
        {
            str += s.toString();
            str += "\n";
        }

        return str;
    }
}
