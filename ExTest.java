package Homework4;

import java.util.Scanner;

public class ExTest {
	private static final Exception ArithmeticException = null;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("input number a:");
		int a = input.nextInt();
		System.out.println("Input number b: ");
		int b = input.nextInt();
		System.out.println("Input number c: ");
		int c = input.nextInt();
		try {
			PTbac2(a, b, c);
		} catch (DeltaExceptionByZero e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ArithmeticException e1) {
			System.out.println("A>0");
		}
	}

	public static void PTbac2(int a, int b, int c) throws DeltaExceptionByZero {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Equations have no solutions.");
			} else {
				System.out.println("Equation has one solution: " + "x = " + (-c / a));
			}
			throw new java.lang.ArithmeticException();
		}
		int delta, x1, x2;
		delta = (int) Math.pow(b, 2) - 4 * a * c;
		if (delta > 0) {
			x1 = (int) (-b + Math.sqrt(delta) / (2 * a));
			x2 = (int) (-b - Math.sqrt(delta) / (2 * a));
			System.out.println("Equation has two solution: " + "x1: " + x1 + "x2: " + x2);
		}
		if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			System.out.println("Equations have double solutions: " + "x: " + x1);
		}
		if (delta < 0) {
			throw new DeltaExceptionByZero(delta);
		}
	}

}
