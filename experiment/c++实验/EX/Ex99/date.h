#include <iostream.h>
extern const int month_day[13]={0,31,28,31,30,31,30, 31,31,30,31,30,31 };
class Data
{
public:
	Data(int y=2000,int m=1,int d=1);
	void Set_Date(int y,int m,int d);
	int Is_Leap_year();
	int	Sum_days();
	void Print();
private:
	int year,month,day;
};
Data::Data(int y,int m,int d)
{
	year=y,month=m,day=d;
}




void Data::Set_Date(int y,int m,int d)
{
	year=y,month=m,day=d;
}
int Data::Is_Leap_year()
{
	return (year%4==0&&year%100!=0)||(year%400==0);

}
void Data::Print()
{
	cout<<"The date:"<<year<<"/"<<month<<"/"<<day<<endl;
}
int	Data::Sum_days()
{
	int S=0;
	for(int i=1;i<month;i++)
		S=S+month_day[i];
	S=S+day;
	if(Is_Leap_year()&&month>=3)
		S=S+1;
	return S;
}
