import java.util.Scanner;

 

public class conversion {



    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Kilograms" + "\t" + "Pounds" + "\n");


        int number = 0, i = 1;
 

        while (number <= 198) {

            number = number + i;

            double conversion = number * 2.2;

            System.out.println(number + "\t" + conversion + "\n");

 

 

        }

 

 

 

 

 

    }

}
