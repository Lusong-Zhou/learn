#include <iostream.h>
void main()
{
	int a,b;

	cout<<"Please input two integer number:";
	cin>>a>>b;

	int t;
	t=a;a=b;b=t;

	cout<<"a="<<a<<"    b="<<b<<endl;


}