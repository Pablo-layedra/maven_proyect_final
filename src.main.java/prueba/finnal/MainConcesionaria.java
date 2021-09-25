package prueba.finnal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

public class MainConcesionaria extends Automovil{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		
		String opcion;
		int opcion2;
		
		List<Automovil> cantidadAutos = new ArrayList<Automovil>();
		Automovil marcaAuto= new Automovil();
		Automovil modeloAuto= new Automovil();
		Automovil placaAuto= new Automovil();
		
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
				System.out.println("Escoja el tipo de auto que desea ingresar: ");
				System.out.println();
				System.out.println("1. Auto Nacional ");
				System.out.println("2. Auto Importado");
				opcion2=teclado2.nextInt();
				
				if (opcion2==1) {
					System.out.println("Ingresar Marca del auto");
					String marca=teclado3.nextLine();
					System.out.println("Ingresar Modelo del auto");
					String modelo=teclado3.nextLine();
					System.out.println("Ingresar Año de fabricacion del auto");
					String año=teclado3.nextLine();
					System.out.println("Ingresar Placa del auto");
					String placa=teclado3.nextLine();
					System.out.println("Ingresar Kilometraje del auto");
					String kilometraje=teclado3.nextLine();
					
					
				}
				
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
