import java.util.Scanner;
public class StdInandStdOut2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String intLine = input.nextLine();
        String floatLine = input.nextLine();
        String sentence = input.nextLine();
        System.out.println("String: " + sentence);
        System.out.println("Double: " + Double.parseDouble(floatLine));
        System.out.println("Int: " + Integer.parseInt(intLine));
        input.close();
}
}
