//program10
#include<iostream>
using namespace std;
void selection_sort(int n,int *a){
	int temp;
	for (int i=0;i<n-1;i++){
	for (int j=i+1;j<n;j++){
		if(a[i]>a[j])
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
    }
	for(int k=0;k<n;k++){
		cout<<a[k]<<" ,";
	}
	cout<<endl;
	
}
}
int main(){
	int n,a[50];
	cout<<"10. WAP to sort an array using Selection sort and display the list after each iteration\n";
	cout<<"enter array lengh\n";
	cin>>n;
	cout<<"\nenter element of array\n";
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	cout<<"\nelement of array after sorting are \n";
	for(int i=0;i<n;i++){
		cout<<a[i]<<" ,";
	}
	cout<<endl;
	selection_sort(n,a);
return(0);
}

