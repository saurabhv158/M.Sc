// Program1
#include<iostream>
using namespace std;
int main(){
	int choice,a,b;
	char ch;
	cout<<"1. WAP for a menu driven calculator\n";
	do{
	cout<<"enter the your choice"<<"\n"
		<<"1:addition \n"
		<<"2:subtrection"<<"\n"
		<<"3:multiplcation"<<"\n"
		<<"4:division \n";
	cin >> choice ;
	cout<<"enter the first number:\n";
	cin >> a ;
	cout<<"enter the second number:\n";
	cin >> b ;
	switch(choice){
		case 1:cout<<a+b;break;
		case 2:cout<<a-b;break;
		case 3:cout<<a*b;break;
		case 4:if(b!=0){
			cout<<a/b<<"\n";
			}
			else{
				cout<<"conditinal divion";
			}
		default:
			cout << "worng choice try agin";
	}
	cout<<"\n Do you wish to continue (Y/N)";
		cin >> ch;
	}while(ch=='Y'||ch=='y');
	cout<<"\nending program";
return(0);
}
