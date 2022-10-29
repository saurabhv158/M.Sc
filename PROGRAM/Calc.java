/*Name Saurabh Verma
  College Kirori Mal College
  Section A
  Group B*/
import java.io.*; 
import java.util.*;

class Calc{
    static double mean(int a[],int n){		
        double sum = 0;
        for (int i=0; i<n; i++){	
            sum = sum + a[i];
        }
        double average = (sum/n);
        return average;
    }
    static double variance(int a[], int n){
        int sum1 = 0;
        for (int j=0; j<n; j++){
            sum1 = sum1 + a[j]*a[j];
        }
        double  Variance = (sum1/n) - mean(a, n)*mean(a, n);
        return Variance;
    }
    static double geometric_mean(int a[],int n){
        int prod = 1;
        for (int i=0; i<n; i++){
            prod = prod * a[i];}
        double average = Math.pow(prod,1.0/n);
        return average;
    }
    static double harmonic_mean(int a[],int n){
        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum = sum + (1.0/a[i]);
        }
        double average = (sum/n);
        double average1 = (1.0/average);
        return average1;
    }
    static double covariance(int a[],int b[],int n){
        double covariance = 0.0;
        for (int j=0; j<n; j++){
            covariance = (covariance +((a[j] - mean(a,n))*(b[j] - mean(b,n))));
        }
        return covariance;
    }
    static double moment1(int a[], int n){
        double sum2 = 0,sum3=0;
        for (int j=0; j<n; j++){
            sum2 = sum2 + a[j]*a[j];
            sum3 = sum3 + Math.pow(a[j],3);
        }
        double  mu2 = sum2/n;
        double  mu3 = sum3/n;
        double mo3=mu3-(3*mu2*mean(a,n))+(2*Math.pow(mean(a,n),3));
        return mo3;
    }
    static double moment2(int a[], int n){
        double sum2 = 0,sum3=0,sum4=0;
        for (int j=0; j<n; j++){
            sum2 = sum2 + a[j]*a[j];
            sum3 = sum3 + Math.pow(a[j],3);
            sum4 = sum4 + Math.pow(a[j],4);
        }
        double  mu2 = sum2/n;
        double  mu3 = sum3/n;
        double  mu4 = sum4/n;
        double mo4=mu4-(4*mu3*mean(a,n))+(6*mu2*Math.pow(mean(a,n),2))-(3*Math.pow(mean(a,n),4));
        return mo4;
    }
    static double skewness(int a[], int n){
        double m3=moment1(a, n);
        double skew = (Math.pow(m3,2))/(Math.pow(variance(a,n),3));
        return skew;
    }
    static double kurtosis(int a[], int n){
        double m4=moment2(a,n);
        double kurt=m4/(Math.pow(variance(a,n),2));
        return kurt;
    }
    static double th_mu(int a[], int n){
        double sum3=0;
        for (int j=0; j<n; j++){
            sum3 = sum3 + Math.pow(a[j],3);
        }
        double  mu3 = sum3/n;
        return mu3;
    }
    public static void main(String [] args) throws IOException {
        System.out.println("Enter the number of observations ");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter the values for the first dataset ");
        for(int k = 0; k<n; k++){
            a[k] = sc.nextInt();
        }
        // taking the first dataset
        System.out.println("Enter the values for second dataset ");
        for(int k = 0; k<n; k++){
            b[k] = sc.nextInt();
            // taking the second dataset
        }
        int choice;
        do{
            System.out.println("Menu driven Statistical Calculator");
            System.out.println();
            System.out.println("1.Mean");
            System.out.println("2.Harmonic Mean");
            System.out.println("3.Geometric Mean");
            System.out.println("4.Variance");
            System.out.println("5.Standard Error");
            System.out.println("6.Skewness");
            System.out.println("7.Kurtosis");
            System.out.println("8.Covariance");
            System.out.println("9.Regression Coefficient");
            System.out.println("10.3rd moment about origin");
            System.out.println();
            System.out.println("Choose any of the above options");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    double mean1 = mean(a,n);
                    double mean2 = mean(b,n);
                    System.out.println("The mean of the first set of entered numbers is " + mean1);
                    System.out.println("The mean of the second set of entered numbers is " + mean2);
                    break;
                case 2:
                    double harm1= harmonic_mean(a,n);
                    double harm2= harmonic_mean(b,n);
                    System.out.println("The harmonic mean of the first set of entered numbers is " + harm1);
                    System.out.println("The harmonic mean of the second set of entered numbers is " + harm2);
                    break;
                case 3:
                    double geom1= geometric_mean(a,n);
                    double geom2= geometric_mean(b,n);
                    System.out.println("The geometric mean of the first set of entered numbers is " + geom1);
                    System.out.println("The geometric mean of the second set entered numbers is " + geom2);
                    break;
                case 4:
                    double variance1= variance(a,n);
                    double variance2= variance(b,n);
                    System.out.println("The variance of the first set of entered numbers is " + variance1);
                    System.out.println("The variance of the second set of entered numbers is " + variance2);
                    break;
                case 5:
                    double sd1= variance(a,n);
                    double sd2= variance(b,n);
                    System.out.println("The standard error of the first set of entered numbers is " + Math.sqrt(sd1));
                    System.out.println("The standard error of the second set of entered numbers is " + Math.sqrt(sd2));
                    break;
                case 6:
                    double skew1 = skewness(a,n);
                    double skew2 = skewness(b,n);
                    System.out.println("The skewness of the first set of entered numbers is " + skew1);
                    System.out.println("The skewness of the second set of entered numbers is " + skew2);
                    break;
                case 7:
                    double kurt1= kurtosis(a,n);
                    double kurt2= kurtosis(b,n);
                    System.out.println("The kurtosis of the first set of entered numbers is " + kurt1);
                    System.out.println("The kurtosis of the second set of entered numbers is " + kurt2);
                    break;
                case 8:
                    double covar1 = covariance(a,b,n);
                    System.out.println("The covariance of the given data is " + covar1);
                    break;
                case 9:
                    double regression1= covariance(a,b,n)/variance(a,n);
                    double regression2= covariance(a,b,n)/variance(b,n);
                    System.out.println("The regression coefficient of  X on Y is " + regression2);
                    System.out.println("The regression coefficient of  Y on X is " + regression1);
                    break;
                case 10:
                    double m31 = th_mu(a,n);
                    double m32 = th_mu(b,n);
                    System.out.println("The third moment about origin of the first set of entered numbers is " + m31);
                    System.out.println("The third moment about origin of the second set of entered numbers is " + m32);
                case 11:
                    System.out.println("Thank You for Using the Calculator");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
            System.out.println("Do you wish to perform anyother calculation? (1/2) ");
            System.out.println("Press 1- Continue");
            System.out.println("Press 2- End");
            ch = sc.nextInt();
        }
        while(ch == 1);
        System.out.println("See You Soon :* ");
    }
}
/*OUTPUT
run:
Enter the number of observations 

5
Enter the values for the first dataset 
5
6
2
4
5
Enter the values for second dataset 
25
5
32
123
45
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
1
The mean of the first set of entered numbers is 4.4
The mean of the second set of entered numbers is 46.0
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
2
The harmonic mean of the first set of entered numbers is 3.79746835443038
The harmonic mean of the second set of entered numbers is 16.578122718542566
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
3
The geometric mean of the first set of entered numbers is 4.128917917333368
The geometric mean of the second set entered numbers is 29.44662483913991
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
4
The variance of the first set of entered numbers is 1.639999999999997
The variance of the second set of entered numbers is 1649.0
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
5
The standard error of the first set of entered numbers is 1.2806248474865685
The standard error of the second set of entered numbers is 40.607881008493905
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
6
The skewness of the first set of entered numbers is 0.7944748335049714
The skewness of the second set of entered numbers is 1.2585285344435768
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
7
The kurtosis of the first set of entered numbers is 2.9756097560975268
The kurtosis of the second set of entered numbers is 2.810509410668793
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
8
The covariance of the given data is -75.99999999999999
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
9
The regression coefficient of  X on Y is -0.04608853850818677
The regression coefficient of  Y on X is -46.34146341463422
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
10
The third moment about origin of the first set of entered numbers is 107.6
The third moment about origin of the second set of entered numbers is 400102.0
Thank You for Using the Calculator
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
1
Menu driven Statistical Calculator

1.Mean
2.Harmonic Mean
3.Geometric Mean
4.Variance
5.Standard Error
6.Skewness
7.Kurtosis
8.Covariance
9.Regression Coefficient
10.3rd moment about origin

Choose any of the above options
11
Thank You for Using the Calculator
Do you wish to perform anyother calculation? (1/2) 
Press 1- Continue
Press 2- End
2
See You Soon :* 
BUILD SUCCESSFUL (total time: 1 minute 23 seconds)
 */