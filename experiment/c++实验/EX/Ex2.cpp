#include <iostream.h>
#include <math.h>
#include <iomanip.h>

int Prime(int n)
{
	//1
	int k=(int)(sqrt(n));
	//2
	for( int i=2;i<=k;i++)
	{
		if(n%i==0) break;	
	}
	//3
	if(i>k)
		return 1;
	else
		return 0;
}
int main()
{//20-30prime
	//1 变量定义
	int n;
	
	//3处理
	cout<<"20-30 prime numbers:"<<endl;
	for(n=21;n<30;n=n+2)
	{	
		if(Prime(n))
			cout<<setw(5)<<n;	
	}
	cout<<endl;



	return 0;
}