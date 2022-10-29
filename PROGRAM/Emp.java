/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*;
import java.util.*;

class Emp{
    static BufferedReader scanner1 = new BufferedReader(new InputStreamReader(System.in));
    static Scanner scanner = new Scanner(System.in);
    String name;
    int age,code;
    Emp (String name1, int age1, int code1){
        name = name1;
        code = age1;
        age = code1;
    }
    public static void update (Emp emp1[], int n) throws IOException {
        int s = emp1.length;
        for (int i = s-n ; i < s; i++){
            System.out.println();
            System.out.print ("Enter the Name ");
            String name1 = scanner1.readLine();
            System.out.print ("Enter the unique code "); int code1 = scanner.nextInt();
            System.out.print ("Enter the age "); int age1 = scanner.nextInt();
            System.out.println();
            emp1[i] = new Emp(name1, age1, code1);
        }
    }
    public static void display (Emp emp1[]){
        for (int i = 0; i < emp1.length; i++){
            System.out.println ("\n" +"Name " + emp1[i].name);
            System.out.println ("Code " + emp1[i].code);
            System.out.println ("Age " + emp1[i].age);
            System.out.println();
        }
    }
    public static Comparator<Emp> SortName = new Comparator<Emp>(){
        public int compare(Emp emp1, Emp emp2){
            String empN1 = emp1.name.toUpperCase();
            String empN2 = emp2.name.toUpperCase();
            return empN1.compareTo(empN2);
        }
    };
    public static Comparator<Emp> SortAge = new Comparator<Emp>(){
        public int compare(Emp emp1, Emp emp2){
            if (emp1.age < emp2.age)
                return (-1);
            else if (emp1.age > emp2.age)
                return (1);
            else
		return (0);
        }
    };
    public static Comparator<Emp> SortCode = new Comparator<Emp>(){
        public int compare(Emp emp1, Emp emp2){
            if (emp1.code < emp2.code)
                return (-1);
            else if (emp1.code > emp2.code)
                return (1);
            else
                return (0);
        }
    };
    public static Emp[] sort (Emp emp1[]) throws IOException{
        System.out.println();
        System.out.println ("Welcome to the Sorting Wizard ");
        System.out.println ("How would you like to Sort the data (\n1 for Name\n2 for Age\n3 for Code)");
        int choice;
        choice = scanner.nextInt();
        if (choice == 1){
            Arrays.sort(emp1, Emp.SortName);
        }
        else if (choice == 2){
            Arrays.sort(emp1, Emp.SortAge);
        }
        else if (choice == 3){
            Arrays.sort(emp1, Emp.SortCode);
        }
        return emp1;
    }
    public static void main (String [] args) throws IOException{
        System.out.println ("/**********************************************************************/");
        System.out.println ("\tWelcome to the fictitious company's Emp Database ");
        System.out.println ("/**********************************************************************/");
        System.out.println ();
        int choice,choice1;
        int n, m = 0;
        Emp[] emp = new Emp[m];
        do{
            System.out.println ("1.Update the Database");
            System.out.println ("2.Diplay the Database");
            System.out.println ("3.Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print ("Enter the number of Emps you you wish to enter the data for: ");
                    n = scanner.nextInt();
                    m = m + n;
                    emp = Arrays.copyOf(emp, m );
                    update(emp, n);
                    break;
                case 2:
                    display (emp);
                    System.out.println();
                    System.out.print("Do you wish to sort the data as well? (yes-1 or no-0) ");
                    choice1 = scanner.nextInt();
                    if(choice1==1){
                        sort(emp);
                        System.out.println ("Database has been sorted .. To view press 2");
                    }
                    else
                        System.out.println();
                    break;
                default:
                    break;
            }
        }
        while (choice != 3);
    }
}
/*OUTPUT
run:
**********************************************************************
	Welcome to the fictitious company's Emp Database 
**********************************************************************

1.Update the Database
2.Diplay the Database
3.Exit
1
Enter the number of Emps you you wish to enter the data for: 3

Enter the Name saurabh
Enter the unique code 1
Enter the age 18


Enter the Name naveen
Enter the unique code 2
Enter the age 21


Enter the Name abhisek
Enter the unique code 3
Enter the age 20

1.Update the Database
2.Diplay the Database
3.Exit
2

Name saurabh
Code 18
Age 1


Name naveen
Code 21
Age 2


Name abhisek
Code 20
Age 3


Do you wish to sort the data as well? (yes-1 or no-0) 1

Welcome to the Sorting Wizard 
How would you like to Sort the data (
1 for Name
2 for Age
3 for Code)
1
Database has been sorted .. To view press 2
1.Update the Database
2.Diplay the Database
3.Exit
2

Name abhisek
Code 20
Age 3


Name naveen
Code 21
Age 2


Name saurabh
Code 18
Age 1


Do you wish to sort the data as well? (yes-1 or no-0) 1

Welcome to the Sorting Wizard 
How would you like to Sort the data (
1 for Name
2 for Age
3 for Code)
2
Database has been sorted .. To view press 2
1.Update the Database
2.Diplay the Database
3.Exit
2

Name saurabh
Code 18
Age 1


Name naveen
Code 21
Age 2


Name abhisek
Code 20
Age 3


Do you wish to sort the data as well? (yes-1 or no-0) 1

Welcome to the Sorting Wizard 
How would you like to Sort the data (
1 for Name
2 for Age
3 for Code)
3
Database has been sorted .. To view press 2
1.Update the Database
2.Diplay the Database
3.Exit
2

Name saurabh
Code 18
Age 1


Name abhisek
Code 20
Age 3


Name naveen
Code 21
Age 2


Do you wish to sort the data as well? (yes-1 or no-0) 0

1.Update the Database
2.Diplay the Database
3.Exit
3
BUILD SUCCESSFUL (total time: 2 minutes 0 seconds)
*/