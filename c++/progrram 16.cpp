#include<iostream>
#include<cmath>
using namespace std;
class complex
{
	float freal;
	float fimg;
	
	public:
		complex()
		{
			freal=0.0;
			fimg=0.0;
		}
		complex(float fr, float fi)
		{
			freal = fr;
			fimg = fi;
		}
		
		
		void GetData();
		void SetData();
				
		complex operator+(complex &para)
		{
			complex temp;
			temp.freal = freal + para.freal;
			temp.fimg = fimg + para.fimg;
			return temp;
		}
		
		complex operator-(complex &para)
		{
			complex temp;
			temp.freal = freal - para.freal;
			temp.fimg = fimg - para.fimg;
			return temp;
		}
		
		complex operator*(complex &para)
		{
			complex temp;
			temp.freal = (freal * para.freal)-(fimg * para.fimg);
			temp.fimg = (freal * para.fimg)+(fimg * para.freal);
			return temp;
		}
		
		complex operator/(complex &para)
		{
			complex temp;
			temp.freal = ((freal * para.freal) + (fimg * para.fimg)) / (pow(para.freal,2) + pow(para.fimg,2));
			temp.fimg = ((para.freal * fimg) - (freal * para.fimg)) / (pow(para.freal,2) + pow(para.fimg,2));
			return temp;
		}
		
		~complex()
		{}
};

void complex :: SetData()
                {
			float fr;
			float fi;
	
			cout<<"Please enter the real part of the  complex number : ";
			cin>>fr;
			cout<<"Please enter the imaginary part of the  complex number : ";
			cin>>fi;
			cout<<endl;
			
			freal=fr;
			fimg=fi;
		}

void complex :: GetData()
{	
	if(fimg!=0)
	{
		if(fimg>0)
			cout<<freal<<"+"<<fimg<<"i\n";
		else 
			cout<<freal<<fimg<<"i\n";
	}
	else
		cout<<freal<<endl;
}


int main()
{
	char choice;
	complex c1,c2,chck,cOutput;
        cout<<"\nEnter first complex number\n";
        c1.SetData();
        cout<<"\nEnter second complex number\n";
	    c2.SetData();
        cout<<"The two entered complex numbers are as follows... \n\n";
	c1.GetData();
	cout<<endl;
	c2.GetData();
	while(1)
	{
		cout<<"\n\nPRESS ' + ' : ADD THE 2 COMPLEX NUMBERS.\n\nPRESS ' - ' : SUBTRACT THE 2 COMPLEX NUMBERS.\n\nPRESS ' * ' : MULTIPLY THE 2 COMPLEX NUMBERS.\n\nPRESS ' / ' : DIVIDE THE 1ST COMPLEX NUMBER by THE 2ND.\n\nPRESS ' N ' : QUIT PROGRAM.\n";
		
		cout<<"\n... Enter your choice :: ";
		cin>>choice;
		cout<<endl;
		if(choice=='+'||choice=='-'||choice=='*'||choice=='/')
		{	
			if(choice=='+')
				cOutput = c1 + c2;
			else if(choice=='-')
				cOutput = c1 - c2;
			else if(choice=='*')
				cOutput = c1 * c2;
			else if(choice=='/')
				cOutput = c1 / c2;
					cout<<"\nAfter performing the ' "<<choice<<" ' operation, the resultant complex number = ";
					cOutput.GetData();
		}
		else if(choice=='N' || choice=='n')
			break;
		else
			cout<<"\n## WRONG ENTRY ##\nTry again.\n";
	}
	cout<<"\n                      ************ THANK YOU ************";
	return 0;
}

