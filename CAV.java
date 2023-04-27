import java.util.Scanner;
import java. lang. Math. *;
public class CAV {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
System.out.println("enter the radius and length of a cylinder");
Double radius = input.nextDouble();
Double length = input.nextDouble();
Double area = radius * radius * Math.PI;
Double volume = area * length;
System.out.println("the area is " + area);
System.out.println("the voulume is " + volume);



	}

}
