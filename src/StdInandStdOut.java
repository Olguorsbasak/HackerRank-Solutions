import java.util.Scanner;
public class StdInandStdOut {

	public static void main(String[] args) {
		int num1=42;
        int num2=100;
        int num3=125;
        
      Scanner input=new Scanner(System.in);
       num1=input.nextInt();
       num2=input.nextInt();
       num3=input.nextInt();
      input.close();
        
        System.out.println( num1);
        System.out.println( num2);
         System.out.println( num3);
 
	}

}
