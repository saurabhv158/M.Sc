/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*;
class a1{
    int a,b;
    float c;
    a1(){
        a=0;
        b=0;
        System.out.println("Default Constructor & Values are :\n\t\t x="+a+"\n\t\t y="+b);
    }
    a1(int z,int w){
        a=z;
        b=w;
        System.out.println("Two dim Parametrised Constructor & Values are :\n\t\t x="+a+"\n\t\t y="+b);
    }
    a1(float u){
        c=u;
        System.out.println("One dim Parametrised Constructor & Values are :\n\t\t x="+c);
    }
}
class Cnstovr{
    public static void main(String[] args){
        a1 obj1=new a1();
        a1 obj2=new a1(3,7);
        a1 obj3=new a1((float)3.5);
    }
}
/*OUTPUT
run:
Default Constructor & Values are :
		 x=0
		 y=0
Two dim Parametrised Constructor & Values are :
		 x=3
		 y=7
One dim Parametrised Constructor & Values are :
		 x=3.5
BUILD SUCCESSFUL (total time: 0 seconds)

*/
