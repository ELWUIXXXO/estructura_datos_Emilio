package ExamenDos;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class preguntaCuatro { //numeros aleatorios 1-50, sacar cuando sea 25
	
	
	   public static void main(String[] args) {
	       Queue<Integer> cola = new LinkedList<>();
	       int valorminimo = 1;
	       int valormaximo = 50;
	       int numerosacar = 25;

	       for (int i = 0; i < 50; i++) {
	           ThreadLocalRandom numera = ThreadLocalRandom.current();
	           int numeros = numera.nextInt(valorminimo, valormaximo + 1);
	           cola.add(numeros);
	       }

	       System.out.println("cola de numeros aleatorios " + cola);
	       int repetido = Collections.frequency(cola,numerosacar);
	       System.out.println("el numeor " + numerosacar + " se encontro " + repetido + " veces de la cola");

	   }
	}



     

    
      
