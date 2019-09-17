#include <iostream.h>
//函数重载
//模板,参数类型化
template < class T>
void Swap(T &  x,T &  y);

void main()
{
	int a,b;

	cout<<"Please input two integer number:";
	cin>>a>>b;
	//int & m=a;
	
	Swap(a,b);

	cout<<"a="<<a<<"    b="<<b<<endl;

	float  m,n;

	cout<<"Please input two float number:";
	cin>>m>>n;
	//int & m=a;
	
	Swap(m,n);

	cout<<"m="<<m<<"    n="<<n<<endl;


}
//T 形参 
//实参 具体数据类型
template < class T>
inline void Swap(T &  x,T &  y)
{
	T t;
	t=x;x=y;y=t;
}
