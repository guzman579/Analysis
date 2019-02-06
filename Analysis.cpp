// Fig. 4.12: Analysis.cpp
// Analysis of examination results using nested control statements. 
#include<iostream>
using namespace std;

int main()
{
	   	// initializing variables in declarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;

		// process 10 students using counter-controlled loop
		while (studentCounter <= 10)
		{
			// promp user for input and obtain value from user
			cout<<"Enter result (1 = pass, 2 = fail): "<<endl;
			cin>>result;

			// if...else commands           
			if (result == 1)
				passes = passes + 1;
			else
				failures = failures + 1;

			// increment studentCounter so loop eventually terminates
			studentCounter = studentCounter + 1;
		}


		cout<<"Passed: "<<passes<< " Failed: "<< failures<<endl;

		// determine whether more than 8 students passed
		if (passes > 8)
			cout<<"Bonus to instructor!"<<endl;
		system("pause");
} // end class 
