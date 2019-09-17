#include <iostream.h>
#include <string.h>
class Student
{
public:
	Student(	int Nu,char *Na,double Sc):Num(Nu)
	{
		;

		int L=strlen(Na);
		Name=new char[L+1];
		strcpy(Name,Na);

		Score=Sc;
	
		Total_Score=Total_Score+Score;
	}
	~Student()
	{delete[] Name;}

	void Print()
	{
		cout<<"Num\t"<<Num<<endl;
		cout<<"Name\t"<<Name<<endl;
		cout<<"Score\t"<<Score<<endl;
	
	}
	static void Print_Total_Score()
	{
			cout<<"Total_Score\t"<<Total_Score<<endl;
	}

private:
	const int Num;
	char *Name;
	double Score;
	static double Total_Score;
};

double Student::Total_Score=0;

void main()
{


	Student s1(10001,"Zhang San",90),
		    s2(10002,"Zhang San",80),
			 s3(10003,"Zhang San",70);
	s1.Print();
	cout<<"----------------------------\n";
	s2.Print();
	cout<<"----------------------------\n";
	s2.Print();
	cout<<"----------------------------\n";
	Student::Print_Total_Score();

}