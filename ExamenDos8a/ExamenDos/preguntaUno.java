package ExamenDos;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;

public class preguntaUno { //ingresar 5 palabras, de cada uuna guardar las vocales en una cola y en otra las consonantes 
							// contar cuantas veces se repiute cada letra de cada cola vovales y consonantes


	 public static void main(String[] args) {
	    Queue<Character> vocales = new LinkedList<>();
	    Queue<Character> consonantes = new LinkedList<>();
	    Scanner leer = new Scanner(System.in);
	    HashMap<Character, Integer> repetidasVocales = new HashMap<>();
	    HashMap<Character, Integer> repetidasConsonantes = new HashMap<>();

	    for (int i = 0; i < 5; i++) {
	    	System.out.println("ingresa las palabras");
	    	System.out.println(" palabra " + (i + 1));
	        String palabra = leer.nextLine();

	        for (char letra : palabra.toCharArray()) {
	            if ("aeiou".contains(String.valueOf(letra))) {
	               vocales.add(letra);
	               repetidasVocales.put(letra, repetidasVocales.getOrDefault(letra, 0) + 1);
	            } else if (Character.isLetter(letra)) {
	               consonantes.add(letra);
	               repetidasConsonantes.put(letra, repetidasConsonantes.getOrDefault(letra, 0) + 1);
	            }
	        }
	    }

	    System.out.println("vocales" + vocales);
	    System.out.println("consonantes" + consonantes);
	    System.out.println("vocales repetidass " + repetidasVocales);
	    System.out.println("consonantes repetidas" + repetidasConsonantes);
}
	 
}

