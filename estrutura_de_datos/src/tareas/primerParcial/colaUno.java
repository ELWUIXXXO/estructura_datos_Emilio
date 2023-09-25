package primerParcial;


import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

	public class colaUno {
	    public static void main(String[] args) {
	        Queue<Integer> queve = new LinkedList<>();
	        Random aleatorio = new Random();
	        
	        
	        for (int i = 0; i < 50; i++) {
	            int numeroAleatorio = aleatorio.nextInt(50) + 1;
	            queve.add(numeroAleatorio);
	        }
	        
	       
	        System.out.println("números aleatorios:");
	        Integer[] suma;
			for (Integer numero : suma = queve) {
	        	   
	            System.out.print(" suma de los numeros " + suma);
	        }
	    }
	}


