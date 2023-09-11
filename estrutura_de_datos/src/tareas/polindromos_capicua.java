package tareas;

import java.util.Scanner;

public class polindromos_capicua {

	

	public static void main (String[]args) {
		try (Scanner write = new Scanner (System.in)) {
			System.out.println("Palabras palíndromas o Números capicúa");
			System.out.println("1. Palabras palíndromas");
			System.out.println("2. Números capicúa");
			
			System.out.println("Escoja una opcion");
			int opcion=write.nextInt();
			
			switch (opcion) {
			case 1:
				Scanner s =new Scanner (System.in);
				String palabra;
				char [] palindromo;
				int izq, der;
				System.out.println("Ingresa la palabra ");
				palabra = s.nextLine();
				palabra= palabra.toLowerCase();
				palabra= palabra.replace(" ","");
				palindromo = palabra.toCharArray();
				izq = 0;
				der = palindromo.length -1;
				while (izq < der) {
					if (palindromo[izq]==palindromo[der]) {
						der--;
						izq++;
					}else {
						System.out.println("La palabra no es un palindromo");
						break;
					}
				}
				if (izq == der) {
					System.out.println("La palabra es palindromo");
				}
				break;
				
			case 2:
				
					
							int N,inicio,fin;
							String aux;
							boolean capi = true;
							
							Scanner leer =new Scanner (System.in);
							System.out.println("Ingresa un número");
							N = leer.nextInt();
							
							aux = Integer.toString(N);
							inicio=0;
							fin=aux.length()-1;
							
							while((capi)&&(inicio < fin)) {
								if (aux.charAt(inicio)==aux.charAt(fin)){
									inicio++;
									fin --;
								}else {
									capi=false;
								}
							}
							
							if (capi) {
								System.out.println("El núimero es capicúa");
							}else {
								System.out.println("El núimero no es capicúa");
							} 
					
							break;
				
				}
		}
			
			
				
	}
	
}