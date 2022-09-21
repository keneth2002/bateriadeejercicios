package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Realizar un programa que lea un número por teclado. En caso de que
		//ese número sea 0 o menor que 0, se saldrá del programa
		//imprimiendo antes un mensaje de error. Si es mayor que 0, se deberá
		//calcular su cuadrado y la raíz cuadrada del mismo, visualizando el
		//número que ha tecleado el usuario y su resultado (“Del número X, su
		//potencia es X y su raíz X”).
		
		Scanner lector = new Scanner(System.in);
		System.out.println("ingrese un valor :");
		double A = lector.nextDouble();
		
		if(A>0) {
		 double potencia = Math.pow(A, 2);
		 double raiz = Math.sqrt(A);
		 System.out.println("El valor ingresado es :" + A);
		 System.out.println("La potencia del valor es :"  + potencia);
		 System.out.println("Su raiz cuadrada es :"  + raiz);
		}if (A<0) {
			System.out.println("ERROR, POR FAVOR INGRESAR UN NUMERO POSITIVO");
			System.exit(1);
		}
	}

}
