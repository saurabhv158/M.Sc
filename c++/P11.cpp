//program11
#include<iostream>
#include<string>
#include<cstdio>
using namespace std;
void input(char a[10][20],int m)
{ 
int i;  
for(i=0;i<m;i++)  
{	
cout<<"\n The "<<" "<<i+1<<" element is  ";
	gets(a[i]);  
}
cout<<"The strings you entered are:\n";
for(i=0;i<m;i++)  
{	
	cout<<a[i]<<"\n";  
}
}
void sort(char a[10][20],int m)
{ 
 char temp[20]; 
 int i,min;
 for(i=0;i<m-1;i++)
   {
      min=i;
      for(int j=i+1;j<m;j++)
      {
      	    if((strcmp(a[i],a[j]))>0)
         	    min=j;
      }
      strcpy(temp,a[i]);
	  strcpy(a[i],a[min]);
	  strcpy(a[min],temp);
   }
cout<<"\n\t the alphabetical order \n";
for(i=0;i<m;i++)
cout<<"\n"<<a[i];
}
void search(char a[10][20],int m)
{
  char b[20];
  cout<<"\n enter the string to be found\n";
  cin>>b;
  for(int i=0;i<m-1;i++)
  {
	 if((strcmp(a[i],b))==0)
	 {
	  cout<<"\n  required string found\n ";
	  break;
	 }
  }
}
void min(char a[10][20],int m)
{
 char c[20];
 char min1[10];
 strcpy(min1,a[0]);
 for(int i=1;i<m;i++)
 {
	if(strcmp(min1,a[i])>0)
	{	strcpy(c,a[i]);
	strcpy(min1,a[i]);
	}
  }
 cout<<"\n the minimum string is  "<< min1;
}
void max(char a[10][20],int m)
{ 
 char c[20];
 char max1[10];
 strcpy(max1, a[0]);
 for(int i=0;i<m;i++)
 {
	if(strcmp(max1,a[i])<0)
	{
	strcpy(c,a[i]);
	strcpy(max1,a[i]);
	}
 }
 cout<<"\n the  maximum string is "<< max1;
}
int main()
{
 int choice ,m,i;
 char a[10][20];
 char ch;
 do
 {
	cout<<" \n enter the no. of strings \n";
	cin>>m;
	input(a,m);
	cout<<"\n choose the choice\n";
	cout<<"\n 1: sorting of strings\n";
	cout<<"\n 2: searching of strings\n";
	cout<<"\n 3: to find minimum string \n";
	cout<<"\n 4: to find maximum string\n";
	cout<<"\n enter the choice of operation to be performed on the string\n";

	cin>>choice;
	switch(choice)
	 {
		case 1:
				 
				 sort(a,m);
				 break;

		case 2:
				// input(a,m);
				 search(a,m);
				 break;	  	
        case 3:				 
                // input(a,m);
				 min(a,m);
				 break;
	 	case 4:
				// input(a,m);
				 max(a,m);
				 break;
		default:
		         cout<<"Invalid option";
	}
	cout<<"\n do you want to continue ";
	cin>>ch;
	}
while((ch=='y')||(ch=='Y'));
return 0;
 }
