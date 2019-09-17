#include <iostream.h>
template <class T>
void Swap(T & x,T &y);
//函数重载，静态多态
//参数，
void main()
{
	int a,b;

	cout<<"Please input two integer number:";
	cin>>a>>b;
		
	Swap(a,b);
	cout<<"a="<<a<<"    b="<<b<<endl;

	float m,n;
	cout<<"Please input two FLOAT number:";
	cin>>m>>n;
		
	Swap(m,n);
	cout<<"m="<<m<<"    n="<<n<<endl;

}
template <class T>
inline void Swap(T & x,T &y)
{
	T t;
	t=x;x=y;y=t;
}

