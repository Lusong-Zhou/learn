#include <iostream.h>
#include "date.h"


void main()
{
	//1
	Data d1;
	Data d2(2018,10,1);
	Data d3(2018,10,2);
	Data d4(d3);
	cout<<"------------------"<<endl;	


cout<<"------------------"<<endl;	

d2.Print();	


	if(d2.Is_Leap_year())
		cout<<"is a leap year"<<endl;
	else
		cout<<"is not a leap year"<<endl;

	cout<<"days:"<<d2.Sum_days()<<endl;  
	cout<<"------------------"<<endl;
}