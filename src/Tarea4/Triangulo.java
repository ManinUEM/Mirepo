/**
 * @author Guillermo Garcia
 */

package Tarea4;

public class Triangulo {
	public static void main(String[] args) {
		double a;
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of: " + a);
		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of: " + a);
		a = triangleArea(9, 9, 9);
		System.out.println("A triangle with sides 9,9,9 has an area of: " + a);
	}

// Write your code here
	public static double triangleArea(int a, int b, int c) {
		float p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)) + Math.pow(p, 0.5);
	}
}