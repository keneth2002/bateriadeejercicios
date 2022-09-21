package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Diseñar un programa que pida por teclado tres números; si el
		//primero es negativo, debe imprimir el producto de los tres y si no lo
		//es, imprimirá la suma.
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese el primer valor : ");
		int A = lector.nextInt();
		System.out.println("Ingrese el segundo valor : ");
	    int B = lector.nextInt();
	    System.out.println("Ingrese el tercer valor : ");
	    int C = lector.nextInt();
	    
	    if(A<0){
	    	System.out.println("Ya que el primer valor es negativo el producto de estos es:  " +  A*B*C);
	    	
	    }if(A>0){
	    	int SUMA = A + B + C;
	    	System.out.println("Ya que el primer valor es positivo la suma de estos es : " + SUMA);
	    }

	}

}
