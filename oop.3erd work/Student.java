
package coursework3;

import java.util.Scanner;

public class Student {
    private String RegNO;
	private String Name;
	private int YOB;
	
	int sum;
	private String []c;
	public Student(String RegNO, String Name,int YOB){
		this.RegNO = RegNO;
		this.Name = Name;
		this.YOB = YOB;
		
	}
	public String getRegNO() {
		return RegNO;
	}
	public void setRegNO(int regNO) {
		RegNO = RegNO;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYOB() {
		return YOB;
	}
	public void setYOB(int yOB) {
		YOB = yOB;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	Scanner scan = new Scanner(System.in);
	private void courseWork() {
		return;
	}
	public void getCourseWork() {
		System.out.println("STUDENT'S COURSE UNITS: ");
		int n=6;
		  String c[] = {"OOP", "Analysis" ,"Networkig","Webdesign","OS","Calculus","researchMethods"};
		int []p = new int[n];
		
		
		int sum = 0;
		 int Avg = 0;
		for(int i = 0; i< n; i++) {
			System.out.println(c[i]);	
			int scan = new Scanner(System.in).nextInt();	
		 
		 
		for(int k = 0; k< n; k++) {
			
			int m  = scan; 
			p[k] =  m;	
		}						
		}
		for( int j : p) {
			sum = sum +j;
			
			
			 int q = 6;
			 Avg = sum/q;
			
		}	
			System.out.println("TOTAL: "+sum);
			System.out.println("AVERAGE: "+Avg);
		
	}
		
	
	
	
	public void setRegNO(String regNO) {
		RegNO = regNO;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String[] getC() {
		return c;
	}
	public void setC(String[] c) {
		this.c = c;
	}
	

}



