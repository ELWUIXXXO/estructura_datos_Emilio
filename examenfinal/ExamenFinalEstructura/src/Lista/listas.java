package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Generar dos listas, donde el tamaño de estas será definido por el usuario, en estás listas se guardarán números aleatorios entre 1-100, 
//posteriormente estás se ordenarán. Una vez ordenadas los números repetidos en ambas se guardarán en una nueva lista de forma ordenada


public class listas {

	    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	 
	        System.out.print("tamaño de las listas");
	        int tamañoListas = leer.nextInt();

	        
	        List<Integer> lista1 = gererar(tamañoListas);
	        List<Integer> lista2 = gererar(tamañoListas);

	        System.out.println("Lista 1: " + lista1);
	        System.out.println("Lista 2: " + lista2);

	        
	        List<Integer> ordenados = repe(lista1, lista2);
	        System.out.println("numeros repetidos" + ordenados);
	    }

	    private static List<Integer> gererar(int tamaño) {
	        List<Integer> lista = new ArrayList<>();
	        for (int i = 0; i < tamaño; i++) {
	            int numero = (int) (Math.random() * 100) + 1; 
	            lista.add(numero);
	        }
	        Collections.sort(lista);
	        return lista;
	    }

	    private static List<Integer> repe(List<Integer> lista1, List<Integer> lista2) {
	        Set<Integer> setLista1 = new HashSet<>(lista1);
	        Set<Integer> setLista2 = new HashSet<>(lista2);

	        List<Integer> repetidos = new ArrayList<>(setLista1);
	        repetidos.retainAll(setLista2);

	        Collections.sort(repetidos);

	        return repetidos;
	    }
}

