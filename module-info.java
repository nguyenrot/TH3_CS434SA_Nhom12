
import java.util.Scanner;
	class tamgiac 
	{
	private double A;
	private double B;
	private double C;
	public tamgiac() {}
	public tamgiac(double a,double b,double c)
	{
		this.A=a;
		this.B=b;
		this.C=c;
	}
	public double tinhchuvi()
	{
	return(A+B+C);	
	}
	public void tinhdientich()
	{
	double P=this.tinhchuvi()/2;
	double DT=Math.sqrt(P*(P-A)*(P-B)*(P-C));
	System.out.println("Dien tich:"+DT);
	}
	public void xuat()
	{
	System.out.println("Canh A:"+A);
	System.out.println("Canh B:"+B);
	System.out.println("Canh C:"+C);
	System.out.println("Chu vi la:"+this.tinhchuvi()); 
	this.tinhdientich();
	}
	public void nhap()
	{	
	Scanner SC=new Scanner(System.in);
	System.out.print("Nhap Canh A:");
	this.A=SC.nextDouble();
	System.out.print("Nhap Canh B:");
	this.B=SC.nextDouble();
	System.out.print("Nhap Canh C:");
	this.C=SC.nextDouble();
	}
	}