#include<stdio.h>
#include<iostream.h>
#include<conio.h>
#include<string.h>
void main()
{
	clrscr();
	int i, j, flag=0;
	char str[5][20], t[20];
	cout<<"Enter any five string:\n ";
	for(i=0; i<5; i++)
	{
		gets(str[i]);
	}
	for(i=1; i<5; i++)
	{
		for(j=1; j<5; j++)
		{
			if(strcmp(str[j-1], str[j])>0)
			{
				strcpy(t, str[j-1]);
				strcpy(str[j-1], str[j]);
				strcpy(str[j], t);
			}
		}
	}
	cout<<"Strings in alphabetical order are: \n";
	for(i=0; i<5; i++)
	{
		cout<<str[i]<<"\n";
	}
	cout<<"Enter the string to be searched: ";
	gets(t);
	for(i=0;i<5;i++)
	{
		if(strcmp(str[i],t)==0)
			flag=1;
	}
	if (flag==1)
		cout<<"String is found."<<endl;
	else
		cout<<"String is not found."<<endl;

	cout<<"\nThe maixmum of the string is: "<<str[0]<<endl;
	cout<<"The minimum of the string is: "<<str[(sizeof(str)/sizeof(str[0]))-1];
	getch();
}


