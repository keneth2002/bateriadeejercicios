package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Programa que lea tres números distintos y nos diga cuál de ellos es
		// el mayor
        Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese el primer valor : ");
		int A = lector.nextInt();
		System.out.println("Ingrese el segundo valor : ");
	    int B = lector.nextInt();
	    System.out.println("Ingrese el tercer valor : ");
	    int C = lector.nextInt();
	    
	    if(A>B && A>C){
	    	System.out.println("El valor " + A + " es mayor que los valores  " + B + " y " + C);
	    }if(B>A && B>C){
	    	System.out.println("El valor " + B + " es mayor que los valores  " + A + " y " + C);
	    }if(C>A && C>B){
	    	System.out.println("El valor " + C + " es mayor que los valores  " + A + " y " + B);
	    }
	}

}
