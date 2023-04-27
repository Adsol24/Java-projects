import java.util.Scanner;
public class conv{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a degree in celsius");

		Double celsius = input.nextDouble();
		Double conv = (9.0/5.0) * celsius + 32;
		
		System.out.println(celsius + " in celsius is " + conv + " farenheit" );
		
		
	}
		

}
