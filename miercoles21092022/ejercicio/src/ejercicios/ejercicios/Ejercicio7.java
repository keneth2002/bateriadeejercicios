package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public final static double DESCUENTO = 0.15;
	public static void main(String[] args) {
		// Una tienda ofrece un descuento del 15% sobre el total 
		//de la compra durante el mes de febrero. Dado un mes 
		//y un importe (monto), calcular cuál es la cantidad que se debe cobrar al cliente.
        Scanner lector =new Scanner (System.in);
        System.out.println("Enero , Febrero, Marzo, Abril, Mayo, Junio, Julio,  Agosto, Septiembre, Octubre, Noviembre, Diciembre ");
        System.out.print("Ingrese el mes de su compra :");
        String mes=lector.nextLine();
        System.out.println("Ingrese su monto a pagar :");
        int monto=lector.nextInt();
        double montodes = monto * DESCUENTO;
        double montototal = monto - montodes;
        System.out.println("El monto a pagar el mes de " + mes + " con el descuento del 15% es de : " + montototal);
        
	}

}
