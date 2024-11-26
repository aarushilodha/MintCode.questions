#include<iostream>
using namespace std;
void printMultiplicationTable(int number , int range)
{
    for(int i=1;i<=range;i++)
    {
        cout<<number<<"x"<<i<<"="<<(number*i)<<endl;
    }
}
int main()
{
    int number;
    int range;
    cout<<"Enter a number: ";
    cin>>number;
    cout<<"Enter a range: ";
    cin>>range;
    printMultiplicationTable(number,range);
    return 0;
}