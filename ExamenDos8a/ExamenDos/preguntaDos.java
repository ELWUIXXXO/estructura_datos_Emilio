package ExamenDos;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom; 

public class preguntaDos { //se agregar 50 numeros 1-50 a una cola y agregar los numeros que no se repitan en la cola a una lista


	public static void main(String[] args) {
	      Queue<Integer> cola = new LinkedList<>();
	      int valorminimo = 1;
	      int valormaximo = 50;{
	      
	      for (int i = 0; i < 50; i++) {
	          ThreadLocalRandom numero = ThreadLocalRandom.current();
	          int numera = ThreadLocalRandom.current().nextInt(valorminimo, valormaximo + 1);
	          cola.add(numera);
	      }

	      System.out.println("cola de numeros aleatorios" + cola);
	      List<Integer> listaunico = new ArrayList<>(new LinkedHashSet<>(cola));
	      System.out.println("lista de numeros no repetidos" + listaunico);
	  
	  }
}
}




    



