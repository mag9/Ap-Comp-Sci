package com.stark.assignments.TimeComparable;

/*
 * AP CS MOOC
 * Term 2 - Assignment 4: Time Comparable
 * You can use this solution to Assignment 1 in order to create a comparable time object.
 * You will need to change the class so that it implements the comparable interface.
 */

public class Time implements Comparable
{
    private int hour;
    private int minute;

    public Time()
    {
        this(12, 0);
    }

    public Time(int h, int m)
    {
        if (h > 0 && h < 24)
        {
            this.hour = h;
        }
        else
        {
            this.hour = 0;
        }

        if (m > -1 && m < 60)
        {
            this.minute = m;
        }
        else
        {
            this.minute = 0;
        }
    }

    @Override
    public String toString()
    {
        String h = String.valueOf(this.hour);
        String m = String.valueOf(this.minute);

        if (h.length() == 1)
        {
            h = "0" + h;
        }

        if (m.length() == 1)
        {
            m = "0" + m;
        }

        return h + m;
    }

    public String convert()
    {
        String suffix = " am";
        String h = String.valueOf(this.hour);
        String m = String.valueOf(this.minute);

        if (this.hour > 11)
        {
            suffix = " pm";

            if (this.hour > 12)
            {
                h = String.valueOf(this.hour - 12);
            }
        }

        if (this.hour == 0)
        {
            h = "12";
        }

        if (this.minute < 10)
        {
            m = "0" + String.valueOf(this.minute);
        }

        return h + ":" + m + suffix;
    }

    public void increment()
    {
        this.minute++;

        if (this.minute == 60)
        {
            this.minute = 0;
            this.hour++;

            if (this.hour == 24)
            {
                this.hour = 0;
            }
        }
    }

    @Override
    public int compareTo(Object o)
    {
        Time compareTime = (Time)o;

        if (this.hour < compareTime.hour)
        {
            return -1;
        }
        else if (this.hour > compareTime.hour)
        {
            return 1;
        }
        else
        {
            if (this.minute < compareTime.minute)
            {
                return -1;
            }
            else if (this.minute > compareTime.minute)
            {
                return 1;
            }
        }

        return 0;
    }

    public String difference(Time t)
    {
        int hour, minute;

        hour = Math.abs(this.hour - t.hour);
        minute = Math.abs(this.minute - t.minute);

        if (this.compareTo(t) > 0 && t.minute > this.minute)
        {
            minute = 60 - (t.minute - this.minute);
            hour--;
        }
        else if (this.compareTo(t) < 0 && this.minute > t.minute)
        {
            minute = 60 - (this.minute - t.minute);
            hour--;
        }

        String hourString = String.valueOf(hour), minuteString = String.valueOf(minute);

        if (hourString.length() == 1)
        {
            hourString = "0" + hourString;
        }

        if (minuteString.length() == 1)
        {
            minuteString = "0" + minuteString;
        }

        return hourString + ":" + minuteString;
    }
}
