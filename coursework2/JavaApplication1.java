
package javaapplication1;
import java.util.ArrayList;

public class JavaApplication1 {

    public static void main(String[] args) {
        	ArrayList<String> names =  new ArrayList<String>();
		ArrayList<String> cses =  new ArrayList<String>();
		ArrayList<Double> marks =  new ArrayList<Double>();
		int k= 1;
		double SUM = 0;
		double av = 0;
		while(true) {
			System.out.print("Enter student "+k+" name:");
			String name = new java.util.Scanner(System.in).nextLine();
			int c=0;
			while(c<7) {
				System.out.print("Enter course Unit "+(c+1)+":");
				String cse = new java.util.Scanner(System.in).nextLine();
				System.out.print("Enter marks :");
				Double mark = new java.util.Scanner(System.in).nextDouble();
				SUM = SUM + mark;
				if(name.equals("exit"))
						break;
				else
					names.add(name);
					marks.add(mark);
					cses.add(cse);		
			c++;
			}
			
			System.out.println("name : " + names.get(0));
			System.out.println("cdfg : " + cses.get(0));

			System.out.println("total = "+SUM);
			av = SUM/c;
			System.out.println(" The average is : "+av);

			k++;
		}
	}
}

    

