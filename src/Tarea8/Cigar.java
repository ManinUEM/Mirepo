package Tarea8;

/**
 * 
 *  @author Grupo
 */
import java.util.Scanner;

public class Cigar {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int cigars = 0;
		boolean isWeekend = false, success = false;
		System.out.println("Enter number of cigars:");
		cigars = scanner.nextInt();
		System.out.println("Is it a weekend?Enter (true/false):");
		isWeekend = scanner.nextBoolean();
		success = cigarParty(cigars, isWeekend);
		System.out.println("party successful:" + success);
		scanner.close();
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {

		return cigars >= 40 && cigars <= 60;

	}

}