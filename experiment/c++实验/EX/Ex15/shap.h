class Shap
{
	public:
		virtual double Area()=0;
		virtual double PeriMeter()=0;
};
class Point :public Shap
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
	double Area()
	{return 0.0;};
	double PeriMeter()
	{return 0.0;}


protected:
	int x, y;
};

const double PI=3.1415926;
class Circle  :public	Point
{public:
	//系统接口
	Circle(int xx,int yy,double Ra);
	//用户接口
	double Area();
	double PeriMeter();
	double Get_Radius(){return Radius;}
	void Print();
protected:
	double Radius;
};
class Arc  :public	Circle
{public:
	//系统接口
	Arc(int xx,int yy,double Ra,double sa,double ea);
	//用户接口
	double Area();
	double PeriMeter();
	void Print();
protected:
	double StartAngle,EndAngle;

};
class Column  :public	Circle
{public:
	//系统接口
	Column(int xx,int yy,double Ra,double h);
	//用户接口
	double Area();
protected:
	double Height;

};
Column::Column(int xx,int yy,double Ra,double h)
:Circle(xx,yy,Ra)
{
	Height=h;
}
double Column::Area()
{
return	(Circle::Area())*2+(Height*Circle::PeriMeter());

}



Arc::Arc(int xx,int yy,double Ra,double sa,double ea)
:Circle(xx,yy,Ra)
{
	StartAngle=sa,EndAngle=ea;
}
	


double Arc::Area()
{
	return (Circle::Area())*(EndAngle-StartAngle)/360;
}
double Circle::Area()
{return (PI*Radius*Radius);}

double Circle::PeriMeter()
{return 2*PI*Radius;}

Circle::Circle(int xx=0,int yy=0,double Ra=0)
:Point(xx,yy)
{ Radius=Ra;}



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
void Circle::Print()
{    
	cout<<Area()<<endl;
	cout<<PeriMeter()<<endl;
}
