#include<iostream>
using namespace std;
void printTriangle(int rows){

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                cout<<"*";
            }
            cout<<endl;
        }
    }

int main()
{
    int rows;
    cout<<"Enter a number: "<<endl;
    cin>>rows;
    printTriangle(rows);
    return 0;
}