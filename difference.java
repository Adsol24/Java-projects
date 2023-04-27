import java.util.Scanner;
import java.util.Random;


public class difference {

	public static void main(String[] args) {
Random rand = new Random();
int rand_int1 =0 +  (int)(Math.random()*(21));
int rand_int2 =0 + (int)(Math.random()*(21));

Scanner input = new Scanner(System.in);
System.out.print(
	      "What is " + rand_int2 + " - " + rand_int1 + "? ");

	    int answer = input.nextInt();

	    System.out.println(
	      rand_int1 + " - " + rand_int2 + " = " + answer + " is " +
	      (rand_int1 - rand_int2 == answer));

	}

}
