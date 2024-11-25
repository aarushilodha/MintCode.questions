#include<iostream>
#include<string>
using namespace std;
class Divisibleby5{
    public: 
    string divisibleby5(int n){
        
        if(n%5==0)
        {
            return "Number is divisible by 5.";
        }
        else{
            return "Number not divisible by 5.";
        }
    }
};
int main()
{
    int n;
    cout<<"Enter a number:"<<endl;
    cin>>n;
    Divisibleby5 obj;
    string result = obj.divisibleby5(n);
    cout<<result<<endl;
    return 0;
}