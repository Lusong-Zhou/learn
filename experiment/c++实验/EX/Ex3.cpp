#include <iostream.h>
void Swap(int &  x,int &  y);
void main()
{
	int a,b;

	cout<<"Please input two integer number:";
	cin>>a>>b;
	//int & m=a;
	
	Swap(a,b);

	cout<<"a="<<a<<"    b="<<b<<endl;


}
void Swap(int &  x,int &  y)
{
	int t;
	t=x;x=y;y=t;
}