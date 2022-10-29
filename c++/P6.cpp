//program6
#include<iostream>
using namespace std;
int sum(int a, int b)
{
	if(b==0)
	return(a);
	else
	return(sum(a+1,b-1));
}
int pro(int a,int b)
{
	if(b==0)
	return(0);
	else
	return(a+(pro(a,b-1)));
}
int main()
{
    int a,b,c,d;
    cout<<"6. WAP to find sum and product of two numbers using recursion\n";
    cout<<"\nEnter two numbers\n";
    cin>>a>>b;
    cout<<"\nSum of two numbers is : "<<sum(a,b);
    cout<<"\n\nProduct of two numbers is :"<<pro(a,b);
    cout<<"\n\nEnding program";
    return(0);
}

