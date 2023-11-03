package Ordenes;

import java.util.Scanner;

public class C3 {

	    public static void main(String[] args) {
	        String frase;
	        Scanner leer = new Scanner(System.in);

	        System.out.println("Ingresa frase o palabra:");
	        frase = leer.nextLine().toUpperCase();

	        StringBuilder resultado = new StringBuilder();

	        for (int i = 0; i < frase.length(); i++) {
	            char letra = frase.charAt(i);

	            if (letra == ' ') {
	                resultado.append(" ");
	            } else {
	            	
	                String binario = binario(letra);
	                String binarioResta = "01010101";
	                String resultadoResta = restaBinaria(binario, binarioResta);
	                resultado.append(resultadoResta);
	                resultado.append(" ");
	                
	            }
	        }

	        System.out.println("Frase convertida a binario");
	        System.out.println(resultado.toString());
	    }

	    public static String binario(char letra) {
	        String binario = Integer.toBinaryString(letra);
	        while (binario.length() < 8) {
	            binario = "0" + binario;
	        }
	        return binario;
	    }

	    public static String restaBinaria(String binario, String binarioResta) {
	        StringBuilder resultadoResta = new StringBuilder();
	        for (int i = 0; i < 8; i++) {
	        	
	            char bitValor = binario.charAt(i);
	            char bitResta = binarioResta.charAt(i);
	            
	            if (bitValor == '1' && bitResta == '0') {
	                resultadoResta.append("1"); 
	            } else if (bitValor == '0' && bitResta == '1') {
	                resultadoResta.append("1");
	            } else {
	                resultadoResta.append("0"); 
	            }
	            
	        }
	        return resultadoResta.toString();
	    }
	}

