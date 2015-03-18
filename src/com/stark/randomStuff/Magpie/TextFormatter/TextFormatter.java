package com.stark.randomStuff.Magpie.TextFormatter;

public class TextFormatter
{
    private String line;  //The line to format

    /**
     * Constructs new TextFormatter object
     * @param lineToFormat the string the object will act on
     */
    public TextFormatter(String lineToFormat)
    {
        this.line = lineToFormat;
    }

    /** * Finds the first single instance of str in line,
     * * starting at the position start
     * @param str the string of length 1 to find.
     * Guaranteed to be length 1.
     * @param start the position to start searching.
     * Guaranteed to be in the string line.
     * @return the index of the first single instance of
     * str if the string is found or -1 if it is not found. */


    private int findString(String str, int start)
    {
        if (str.length() > 1)
        {
            str = str.substring(0, 1);
        }

        //str = str.toLowerCase();
        int position = line.indexOf(str, start);

        while (position >= 0)
        {
            String before = " ", after = " ";

            if (position > 0)
            {
                before = line.substring(position - 1, position);
            }
            if (position + 2 < line.length())
            {
                after = line.substring(position + 1, position + 2);
            }
            
            if (!before.equals(str) && !after.equals(str))
            {
                return position;
            }
            else
            {
                position = line.indexOf(str, position + 1);
            }
        }

        return position;
    }

    /**
     * * Count the number of times single instances of str appear in the line.
     * @param str the string to find.
     * Guaranteed to be length 1.
     * @return the number of times the string appears in the line */

    private int countStrings(String str)
    {
        if (str.length() > 1)
        {
            str = str.substring(0, 1);
        }

        //str = str.toLowerCase();

        int position = this.findString(str, 0);
        int count = 0;

        while (position >= 0)
        {
            count++;
            position = this.findString(str, position + 1);
        }

        return count;
    }

    /**
     * Replace all single instances of underscores in the line given by
     * line with italics tags. There must be an even number of underscores
     * in the line, and they will be replaced by <I>, </I>, alternating.
     * //@param original a string of length 1 to replace
     * //@param replacement the string (of any length) use as a replacement
     * @return the line with single instances of underscores replaced with
     * <I> tags or the original line if there are not an even number of underscores. */

    public String convertItalics ()
    {
        if (countStrings("_") % 2 != 0)
        {
            return this.line;
        }

        int position = findString("_", 0);
        int count = 0;

        char[] chars = this.line.toCharArray();
        String[] strings = new String[chars.length];

        for (int i = 0; i < strings.length; i++)
        {
            strings[i] = String.valueOf(chars[i]);
        }

        while (position >= 0)
        {
            strings[position] = count % 2 == 0 ? "<I>" : "</I>";
            position = findString("_", position + 1);
            count++;
        }

        String converted = "";

        for (String s : strings)
        {
            converted += s;
        }

        return converted;
    }

    // *************************************************************************
    // 1. Test TextFormatter()
    // *************************************************************************
    public static void main(String[] args)
    {
        TextFormatter line = new TextFormatter("aabacbb");

        System.out.println("findString Test Case 1: " + line.findString("a", 0));

        System.out.println("findString Test Case 2: " + line.findString("b", 4));

        System.out.println("findString Test Case 3: " + line.findString("c", 0) + "\n");


        System.out.println("countStrings Test Case 1: " + line.countStrings("b") + "\n");


        TextFormatter line2 = new TextFormatter("This is _very_ good.");
        System.out.println("convertItalics Test Case 1: This is _very_ good. " + "\n" + line2.convertItalics() + "\n");

        TextFormatter line3 = new TextFormatter("_This_ is _very_ _good_.");
        System.out.println("convertItalics Test Case 2: _This_ is _very_ _good_. " + "\n" + line3.convertItalics() + "\n");


        TextFormatter line4 = new TextFormatter("This is _very good.");
        System.out.println("convertItalics Test Case 3: This is _very good." + "\n" + line4.convertItalics() + "\n");

        TextFormatter line5 = new TextFormatter("This is __very good.");
        System.out.println("convertItalics Test Case 4: This is __very good." + "\n" + line5.convertItalics());

    }
}
