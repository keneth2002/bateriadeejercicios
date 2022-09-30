package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
	//Programa que nos diga si una persona puede acceder a 
	//cursar un ciclo formativo de grado superior o no. Para acceder a un grado superior, si se tiene un
	//título de bachiller, en caso de no tenerlo,
	//se puede acceder si hemos superado una prueba 
	//de acceso (admisión).
     
	Scanner lector = new Scanner(System.in);
	System.out.println("Ingrese una opcion  :");
	System.out.println("1.TITULO DE BACHILLER");
	System.out.println("2.EXAMEN DE ADMISION APROBADO");
	System.out.println("3.EXAMEN DE ADMISION REAPROBADO");
	System.out.println("4.NINGUNA DE LAS ANTERIORES");
   int op= lector.nextInt();
   
	
   switch (op){
   case 1:
	   System.out.println("USTED PUEDE CURSAR EL CICLO FORMATIVO DE GRADO SUPERIOR");
	break;
   case 2:
	   System.out.println("USTED PUEDE CURSAR EL CICLO FORMATIVO DE GRADO SUPERIOR");
	   break;
   case 3:
	   System.out.println("USTED NO PUEDE CURSAR EL CICLO FORMATIVO DE GRADO SUPERIOR");
	   break;
   case 4:
	   System.out.println("AL NO TENER NINGUNA DE LAS OPCIONES REQUERIDAS, USTED NO PUEDE CURSAR EL CICLO FORMATIVO DE GRADO SUPERIOR");
	   break;
   
   
   }
	}
}
