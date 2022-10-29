/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*;
import java.util.*;
class Roots{
    public static void main (String[] args) throws IOException{
        int e;
        double a,b,c,d;
        double x= 0.0, y = 0.0;
        do{
            System.out.println("Enter the coefficients of quadratic equation in order a,b,c");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            d = (b*b)-(4*a*c);
            if(d>0){
                System.out.println("Roots are real and distinct");
                x = ((-b - Math.sqrt(d))/(2*a));
                y = ((-b + Math.sqrt(d))/(2*a));
                System.out.println("Rootts are : \n\t\t R1 = "+x+"\n\t\t R2 = "+y);
            }
            else if(d<0){
                System.out.println("Roots are imaginary");
                x = ((-b)/(2*a));
                y = Math.sqrt(-d)/(2*a);
                System.out.println("Rootts are : \n\t\t R1 = "+x+"+ i"+y);
                System.out.println("\t\t R2 = "+x+"- i"+y);
            }
            else if (d==0){
                System.out.println("Roots are real and same");
                x = ((-b)/(2*a));
                System.out.println("Rootts are : \n\t\t R1 = "+x+"\n\t\t R2 = "+x);
            }
            System.out.println("Do you wish to continue");
            System.out.println("Press 1 for continue 0 for exit");
            e=scanner.nextInt();
        }
        while (e==1);
        System.out.println("Have a nice day");
    }
}
/*OUTPUT
run:
Enter the coefficients of quadratic equation in order a,b,c
1
4
4
Roots are real and same
Rootts are : 
		 R1 = -2.0
		 R2 = -2.0
Do you wish to continue
Press 1 for continue 0 for exit
1
Enter the coefficients of quadratic equation in order a,b,c
6
5
8
Roots are imaginary
Rootts are : 
		 R1 = -0.4166666666666667+ i1.076903998610007
		 R2 = -0.4166666666666667- i1.076903998610007
Do you wish to continue
Press 1 for continue 0 for exit
4
Have a nice day
BUILD SUCCESSFUL (total time: 1 minute 40 seconds)*/