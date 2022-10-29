//program7
#include<iostream>
using namespace std;
void rev_sum(int n,int *x)
{
        int sum=0;
	cout<<"Array in original:\n";
	for(int i=1;i<=n;i++)
	cout<<x[i]<<" ";
	cout<<"\nArray in reverse:\n";
	for(int i=n;i>=1;i--)
        {
	  cout<<x[i]<<" ";
          sum+=x[i];
        }
        cout<<"\nThe sum of the array is: "<<sum;
}
void max_min(int n,int *x)
{
	int max1=x[1],min1=x[1];
	for(int i=1;i<=n;i++)
	{
		if(x[i]>max1)
		  max1=x[i];
                if(x[i]<min1)
		  min1=x[i];
	}
	cout<<"\nThe maximum of the array is: "<<max1;
        cout<<"\nThe minimum of the array is: "<<min1;
}
int main()
{
	int n,x[100];
	cout<<"7. WAP to find reverse , sum , max. and min. of an array entered by the user ( USING FUNCTIONS)\n";
	cout<<"Enter the lenght of array ";
	cin>>n;
	cout<<"Enter elements in array: ";
	for(int i=1;i<=n;i++)
	cin>>x[i];
	rev_sum(n,x);
	max_min(n,x);
	return(0);
}

