#include<iostream>
#include<string>
#include<cstdio>
using namespace std;
class Media
{
	protected:	
		char title[50], publication[30];
	public:		
		virtual void read()
		{
		}
		virtual void show()
		{
		}
};

class Book : public Media
{
	private:
		
	public:
	    int iPages;
		Book()
		{
			
			iPages = 0;
		}
		
		void read()
		{
			fflush(stdin);
			cout<<"\nEnter the title of the book: ";
			cin>>title;
			fflush(stdin);
			cout<<"\nEnter the name of the publication: ";
			cin>>publication;
			while(1)
			{
				cout<<"\nEnter the number of pages: ";
				cin>>iPages;
				if(iPages<=0)
					cout<<"\nWrong entry! Re-enter.\n";
				else
					break;
			}
			cout<<"\nDone.\n";
			cout<<"\n____________________________________\n";
		}
		
		void show()
		{
			cout<<"\nThe title of the book: '"<<title<<"'"<<endl;
			cout<<"\nThe name of the publication: "<<publication<<endl;
			cout<<"\nNumber of pages: "<<iPages<<endl;
			cout<<"____________________________________\n";
		}
};

class Tape : public Media
{
	private:
		double dTime;
	public:
		Tape()
		{
			
			dTime = 0.0;
		}
		
		void read()
		{
			fflush(stdin);
			cout<<"\nEnter the title of the tape: ";
			cin>>title;
			fflush(stdin);
			cout<<"\nEnter the name of the publication: ";
			cin>>publication;
			while(1)
			{
				cout<<"\nEnter the time span(minutes): ";
				cin>>dTime;
				if(dTime<=0)
					cout<<"\nWrong entry! Re-enter.\n";
				else
					break;
			}
			cout<<"\nDone.\n";
			cout<<"\n____________________________________\n";
		}
		
		void show()
		{
			cout<<"\nThe title of the tape: '"<<title<<"'"<<endl;
			cout<<"\nThe name of the publication: "<<publication<<endl;
			cout<<"\nTime span: "<<dTime<<" mins"<<endl;
			cout<<"____________________________________\n";
		}
};

int main()
{
	cout<<"\n\t   BOOK/VIDEO SHOP\n______________________________________________________\n";
	Book ob;
	Tape obj;
	int flag=1,ch,s=0;
	while(flag)
	{
		cout<<"\nPRESS 1: NEW ENTRY.\nPRESS 2: SHOW LAST ADDED ENTRY.\nPRESS 0: EXIT.\n\nPRESS: ";
		cin>>ch;
			if(ch==1)
			{
				cout<<"\nPRESS 1: ENTER FOR BOOK.\nPRESS 2: ENTER FOR TAPE.\n\nPRESS: ";
				cin>>ch;
				if(ch==1)
				{
				    s=1;
					ob.read();
				}
				else if(ch==2)
				{
				    s=2;
					obj.read();
				}
				else
			    	cout<<"\nWrong entry!!\n";
			}
			else if(ch==2)
			{
				if(s==0)
					cout<<"\nNo entries yet.\n";
				else if(s==1)
				{
					cout<<"\nDisplaying last added entry\n........\n";
					ob.show();
				}  
				else
				{
					cout<<"\nDisplaying last added entry\n........\n";
					obj.show();
				}
			}
			else if(ch==0)
				flag=0;
			else
			cout<<"\nWrong entry!! Try again.\n";
		
	}
	cout<<"\n                   *** THANK YOU ***";
	return 0;
}
