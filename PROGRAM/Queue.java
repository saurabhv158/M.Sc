/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*;
import java.util.*;
class design{
    private float po;
    float pn,r,l,lq,w,wq,t,c,r1=0,r2=0;
    int n;
    design(){
        n=0;
    }
    void input(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number of states:");
        setN(scanner.nextInt());
    }
    float fact(int x){
        if(x<=1)
            return (1);
        else
            return (x*(fact(x-1)));
    }
    void MM1(float a,float s){
        r=a/s;
        System.out.println("r="+r);
        setPo(1-r);
        System.out.println("system is idle:"+getPo());
        if(r<1 && getN()>=1){
            pn=(float) (getPo()*Math.pow(r, getN()));
            System.out.println("\nqueue length:="+pn);
        }
        else{
            System.out.println("cannot compute:");
        }
        System.out.println("measure of effectivess:");
        l= r/(1-r);
        lq=(float) (Math.pow(r,2)/(1-r));
        w=r/(a*(1-r));
        wq=(float) (Math.pow(r,2)/(a*(1-r)));
        System.out.println("\nl="+l+"\nlq="+lq+"\nw="+w+"\nwq="+wq);
    }
    void MMC(float a,float s){
        Scanner g=new Scanner(System.in);
        System.out.println("enter the number of coustomers:");
        c=g.nextInt();
        r=a/s;
        System.out.println("r="+r);
        t=r/c;
        System.out.println("cu="+t);
        if(t<1){
            for(int i=0;i<=c-1;i++){
                r1=(float)(r1+Math.pow(r,i)/fact(i));
            }
            System.out.println("r1="+r1);
            r2=(float)(Math.pow(r,c)/(fact((int) c)*(1-(r/c))));
            System.out.println("r2="+r2);
            setPo(1/(r1+r2));
            System.out.println("System is idle="+getPo());
        }
        if(getN()<c){
            pn=(float) (Math.pow(r, getN())*getPo()/(fact((int) getN())));
        }
        else if(getN()>=c){
            pn=(float) (Math.pow(r, getN())*getPo()/(fact((int) c)*Math.pow(c,getN()-c)));
        }
        else{
            System.out.println("cannot compute:");
        }
        System.out.println("queue length="+pn);
        System.out.println("measure of effectivness:");
        l=(float) (r+(Math.pow(r,c)*t*getPo()/(fact((int) c)*Math.pow((1-t),2))));
        lq=(float) (Math.pow(r,c)*t*getPo()/(fact((int) c)*Math.pow((1-t),2)));
        w=(float) ((1/s)+Math.pow(r,c)*getPo()/(fact((int) c)*Math.pow((1-t),2)*(c*s)));
        wq=(float) (Math.pow(r,c)*getPo()/(fact((int) c)*Math.pow((1-t),2)*(c*s)));
        System.out.println("\nl="+l+"\nlq="+lq+"\nw="+w+"\nwq="+wq);
    }
    void MM(float a,float s){
        r=a/s;
        System.out.println("\nr="+r);
        if(getN()>=0){
            setPo((float) (Math.exp(-r)));
        }
        System.out.println("\nSystem is idle="+getPo());
        pn=(float) (Math.pow(r, getN())*getPo()/fact((int) getN()));
        System.out.println("\nqueue length="+pn);
        System.out.println("measure of effectivness:");
        l=a/s;
        lq=l-r;
        w=1/s;
        wq=lq/a;
        System.out.println("\nl="+l+"\nlq="+lq+"\nw="+w+"\nwq="+wq);
    }
    /**
     * @return the n
     */
    public int getN(){
        return n;
    }
    /**
     * @param n the n to set
     */
    public void setN(int n){
        this.n = n;
    }
    /**
     * @return the po
     */
    public float getPo(){
        return po;
    }
    /**
     * @param po the po to set
     */
    public void setPo(float po){
        this.po = po;
    }
}
public class Queue{
    public static void main(String [] args){
        design d;
        d = new design();
        int ch;
        String check;
        float a,s;
        Scanner k = new Scanner(System.in);
        System.out.println("enter the arrival rate:");
        a=k.nextFloat();
        System.out.println("enter the service rate:");
        s=k.nextFloat();
        d.input();
        do{
            Scanner in = new Scanner(System.in);
            Scanner ins = new Scanner(System.in);
            System.out.println("menu::::::::::");
            System.out.println("enter 1.model MM1");
            System.out.println("enter 2.model MMC");
            System.out.println("enter 3.model MM0 ");
            System.out.println("enter your choice");
            ch= in.nextInt();
            switch(ch){
                case 1:{
                    d.MM1(a,s);
                    break;
                }
                case 2:{
                    d.MMC(a,s);
                    break;
                }
                case 3:
                    d.MM(a,s);
                    break;
                default:
                    System.out.println("invalid choice :-) ");
            }
            System.out.println("do u want to continue(yes/no)");
            check=ins.nextLine();
        }
        while(check.equals("y")||check.equals("Y"));
    }
}
/*OUTPUT
run:
enter the arrival rate:
2
enter the service rate:
3
enter the number of states:
6
menu::::::::::
enter 1.model MM1
enter 2.model MMC
enter 3.model MM0 
enter your choice
1
r=0.6666667
system is idle:0.3333333

queue length:=0.029263835
measure of effectivess:

l=2.0000002
lq=1.3333335
w=1.0000001
wq=0.66666675
do u want to continue(yes/no)
y
menu::::::::::
enter 1.model MM1
enter 2.model MMC
enter 3.model MM0 
enter your choice
2
enter the number of coustomers:
6
r=0.6666667
cu=0.11111111
r1=1.9475995
r2=1.3717424E-4
System is idle=0.5134164
queue length=6.260222E-5
measure of effectivness:

l=0.6666755
lq=8.803438E-6
w=0.33333775
wq=4.401719E-6
do u want to continue(yes/no)
y
menu::::::::::
enter 1.model MM1
enter 2.model MMC
enter 3.model MM0 
enter your choice
3

r=0.6666667

System is idle=0.5134171

queue length=6.260231E-5
measure of effectivness:

l=0.6666667
lq=0.0
w=0.33333334
wq=0.0
do u want to continue(yes/no)
n
BUILD SUCCESSFUL (total time: 3 minutes 12 seconds)
*/