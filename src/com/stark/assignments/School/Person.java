package com.stark.assignments.School;

public class Person
{
    String firstName, lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person()
    {
        this("first", "last");
    }

    @Override
    public String toString()
    {
        return lastName + ", " + firstName;
    }
}
