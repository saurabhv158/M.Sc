//program9
#include<iostream>
interface Matrix
{
final static int M = 2, N = 2;
void readMatrix(); //Read a matrix
void displayMatrix(); //Display a matrix
void addMatrix(); //Add two matrices
void multMatrix(); // Multiply two matrices
void transposeMatrix(); //Transpose of matrix
}
 
class matrix1 implements Matrix
{
private int [ ][ ] a, b, c;
private int [ ][ ] read()
{
Scanner scan = new Scanner(System.in);
int [ ][ ] x = new int[M][N];
System.out.print("Enter elements of "+M+" x "+N+" matrix row-wise: ");
for(int i = 0; i < M; i++)
for(int j = 0; j < N; j++)
x[i][j] = scan.nextInt();
return x;
}
public void readMatrix()
{
a = read();
b = read();
}
private void display(int[ ][ ]x)
{
for(int i = 0; i < M; i++)
{
for(int j = 0; j < N; j++)
System.out.print(x[i][j]+" ");
System.out.println();
}
System.out.println();
}
void displayMatrix()
{
display(a);
display(b);
display(c);
}
void addMatrix()
{
c = new int[M][N];
for(int i = 0; i < M; i++)
for(int j = 0; j < N; j++)
c[i][j] = a[i][j] + b[i][j];
}
void multMatrix()
{
c = new int[M][N];
for(int i = 0; i < M; i++)
for(int j = 0; j < N; j++)
for(int k = 0; k < M; k++)
c[i][j] += a[i][k] * b[k][j];
}
void transposeMatrix()
{
c = new int[M][N];
for(int i = 0; i < M; i++)
for(int j = 0; j < N; j++)
c[j][i] = a[i][j];
}
}
int main() 
{
matrix1 z = new matrix1();
z.readMatrix();
z.addMatrix();
cout<<"Addition";
z.displayMatrix();
z.multMatrix();
cout<<"Multiplication";
z.displayMatrix();
z.transposeMatrix();
cout<<"Transpose";
z.displayMatrix();
}


