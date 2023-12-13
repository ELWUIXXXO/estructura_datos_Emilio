package bibliotek;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class biblio {
 

	   public static void main(String[] args) {
	       List<Integer> lista = new ArrayList<>();
	       int valorMinimo = 1990;
	       int valorMaximo = 2007;
	       int numeroLibroMin = 1;
	       int numeroLibroMAx = 10;
	       
	       for (int i = 0; i < 10; i++) {
	           int año = ThreadLocalRandom.current().nextInt(valorMinimo, valorMaximo + 1);
	           int numero = ThreadLocalRandom.current().nextInt(numeroLibroMin, numeroLibroMAx + 1);
	           lista.add(año,numero);
	           System.out.println("lista libros" + lista);
	           
	           
	       }
}
}
