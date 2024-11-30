#include<iostream>
using namespace std;
int factorial(int n)
{
    int result =1;
    while(n>0)
    {
        result *=n;
        n--;
    } 
    return result;
}
int main()
{
    int num;
    cout<<"Enter a number: ";
    cin>>num;
    if(num<0)
    {
        cout<<"Enter a positive number.";
    }
    else{
        cout<<"The factorial of "<<num<<" is: "<<factorial(num);
    }
    return 0;
}