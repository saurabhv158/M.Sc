//program8
#include<iostream>
using namespace std;
int main()
{
	int num,dig,sum=0,s=0;
	cout<<"8. WAP to find reverse and sum of the digits of a number entered by the user";
	cout<<"\nEnter the number: ";
	cin>>num;
	while(num>0)
	{
		dig=num%10;
		sum+=dig;
		s=(s*10)+dig;
		num=num/10;
	}
	cout<<"\nNumber in reverse order is "<<s;
	cout<<"\nSum of digit is "<<sum;
	return (0);
}

