import java.util.Scanner;
public class Diagonal {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double[][] m= new double[4][4];
System.out.println("Enter a 4 by 4 matrix row by row");

for(int i = 0; i<m.length; i++) {
	for(int j = 0; j<m[0].length; j++) {
		m[i][j] = in.nextDouble();
		
	}
}
System.out.printf("Sum of the elements in the major diagonal is 0.1f", sumMajorDiagonal(m));

public static double sumMajorDiagonal (double[][] m1) {
	double sum = 0.0;
	for(int i = 0; i< m.length; i++) {
		sum += m1[i][i];
		
	}
	return sum;
}
	}

}
