#include <iostream>
#include <math.h>
class Point	//Point������
{ public:	//�ⲿ�ӿ�
	   Point(int xx=0, int yy=0) {X=xx;Y=yy;}
	   int GetX() {return X;}
	   int GetY() {return Y;}
	   friend float Distance(Point &a, Point &b); 
  private:	//˽�����ݳ�Ա
	   int X,Y;  
  };
double Distance( Point& a, Point& b)
{
      double dx=a.X-b.X;
      double dy=a.Y-b.Y;
      return sqrt(dx*dx+dy*dy);
}
int main()
{  Point p1(3.0, 5.0), p2(4.0, 6.0);
    double d=Distance(p1, p2);
    cout<<"The distance is "<<d<<endl;
}
