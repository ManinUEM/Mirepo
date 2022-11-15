/**
 * @author Guillermo Garcia
 */

package Tarea7;

import java.io.IOException;
import java.util.Scanner;

public class Circulo {
// Constant PI is defined at the class level
	static final double PI = 3.14;

	void getArea() throws IOException {
// Method used to calculate area of a circle
		Scanner scanner = new Scanner(System.in);
		double raidus = 0;
		System.out.print("Enter the radius: ");
		raidus = scanner.nextInt();

		double area = Math.PI * (raidus * raidus);
		System.out.print("Area of circle is: " + area);
		scanner.close();
	}

	public static void main(String args[]) throws IOException {
		Circulo c1 = new Circulo();
		c1.getArea();
	}
}