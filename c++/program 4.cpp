// Fibonacci series
//PROGRAM 4
#include <iostream>
using namespace std;
int main ()
{
 long number;
 cout<<"4. WAP to generate a Fibonacci series till the count entered by the user\n";
 cout << "Please type a number: ";
 cin >> number;
 cout<<"Fibonacci series = <";
 int fib1=0,fib2=1,fib3;
 for(int i=0;i<number;i++){
 	fib3=fib1+fib3;
 	cout<<fib3<<",";
 	fib1=fib2;
 	fib2=fib3;
 }
 cout<<">";
 } 
