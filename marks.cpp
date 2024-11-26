#include<iostream>
#include<string>
using namespace std;
double calculateAverage(int subject1 , int subject2 , int subject3){
return (subject1 + subject2 + subject3) / 3.0;
}
string determineGrade(double average)
{
    if (average>=90)
    {
        return "A+";
    }
    else if(average>=75)
    {
        return "A";
    }
    else if(average>=50)
    {
        return "B";
    }
    else{
        return "Fail";
    }
}
int main()
{
    int subject1, subject2, subject3;
    cout<<"Enter marks on first subject: ";
    cin>>subject1;
    cout<<"Enter marks of second subject: ";
    cin>>subject2;
    cout<<"Enter marks of third subject: ";
    cin>>subject3;
    double average= calculateAverage(subject1,subject2,subject3);
    string grade = determineGrade(average);
    cout<<"Average marks: "<<average<<endl;
    cout<<"Grade: "<<grade<<endl;
    return 0;
}