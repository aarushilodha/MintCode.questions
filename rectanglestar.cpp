#include<iostream>
using namespace std;
void printRectangle(int rows , int cols)
{
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=cols;j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
}
int main()
{
    int rows;
    int cols;
    cout<<"Enter number of rows: ";
    cin>>rows;
    cout<<"Enter number of columns: ";
    cin>>cols;
    printRectangle(rows,cols);
    return 0;
}