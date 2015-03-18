package com.stark.assignments.School;

public class Teacher extends Person
{
    String subject;

    public Teacher(String firstName, String lastName, String subject)
    {
        super(firstName, lastName);
        this.subject = subject;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n   Subject: " + subject;
    }
}
