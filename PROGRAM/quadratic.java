/*Name- Deepanshi Guglani
Hindu College
Section B
Group A

WAP to print the roots of a quadratic equation using arguments */

package saiket;

import java.io.*;
import java.lang.*;

class quadratic

{
	public static void main (String args[])
	{
		double a=Double.parseDouble(args[0]);

		double b=Double.parseDouble(args[1]);

		double c=Double.parseDouble(args[2]);
		double d=0.0;
		d= (b*b)-(4*a*c);
		if (d>0)
	{
		double x=0.0,y=0.0;
		x=((-b - Math.sqrt(d))/(2*a));
		y=((-b + Math.sqrt(d))/(2*a));
		System.out.println(x +","+y);
	}
	else if (d<0)
	{
		System.out.println("the roots are imaginary ");
		double x=(-b/(2*a));
		double y= Math.sqrt(-d)/(2*a);
		
		System.out.println(x +" + i" +y);
		System.out.println(x +" - i" +y);
	}
	
	else
	{
	System .out.println ("the roots are equal ");
	double x=(-b/(2*a));
	System.out.print("it is "+ x);
	}
}
}
/*
OUTPUT
C:\Program Files\Java\jdk1.7.0_80\bin>javac saiket/quadratic.java

C:\Program Files\Java\jdk1.7.0_80\bin>java saiket.quadratic 1 0 1
the roots are imaginary
-0.0 + i1.0
-0.0 - i1.0

C:\Program Files\Java\jdk1.7.0_80\bin>javac saiket/quadratic.java

C:\Program Files\Java\jdk1.7.0_80\bin>java saiket.quadratic 1 3 4
the roots are imaginary
-1.5 + i1.3228756555322954
-1.5 - i1.3228756555322954
*/