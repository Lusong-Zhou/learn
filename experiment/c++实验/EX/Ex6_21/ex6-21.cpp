#include <iostream.h>
#include <stdlib.h>
#include "array.h"
void main()
{
	array <int> a1(10);
	array <double> a2(5);
	cout<<"Integer array:";
	for (int i(0); i<10; i++)
           a1[i]=i+1;
	for (i=0; i<10; i++)
		cout<<a1[i]<<" ";
       cout<<endl;
       cout<<"Double array:";
       cout.precision(4);//设置浮点数字的有效数字
       for (i=0; i<5; i++)
           a2[i]=(double) (i+1)*3.1415;
       for (i=0; i<5; i++)
           cout<<a2[i]<<" ";
       cout<<endl;
       a1[20]=15;
       a2[20]=25.5;
     }
