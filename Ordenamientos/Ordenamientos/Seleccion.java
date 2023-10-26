package Ordenamientos;

public class Seleccion {

	public static void main(String[]args, int A[]) {
        int i, j, menor, pos, tmp; // Declaracion de variables
        for (i = 0; i < A.length - 1; i++) {  // Se toma como menor el primero
              menor = A[i]; // Elementos que quedan por ordenar                    
              pos = i;  // Se guarda su posicion
              for (j = i + 1; j < A.length; j++){ // 1° ciclo
                    if (A[j] < menor) { // Se evalua
                        menor = A[j];  // Menor que el actual
                        pos = j; // Se guarda la posicion
                    }
              }
              if (pos != i){ // Se evalua                      
                  tmp = A[i]; // Igualacion
                  A[i] = A[pos]; // Igualacion
                  A[pos] = tmp; // Igualacion-
              }
        }
}
}
