#include <iostream.h>
#include "shap.h"
void main()
{
	Point p1(1,2),p2(3,4);
	p1.Print();
	p2.Print();
	cout<<"-------------------------\n";



	Circle c1(5,6,1),c2(5,6,5);
	c1.Set_Point(7,8);
	cout<<"c1 message:\n";
	cout<<"c1 center:";	cout<<c1.Get_X()<<endl;
	cout<<"Radius:";	cout<<c1.Get_Radius()<<endl;

	cout<<"c1 area:";	cout<<c1.Area()<<endl;
		cout<<"-------------------------\n";



	Arc a1(10,20,1,30,90);
	cout<<"a1 message:\n";
	cout<<"center:";	a1.Point::Print();
		cout<<"Radius:";	cout<<c1.Get_Radius()<<endl;
	cout<<"area:";	cout<<a1.Area()<<endl;
		cout<<"-------------------------\n";
	

}