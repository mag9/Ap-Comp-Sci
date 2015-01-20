package com.stark.lessons.unit3.lesson31;

import java.util.Scanner;
import java.lang.Math; 

public class Lesson_1011_Activity{
	
	public static void main(String[] args)
	{
		//input
		Scanner scan = new Scanner(System.in);
		String oct= scan.nextLine();
		//System.out.println(oct.length());
		int e0 = 0;
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;
		int e4 = 0;
		int e5 = 0;
		int e6 = 0;
		int e7 = 0;
		int b10= 0;
    
		//testing
		boolean err = false;

		for (int i = 0; i< oct.length(); i++)
		{
			//System.out.println(i);
			if ((oct.charAt(i)<48)||(oct.charAt(i)>55))
			{
				err= true;
			}
		}
    
		if(oct.length()>8)
			err=true;
		
		if (err==true)
			System.out.println("ERROR: Incorrect Octal Format");
    
		//functionality
		if (err==false)
		{
			if(oct.length()>0)
				e0 = (oct.charAt(oct.length()-1)-48);
			if(oct.length()>1)
				e1 = (oct.charAt(oct.length()-2)-48);
			if(oct.length()>2)
				e2 = (oct.charAt(oct.length()-3)-48);
			if(oct.length()>3)
				e3 = (oct.charAt(oct.length()-4)-48);
			if(oct.length()>4)
				e4 = (oct.charAt(oct.length()-5)-48);
			if(oct.length()>5)
				e5 = (oct.charAt(oct.length()-6)-48);
			if(oct.length()>6)
				e6 = (oct.charAt(oct.length()-7)-48);
			if(oct.length()>7)
				e7 = (oct.charAt(oct.length()-8)-48);
			e0*=1;
			e1*=8;
			e2*=8*8;
			e3*=8*8*8;
			e4*=8*8*8*8;
			e5*=8*8*8*8*8;
			e6*=8*8*8*8*8*8;
			e7*=8*8*8*8*8*8*8;
			b10=e0+e1+e2+e3+e4+e5+e6+e7;
			System.out.println(b10);
		}
	}
}