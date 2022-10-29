// program 2
#include<iostream.h>
#include<conio.h>
int max(int n1,int n2,int n3){
	if(n1 >= n2 && n1 >= n3){
        return(n1);
    }
    if(n2 >= n1 && n2 >= n3){
        return(n2);
    }
    if(n3 >= n1 && n3 >= n2) {
        return(n3);
    }
return(0);
}
int min(int n1,int n2,int n3){
	if(n1 <= n2 && n1 <= n3){
        return(n1);
    }
    if(n2 <= n1 && n2 <= n3){
        return(n2);
    }
    if(n3 <= n1 && n3 <= n2) {
        return(n3);
    }
return(0);
}
int main(){
	clrscr();
	int n1, n2, n3;
    cout << "Enter three numbers: \n";
    cin >> n1 >> n2 >> n3;
    cout<<"max number: "<< max(n1,n2,n3)<<"\n";
    cout<<"min number: "<<min(n1,n2,n3);
getch();
return(0);
}
