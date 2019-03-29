
package coursework3;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Coursework3 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        	Student sd1 = new Student("18/1098/BSCS-S","junior",2019);
	System.out.println("STUDENT NAME :"+sd1.getName());
	System.out.println("STUDENT YEAR OF BIRTH :"+sd1.getYOB());
	System.out.println("STUDENT REGESTRATION NUMBER :"+sd1.getRegNO());
	sd1.getCourseWork();
	
	

    }
    
}
