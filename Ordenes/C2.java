package Ordenes;

import java.util.Scanner;

public class C2 {

	
	    public static void main(String[] args) {
	        
	        char[][] matrizLetra = {
	            {'A', 'B', 'C', 'D', 'E'},
	            {'F', 'G', 'H', 'I', 'K'},
	            {'L', 'M', 'N', 'O', 'P'},
	            {'Q', 'R', 'S', 'T', 'U'},
	            {'V', 'W', 'X', 'Y', 'Z'}
	        };
	        Scanner leer = new Scanner(System.in);
	        
	        System.out.println("|     |  1  |  2  |  3  |  4  |  5  |");
	        System.out.println("|  1  |  A  |  B  |  C  |  D  |  E  |");
	        System.out.println("|  2  |  F  |  G  |  H  | I,J |  K  |");
	        System.out.println("|  3  |  L  |  M  | N,Ñ |  O  |  P  |");
	        System.out.println("|  4  |  Q  |  R  |  S  |  T  |  U  |");
	        System.out.println("|  5  |  V  |  W  |  X  |  Y  |  Z  |");
	        System.out.println("Escribe tu palabra");
	        String palabra = leer.nextLine().toUpperCase(); 

	        for (int i = 0; i < palabra.length(); i++) {
	            char letra = palabra.charAt(i);

	            if (letra == 'J') {
	                letra = 'I'; 
	            }
	            if (letra == 'Ñ') {
	            	letra = 'N';
	            }

	           
	                for (int filas = 0; filas < 5; filas++) {
	                	
	                    for (int columnas = 0; columnas < 5; columnas++) {
	                    
	                    	if (matrizLetra[filas][columnas] == letra) {
	                            System.out.print((filas + 1) + "" + (columnas + 1) + " ");
	                            break;
	                        
	                    	}
	                    }
	                    
	                }
	                
	        }
		}
	}

