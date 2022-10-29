/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*;
import java.lang.*;
class Rcmd{
    public static void main(String args[])throws IOException{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        double d=0.0;
        d= (b*b)-(4*a*c);
        if (d>0){
            double x=0.0,y=0.0;
            System.out.println("roots are real and distinct");
            x=((-b - Math.sqrt(d))/(2*a));
            y=((-b + Math.sqrt(d))/(2*a));
            System.out.println("Roots are : \n\t\t R1 = "+x+"\n\t\t R2 ="+y);
	}
        else if(d<0){
            double x=0.0,y=0.0;
            System.out.println("roots are imaginary");
            x=((-b)/(2*a));
            y=(Math.sqrt(-d)/(2*a));
            System.out.println("Roots are : \n\t\t R1 = "+x+"- i"+y);
            System.out.println("\t\t R2 = "+x+"+ i"+y);
        }
        else{
            double x=0.0,y=0.0;
            System.out.println("roots are real and distinct");
            x=((-b)/(2*a));
            System.out.println("Roots are : \n\t\t R1 = "+x+"\n\t\t R2 ="+x);
        }
    }
}