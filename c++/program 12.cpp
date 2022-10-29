#include<iostream>
#include<cmath>
using namespace std;
class series
{
	private:
	int n,choice;
	float a,b,c,d;
	float s1,s2;
	char ch;
	public:
		void input();
		void determine();
		void sum_ap();
		void sum_gp();
};
void series::input()
{
	cout<<"\nEnter 4 integers\n";
	cin>>a>>b>>c>>d;
	determine();
}
void series::determine()
{

	if((b-a)==(c-b)&&(c-b)==(d-c))
	{
		cout<<"\nSeries is in AP\n";
		cout<<"\nSum of how many integers do you want?\t";
		cin>>n;
		sum_ap();
	}
	else if(b/a==c/b&&c/b==d/c)
	{
		cout<<"\nSeries is in GP\n";
		sum_gp();
	}
	else
	{
		cout<<"\nInvalid series\n";
		cout<<"Do you want to input again?\n";
		cin>>ch;
		if(ch=='y'||ch=='Y')
			input();
	}
}
void series::sum_ap()
{
	s1=(2*a+(n-1)*(b-a))*n/2;
	cout<<"\nSum of the AP series is\n"<<s1;
	cout<<"\nDo you want to input again?\n";
		cin>>ch;
		if(ch=='y'||ch=='Y')
			input();
}

void series::sum_gp()
{
	float r;
	r=b/a;
	if(r<1)
	{
		cout<<"You want to get the sum of finite series or infinite?\n";
		cout<<"\nEnter 1. for finite\n";
		cout<<"\nEnter 2. for infinite\n";
		cin>>choice;
		switch(choice)
		{
			case 1:
                cout<<"\nSum of how many integers do you want?\t";
				cin>>n;
				s1= a*((1-pow(r,n))/(1-r));
				break;
			case 2:
				s1= a/(1-r);
				break;
		}
	}
	else
	{
		cout<<"\nGP series is finite";
		cout<<"\nSum of how many integers do you want?\t";
		cin>>n;
		s1= a*((1-pow(r,n))/(1-r));

	}
	cout<<"\nSum of the GP series is\t"<<s1;
        cout<<"\nDo you want to input again?\n";
		cin>>ch;
		if(ch=='y'||ch=='Y')
			input();
}
int main()
{
	cout<<"12. WAP to take input of 4 integers and check whether they are in AP or in GP , and find the sum of the series ";
	series sr;
	sr.input();
        cout<<"Ending Program";
}
