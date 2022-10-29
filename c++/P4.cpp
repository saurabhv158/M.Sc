// Fibonacci series
#include <iostream.h>
#include <conio.h>
int main ()
{
 long number;
 cout << "Please type a number: ";
 cin >> number;
 cout<<"Fibonacci series = <";
 int fib1=0,fib2=1,fib3=0;
 for(int i=0;i<number;i++){
 	fib3=fib1+fib3;
 	cout<<fib3<<",";
 	fib1=fib2;
 	fib2=fib3;
 }
 cout<<">";
return(0);
 } 
