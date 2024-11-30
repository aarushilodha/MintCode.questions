#include<iostream>
using namespace std;
void swapnumber(int &a, int &b)
{
    int temp= a;
    a=b;
    b=temp;
}
int main()
{
    int num1, num2;
    cout<<"Enter first number: "<<endl;
    cin>>num1;
    cout<<"Enter second number: "<<endl;
    cin>>num2;
    //before swapping:
    cout<<"Before swapping numbers are:"<<endl;
    cout<<"First number: "<<num1<<" Second number: "<<num2<<endl;
    swapnumber(num1,num2);
    //after swapping:
    cout<<"After swapping numbers are:"<<endl;
    cout<<"First number: "<<num1<<" Second number: "<<num2;
    return 0;
}