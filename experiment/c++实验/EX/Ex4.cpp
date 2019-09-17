#include <iostream.h>
#include <math.h>
#include <iomanip.h>
const int N=5;
void Input_age(int *a ,int n);
void Aver_age(int *age ,int n);
void Sort_age(int *age ,int n);
void main()
{
	//1
	int i,age[N]={0};

	cout<<"Input 5 ages:\n";
	Input_age(age,N);
	Aver_age(age,N);
	Sort_age(age,N);
	
	//4
	cout<<"Output 5 ages:\n";
	for( i=0;i<N;i++)
		cout<<setw(5)<<age[i];
	cout<<endl;

}
void Input_age(int *a ,int n)
{
	int i;
	for( i=0;i<n;i++)
		cin>>a[i];
}
void Aver_age(int *age ,int n)
{
	int i;
int sum=0;
	for( i=0;i<N;i++)
		sum=sum+age[i];
	cout<<"average age:"<<(float)(sum)/N<<endl;
}

void Sort_age(int *age ,int n)

{
	int i,j;
for( i=0;i<N-1;i++)
	{
		//1
		int k=i;
		//2
		for(int j=i+1;j<N;j++)
			if(age[j]<age[k]) k=j;
		//3
			if(i!=k)
			{	
		age[i]=age[i]+age[k];
		age[k]=age[i]-age[k];
		age[i]=age[i]-age[k];
		cout<<age[i]<<"   "<<age[k]<<endl; 
			}
		
	}
}
