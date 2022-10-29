/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*;
import java.util.*;

class Hanoi{
    public static void main(String[] args)throws IOException{
        int i,j,k,n,c;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the value of n for which you want to print tower of Hanoi");
            n = scanner.nextInt();
            System.out.println("The Tower of Hanoi");
            for(i=1;i<=n;i++){
                for(j=n;j>=i;j--)
                    System.out.print(" ");
                for(k=1;k<=i;k++)
                    System.out.print("* ");
                System.out.println();
            }
            System.out.println("Do you wish to continue");
            System.out.println("Press 1 for continue 0 for exit");
            c=scanner.nextInt();
        }
        while(c==1);
        System.out.println("Have a Nice Day!!");
    }
}
/*OUTPUT
run:
Enter the value of n for which you want to print tower of Hanoi
5
The Tower of Hanoi
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
Do you wish to continue
Press 1 for continue 0 for exit
1
Enter the value of n for which you want to print tower of Hanoi
6
The Tower of Hanoi
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
Do you wish to continue
Press 1 for continue 0 for exit
0
Have a Nice Day!!
BUILD SUCCESSFUL (total time: 11 seconds)

*/