class Point
{
public:
	//系统
	Point(int xx,int yy);
	Point(){cout<<"Default\n";}
	//用户
	void Set_Point(int xx,int yy);
	int Get_X();
	int Get_Y();
	void Print();
private:
	int x;
	
	double y;
char c1;
};
const double PI=3.1415926;
class Circle
{
public:
	//系统接口
	Circle(int xx,int yy,double Ra);

	//用户接口
	double Area(){return PI*Radius*Radius;}
	double PeriMeter(){return 2*PI*Radius;}
	void Print();

private:
	Point Center;
	double Radius;
};
Circle::Circle(int xx=0,int yy=0,double Ra=0):Center(xx,yy)
{ Radius=Ra;}
void Circle::Print(){Center.Print();}
Point::Point(int xx=0,int yy=0)
{x=xx,y=yy;cout<<"Con\n";}
void Point::Set_Point(int xx,int yy)
{x=xx,y=yy;}
	int Point::Get_X()
	{return x;}
	int Point::Get_Y()	
	{return y;}
		void Point::Print()
		{cout<<"("<<x<<","<<y<<")"<<endl;}
