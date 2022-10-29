/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.util.*;
import java.io.*;
import java.lang.*;

public class Eoqinh{
    public static void main(String[] args)throws IOException{
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int choice;
        String ch;
        Eoq  o1=new Eoq();
        Epq  o2=new Epq();
        Eoqs o3=new Eoqs();
        Epqs o4=new Epqs();
        do{
            System.out.println("\n\t\t\tInventory System\n");
            System.out.println("Select a command:\n1.EOQ\n2.EPQ\n3.EOQ with shortages allowed");
            System.out.println("4.Generalised Lot size model\n");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    o1.input();
                    o1.calq();
                    o1.display();
                    break;
                case 2:
                    o2.input();
                    o2.input2();
                    o2.calepq();
                    o2.display();
                    break;
                case 3:
                    o3.input();
                    o3.input3();
                    o3.caleoqs();
                    o3.display();
                    break;
                case 4:
                    o4.input();
                    o4.input4();
                    o4.calepqs();
                    o4.display();
                    break;
                default:
                    System.out.println("Enter valid key!");
            }
            System.out.println("\nDo you want to continue");
            System.out.println("\nType Yes or No");
            ch=scanner1.nextLine();
        }
        while(ch.equals("Y")||ch.equals("y"));
    }
}
class Eoq{
    Scanner in = new Scanner(System.in);
    public double a,ic,l,q;
    public void input(){
        System.out.println("Enter Ordering cost per order:");
        a=in.nextDouble();
        System.out.println("Enter inventory carrying charge per unit per unit time:");
        ic=in.nextDouble();
        System.out.println("Enter annual demand:");
        l=in.nextDouble();
    }
    public void calq(){
        q=(2*a*l)/(ic);
        q=Math.sqrt(q);
    }
    public void display(){
        System.out.println("\nOptimum order/production quantity="+q);
    }
}
class Epq extends Eoq{
    Scanner in2 = new Scanner(System.in);
    double s;
    public void input2(){
        System.out.print("\nEnter annual supply:");
        s=in2.nextDouble();
    }
    public void calepq(){
        q=((2*a*l/ic)*(s/(s-l)));
        q=Math.sqrt(q);
    }
}
class Eoqs extends Eoq{
    Scanner in3 = new Scanner(System.in);
    double sc;
    public void input3(){
        System.out.print("\nEnter stock cost per unit per unit time:");
        sc=in3.nextDouble();
    }
    public void caleoqs(){
        q=((2*a*l/ic)*((ic+sc)/sc));
        q=Math.sqrt(q);
    }
}
class Epqs extends Eoq{
    Scanner in4 = new Scanner(System.in);
    double sc,s;
    public void input4(){
        System.out.print("\nEnter annual supply:");
        s=in4.nextDouble();
        System.out.print("\nEnter stock cost per unit per unit time:");
        sc=in4.nextDouble();
    }
    public void calepqs(){
        q=((2*a*l/ic)*(s/(s-l))*((ic+sc)/sc));
        q=Math.sqrt(q);
    }
}
/*OUTPUT
run:

			Inventory System

Select a command:
1.EOQ
2.EPQ
3.EOQ with shortages allowed
4.Generalised Lot size model

1
Enter Ordering cost per order:
5
Enter inventory carrying charge per unit per unit time:
6
Enter annual demand:
4

Optimum order/production quantity=2.581988897471611

Do you want to continue

Type Yes or No
y

			Inventory System

Select a command:
1.EOQ
2.EPQ
3.EOQ with shortages allowed
4.Generalised Lot size model

2
Enter Ordering cost per order:
8
Enter inventory carrying charge per unit per unit time:
6
Enter annual demand:
4

Enter annual supply:6

Optimum order/production quantity=5.656854249492381

Do you want to continue

Type Yes or No
y

			Inventory System

Select a command:
1.EOQ
2.EPQ
3.EOQ with shortages allowed
4.Generalised Lot size model

3
Enter Ordering cost per order:
5
Enter inventory carrying charge per unit per unit time:
9
Enter annual demand:
7

Enter stock cost per unit per unit time:6

Optimum order/production quantity=4.409585518440984

Do you want to continue

Type Yes or No
y

			Inventory System

Select a command:
1.EOQ
2.EPQ
3.EOQ with shortages allowed
4.Generalised Lot size model

4
Enter Ordering cost per order:
4
Enter inventory carrying charge per unit per unit time:
3
Enter annual demand:
5

Enter annual supply:8

Enter stock cost per unit per unit time:9

Optimum order/production quantity=6.885303726590963

Do you want to continue

Type Yes or No
n
BUILD SUCCESSFUL (total time: 2 minutes 8 seconds)

*/