package ExamenDos;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.concurrent.ThreadLocalRandom;

public class preguntaTres { //lista de 50 numeros 1-100 obtener media aritmetica, moda y mediana

	
	   public static void main(String[] args) {
	       List<Integer> lista = new ArrayList<>();
	       int valorminimo = 1;
	       int valormaximo = 100;

	       for (int i = 0; i < 50; i++) {
	           int numero = ThreadLocalRandom.current().nextInt(valorminimo, valormaximo + 1);
	           lista.add(numero);
	           System.out.println("lista numeros " + lista);
	       }

	       double sum = lista.stream().mapToInt(Integer::intValue).sum();
	       double aritmetica = sum / lista.size();
	       System.out.println("aritmetica" + aritmetica);

	       Map<Integer, Long> frequencyMap = lista.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
	       int moda = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
	       System.out.println("moda" + moda);

	       
	   }
	}

