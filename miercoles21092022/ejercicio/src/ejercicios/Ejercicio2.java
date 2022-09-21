package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Programa que lea dos números y nos diga cuál de ellos es mayor o
		// bien si son iguales.
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese el primer valor : ");
		int A = lector.nextInt();
		System.out.println("Ingrese el segundo valor : ");
	    int B = lector.nextInt();
		
		if( A<B) {
			System.out.println("El valor " + B + " es mayor que el valor "   + A);
		} if (A>B) {
			System.out.println("El valor " + A + " es mayor que el valor "   + B);
		}if (A==B) {
			System.out.println("Los valores son iguales ");
		}
		

	}

}
