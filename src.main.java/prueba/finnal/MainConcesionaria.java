package prueba.finnal;

import java.util.Scanner;

public class MainConcesionaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String opcion;
		
		do {
			System.out.println("##################################");
			System.out.println();
			System.out.println("CONCESIONARIA AMBACAR: elija una opcion");
			System.out.println();
			System.out.println("1. Ingresar auto ");
			System.out.println("2. Consultar auto");
			System.out.println("3. Actualizar Kilometraje");
			System.out.println("4. Imprimir reporte");
			System.out.println("5. SALIR");
			System.out.println();
			System.out.println("##################################");
			
			opcion=teclado.nextLine();
			
			switch(opcion) {
			case "1":
				System.out.println("Ingresar numero de cuenta: ");
				System.out.println();
				break;
			case "2":
				System.out.println("No existen pagos ");
				break;
			case "3":
				System.out.println("Cerrando el sistema ");
				break;
			default:
				System.out.println("No ha elejido ninguna opcion valida");
				break;
			}
			
		}while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}
}
