//program13
#include<iostream>
#include<cmath>
using namespace std;
class inventory
{
	private:
	float dr,oc,ic,uc,pr,shc,base;//dr=demand rate,oc=ordering cost,ic=inventory charge,pr=production rate,shc=shortage cost
	public:
void input()
{
	cin>>dr;
	cin>>oc;
	cin>>ic;
	cin>>uc;
	base=(2*oc*dr)/(ic*uc);
}
float model1()
{
	return sqrt(base);
}
float model2()
{
	cout<<"\nEnter the production rate of the items. \n(should be greater than the demand rate)"<<endl;
	cin>>pr;
	return sqrt((base*pr)/(pr-dr));
}
float model3()
{
	cout<<"\nEnter the shortage cost of the items."<<endl;
	cin>>shc;
	return sqrt(base*((shc+(ic*uc))/shc));
}
float model4()
{
	cout<<"\nEnter the production rate of the items. \n(should be greater than the demand rate)"<<endl;
	cin>>pr;
	cout<<"\nEnter the shortage cost of the items."<<endl;
	cin>>shc;
	return sqrt(base*(pr/(pr-dr))*((shc+(ic*uc))/shc));
}
};
int main()
{
inventory obj;
char ch;
float eoq;
int choice,eoq1;
do
{
	cout<<"13. WAP to calculate the EOQ and the other values according to the model , also ask to user which model is to be used ( out of first 4 inventory models)\n";
	cout<<"\nEnter the demand rate, ordering cost, inventory carrying charge and unit cost of the items respectively: "<<endl;
	obj.input();
	cout<<"\n\t\tMENU\t\t";
	cout<<"\n1.Production is infinite and shortages are not allowed";
	cout<<"\n2.Production is finite and shortages are not allowed";
	cout<<"\n3.Production is infinite and shortages are allowed";
	cout<<"\n4.Production is finite and shortages are allowed";
	cout<<"\n\nFor which model from the above do you wish to compute the economic order quantity?: ";
	cin>>choice;
	switch(choice)
	{
	case 1:
		eoq=obj.model1();
		eoq1=eoq;
		cout<<endl<<"Q* = "<<eoq;
		if(fabs(eoq-eoq1)>=0.5)
		 	eoq=eoq1+1;
		else
			eoq=eoq1;
		cout<<"\nThe Economic order quantity for the chosen model is: "<<eoq;
		break;

	case 2:
		eoq=obj.model2();
		eoq1=eoq;
		cout<<endl<<"Q* = "<<eoq;
		if(fabs(eoq-eoq1)>=0.5)
			 eoq=eoq1+1;
		else
	 		eoq=eoq1;
		cout<<"\nThe Economic order quantity for the chosen model is: "<<eoq;
		break;

	case 3:
		eoq=obj.model3();
		eoq1=eoq;
		cout<<endl<<"Q* = "<<eoq;
		if(fabs(eoq-eoq1)>=0.5)
			eoq=eoq1+1;
		else
			eoq=eoq1;
		cout<<"\nThe Economic order quantity for the chosen model is: "<<eoq;
		break;

	case 4:
		eoq=obj.model4();
		eoq1=eoq;
		cout<<endl<<"Q* = "<<eoq;
		if(eoq-eoq1>=0.5)
	 		eoq=eoq1+1;
		else
	 		eoq=eoq1;
		cout<<"\nThe Economic order quantity for the chosen model is: "<<eoq;
		break;

	default:
		cout<<"\nWrong choice entered. ";
		break;
	}
cout<<"\nDo you wish to continue with another model(y/n)? ";
cin>>ch;
}
while (ch=='y'||ch=='Y');
return (0);
}
