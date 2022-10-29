// program 5
#include <iostream.h>
#include <conio.h>
long factorial (long a)
{
 if (a > 1)
 return (a * factorial (a-1));
 else
 return (1);
}
int main ()
{
 clrscr();
 long number,r;
 cout << "Please type a number: ";
 cin >> number;
 cin >> r;
 cout<<"Pertmutetion = "<<factorial(number)/factorial(r)<<"\n";
 cout<<"Combination = "<<factorial(number)/(factorial(number-r)*factorial(r));
getch(); 
return(0);
} 
