// program 5
#include <iostream>
using namespace std;
long factorial (long a)
{
 if (a > 1)
 return (a * factorial (a-1));
 else
 return (1);
}
int main ()
{
 long number,r;
 cout<<"5. WAP to solve permutation and combination using recursion\n";
 cout << "Please type a number: ";
 cin >> number;
 cin >> r;
 cout<<"Pertmutetion = "<<factorial(number)/factorial(r)<<"\n";
 cout<<"Combination = "<<factorial(number)/(factorial(number-r)*factorial(r));
 return 0;
}
