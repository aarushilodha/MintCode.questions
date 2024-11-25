#include<iostream>
#include<string>
using namespace std;
class Even_odd{
public: 
string Even_Odd(int n){
    //Even_Odd(n);
    if(n%2==0)
    {
        return "Even";
    }
    else{
       return "Odd";
    }
}
};
int main()
{
    int n;
    cout<<"Enter a number: "<<endl;
    cin>>n;
    Even_odd obj;
    string result = obj.Even_Odd(n);
    cout<<result<<endl;
    return 0;
}
