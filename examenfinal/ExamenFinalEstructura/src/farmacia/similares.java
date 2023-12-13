package farmacia;

import java.util.Scanner;

public class similares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int Producto;
		int Menu = 0;
		boolean similares = false;
	
		while (! similares) {
			
		}
		System.out.println("Qué deseas hacer?");
		System.out.println("1. ver por caducidad");
		System.out.println("2. Informacion de la máquina ");
		System.out.println("3. Agregar dinero ");
		Scanner leer = new Scanner (System.in);
		Menu = leer.nextInt();
		
		switch (Menu) {
		
		
		case 1:
			int menu1;
			boolean salirDos = false;
			
			while (!salirDos) {

				int ketorolaco=21/11/2017;
				int paracetamol=21/11/2017;
				int atrovent=21/11/2017;
				int fenitonnina=21/11/2017;
				System.out.println("ver por caducidad");
				System.out.println("1.ketorolaco"+ketorolaco);
				System.out.println("2.paracetamol"+paracetamol);
				System.out.println("3.atrovent"+atrovent);
				System.out.println("4.fenitonnina"+fenitonnina);
				menu1 = leer.nextInt();
			}
			break;
			
		case 2:
			
				int ketorolaco1=1023125697;
				int paracetamol1=1536849301;
				int atrovent1=1208793001;
				int fenitonnina1=468943015;
				System.out.println("ver por codigo de barras");
				System.out.println("1.ketorolaco"+ketorolaco1);
				System.out.println("2.paracetamol"+paracetamol1);
				System.out.println("3.atrovent"+atrovent1);
				System.out.println("4.fenitonnina"+fenitonnina1);
				menu1 = leer.nextInt();
			
			break;
			
		case 3:
				System.out.println("agregar productos");
				
			
			break;
		case 4:
			
			System.out.println("VENTAS");
			System.out.println("1.ingresa el producto");
			System.out.println("2.ingresa la cantidad	");
			System.out.println("3.ingresa el importe");
			menu1 = leer.nextInt();
			switch(Menu) {
			
			case 1:
				
			}
		case 5:
			
			System.out.println("Reporte de venta");
			System.out.println("que dia quiere ver?");
			menu1 = leer.nextInt();
			
		case 6:
			
			System.out.println("ingresar productos");
			System.out.println("producto");
			System.out.println("fecha de caducdada");


			
		default:
			System.out.println("opcion no valida");
			}		
		}
}
