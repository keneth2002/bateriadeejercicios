package Bateriadeejercicios;

import java.util.Scanner;

public class ejercicioOnce {
	/*Programa que me calcule el cuadrado
	 * de los primeros 9 numeros
	 * naturales.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, resultado;
		while(n < 9) {
			n++;
			resultado = n * n;
			System.out.println("El cuadrado del numero " +n+ " es: " + resultado);
		}

	}

}
