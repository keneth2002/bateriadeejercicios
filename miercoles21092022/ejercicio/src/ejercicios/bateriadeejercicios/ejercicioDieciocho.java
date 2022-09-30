package Bateriadeejercicios;

import java.util.Scanner;

public class ejercicioDieciocho {
	/*Programa que me denoten la fecha, dia y mes
	 * si no es valida que imprima error*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, año;
		System.out.println("Ingrese dia: ");
		dia = sc.nextInt();
		System.out.println("Ingrese mes: ");
		mes = sc.nextInt();
		System.out.println("Ingrese año: ");
		año = sc.nextInt();
		
		if(dia <= 31) {
			System.out.println(+ dia );
		}else {
			System.out.println("No es valido");
		}
		if(mes <= 12) {
			System.out.println(+ mes);
		}else {
			System.out.println("ERROR");
		}
		if(año > 0) {
			System.out.println(+ año );
		}

	}


}
