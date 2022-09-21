package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Dadas dos variables numéricas A y B, que el usuario debe teclear, se
		//pide realizar un programa que intercambie los valores de
		//ambas variables y muestre cuánto valen al final las dos variables
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingrese el valor de A");
		int A = teclado.nextInt();
        
		System.out.println("Ingrese el valor de B");
		int B = teclado.nextInt();

        System.out.println("El valor de A es :"  + B);	
        System.out.println("El valor de B es :"  + A);
	}
}
