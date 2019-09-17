#include <iostream.h>
#include "date.h"

extern const int month_day[13]={0,31,28,31,30,31,30, 31,31,30,31,30,31 };
void main()
{
	//1
	int year,month,day;
	//2 
	cout<<"Please input a date(xxxx yy mm):";
	cin>>year>>month>>day;

	//3     2018 9 28

	 


	//4
	cout<<"The date:"<<year<<"/"<<month<<"/"<<day<<endl;
/*	if(Is_Leap_year(year))
		cout<<"is a leap year"<<endl;
	else
		cout<<"is not a leap year"<<endl;
*/
	cout<<"days:"<<Sum_days(year,month,day)<<endl;  
}