/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*;
import java.util.*;

class Fib{
    public static void main(String[] args){
        int n,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print");
        n=scanner.nextInt();
        System.out.println("fibonacci Series");
        for(i=0;i<n;i++)
            System.out.println(fib(i)+ " ");
    }
    public static int fib(int a){
        if (a<2)
            return(a);
        else
            return(fib(a-1)+fib(a-2));
    }
}
/*OUTPUT
run:
Enter the number of terms you want to print
6
fibonacci Series
0 
1 
1 
2 
3 
5 
BUILD SUCCESSFUL (total time: 1 second)
*/