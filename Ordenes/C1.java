package Ordenes;

import java.util.Random;
import java.util.Scanner;

public class C1 {
	
	    public static void main(String[] args) {
	       
	        char[][] matrizLetra = {
	            {'A', 'B', 'C', 'D', 'E', 'F'},
	            {'G', 'H', 'I', 'K', 'L', 'M'},
	            {'N', 'O', 'P', 'Q', 'R', 'S'},
	            {'T', 'U', 'V', 'W', 'X', 'Y'},
	            {'Z', '0', '1', '2', '3', '4'},
	            {'5', '6', '7', '8', '9', '-'}
	        };
	        
	        Scanner leer = new Scanner(System.in);
	        Random random = new Random();
	        
	     
	        char[] numerosLetrasGenerados = new char[33];

	        for (int i = 0; i < 33; i++) {
	            int randomNumber = random.nextInt(26);
	            char randomLetter = (char) ('A' + randomNumber);
	            numerosLetrasGenerados[i] = randomLetter;
	        }

	        System.out.println("Escribe la palabra");
	        String palabra = leer.nextLine().toUpperCase(); 

	        for (int i = 0; i < palabra.length(); i++) {
	            char letra = palabra.charAt(i);

	            if (letra == 'J') {
	                letra = 'I';
	            }
	            if (letra == 'Ñ') {
	                letra = 'N';
	            } 

	            for (int filas = 0; filas < 6; filas++) {
	                for (int columnas = 0; columnas < 6; columnas++) {
	                    if (matrizLetra[filas][columnas] == letra) {
	                        System.out.print(numerosLetrasGenerados[filas * 6 + columnas] + " ");
	                        break;
	                    }
	                }
	            }
	        }
	    }
	}
 
