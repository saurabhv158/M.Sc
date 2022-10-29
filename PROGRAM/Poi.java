/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*;
import java.math.*;
class Calculate{
    double total;
    double mean(int x[], int n){
        total =0.0;
        double sum =0.0;
        double mean;
        for(int i=0;i<n;i++){
            sum = sum +(i*x[i]);
            total = total+x[i];
        }
        System.out.println("The total is "+total);
        mean = (sum/total);
        return mean;
    }
    void fitting (int x[], int n, double mean){
        double poi[] = new double[n];
        double ef[] = new double[n];
        double sum = 0.0;
        int temp;
        double diff;
        double sse= 0.0, error, mse = 0.0;
        int p = 1;
        System.out.println("x\t\t"+"Observed Frequency \t\t"+"Expected Frequency");
        for(int i=0; i<n; i++){
            p=1;
            for(int j=1; j<i+1; j++){
                p = p*j;
            }
            poi[i] = (Math.exp(-mean)*(Math.pow(mean,i)))/p;
            ef[i] = total*poi[i];
        }
        for(int i=0;i<n-1;i++){
            temp = (int)(ef[i]);
            diff = (ef[i]-temp);
            if(diff >= 0.5)
                ef[i] = temp+1;
            else
                ef[i] = temp;
            sum =sum + ef[i];
            System.out.println(i+"\t\t\t"+x[i]+"\t\t\t"+ef[i]);
        }
        ef[n-1] = total - sum;
        System.out.println(n-1+"\t\t\t"+x[n-1]+"\t\t\t"+ef[n-1]);
        for(int i=0; i<n; i++){
            error = ef[i] - x[i];
            sse = sse + Math.pow(error,2);
            mse = sse/n;
        }
        System.out.println(" The MSE is"+mse);
    }
}
class Poi{
    public static void main(String args[]) throws IOException{
        String str,ch;
        int n;
        double mean;
        int x[];
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        do{
            Calculate calc = new Calculate();
            System.out.println("/*******************************************************/");
            System.out.println("\t\tThe Poisson Distribution:");
            System.out.println("/*******************************************************/");
            System.out.println(" Large no. of occurence of an event\n\t\t\t with avery low probability of occurence");
            System.out.println("\nEnter the total number of occurences of an event");
            str = br.readLine();
            n = Integer.parseInt(str);
            x = new int[n+1];
            System.out.println(" Enter the frequency of the respective occurences");
            for(int i=0; i<n+1; i++){
                str = br.readLine();
                x[i] = Integer.parseInt(str);
            }
            mean = calc.mean(x,n+1);
            System.out.println(" The mean of the given data is "+mean);
            System.out.println(" Fitting of the poisson data");
            calc.fitting(x,n+1,mean);
            System.out.println(" do you wish to continue");
            System.out.println(" Type Yes or No");
            ch = br.readLine();
        }
        while(ch.equals("Yes")||ch.equals("yes"));
        System.out.println(" bbye");
    }
}
/*OUTPUT
run:
/*******************************************************
		The Poisson Distribution:
/*******************************************************
 Large no. of occurence of an event
			 with avery low probability of occurence

Enter the total number of occurences of an event
10
 Enter the frequency of the respective occurences
5
6
3
4
9
5
6
3
7
1
5
The total is 54.0
 The mean of the given data is 4.7592592592592595
 Fitting of the poisson data
x		Observed Frequency 		Expected Frequency
0			5			0.0
1			6			2.0
2			3			5.0
3			4			8.0
4			9			10.0
5			5			9.0
6			6			7.0
7			3			5.0
8			7			3.0
9			1			2.0
10			5			3.0
 The MSE is9.454545454545455
 do you wish to continue
 Type Yes or No
n
 bbye
BUILD SUCCESSFUL (total time: 17 seconds)
*/