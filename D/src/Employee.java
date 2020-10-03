import java.util.Scanner;

public class Employee
{
	Scanner sc=new Scanner(System.in);
	int bpay=15000;
	int hra;
	int fValet;
	int hAllowance;
	int ptax=200;
	int pf;
	int med;
	double Grosssal;
	double Netsal;
	void calHra()
	{
		System.out.println("The Employee basic salary is:"+bpay);
		System.out.print("Enter HRA for employee:");
		hra=sc.nextInt();
		double hraAmt=(bpay*hra)/100;
		double hra=bpay+hraAmt;
	}
	void calFoodValet()
	{
		System.out.print("Enter foodvalet is:");
		fValet=sc.nextInt();
		double fValetAmt=(bpay*fValet)/100;
		double fValet=hra+fValetAmt;
	}
	void callhAllowance()
	{
		System.out.print("Enter holiday allounace is:");
		hAllowance=sc.nextInt();
		double hAllowanceAmt=(bpay*hAllowance)/100;
		double hAllowance=fValet+hAllowanceAmt;
	}
	void gSalary()
	{
		Grosssal=bpay+hra+fValet+hAllowance;
	}
	/*void pTax()
	{
		System.out.print("Enter tax amount is:");
	    tax=sc.nextInt();
		//double taxAmt=(Grosssal*tax)/100;
	    double tax=Grosssal-tax;*/
	
	void pF()
	{
		System.out.print("Enter pf amount is:");
		pf=sc.nextInt();
		double pfAmt=(Grosssal*pf)/100;
		double pf=Grosssal-pfAmt;
	}
	void medical()
	{
		System.out.print("Enter medical amount is:");
		med=sc.nextInt();
		double medicalAmt=(Grosssal*med)/100;
		double med=Grosssal-medicalAmt;
	}
	void calNetsal()
	{
		Netsal=pf+med-200;
	}
	void display()
	{
		System.out.println("The Gross salary for the Employee is:"+Grosssal);
		System.out.println("The Net salary for the Emplyee is:"+Netsal);
	}
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.calHra();
		e.calFoodValet();
		e.callhAllowance();
		e.pTax();
		e.pF();
		e.medical();
		e.gSalary();
		e.calNetsal();
		e.display();
	}

}
