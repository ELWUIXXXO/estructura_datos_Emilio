package Ordenamientos;

public class Quicksort {

public static void main(String[]args, int A[], int izq, int der) {

	  int pivote=A[izq]; // Primer elemento como pivote, variable A
	  int i=izq; // Variable i, empieza del lado izquierdo para buscar
	  int j=der; //Variable j, empieza del lado derecho para buscar
	  int aux; // Variable auxiliar
	 
	  while(i < j){ //Se evalua que no se crucen la búsqueda                                  
	     while(A[i] <= pivote && i < j) i++; // Busca elemento mayor que el pivote
	     while(A[j] > pivote) j--;  // Busca elemento menor que el pivote
	     if (i < j) {  // Evalua si no se han cruzado                      
	         aux= A[i]; // Intercambia las variables
	         A[i]=A[j]; // Iguala
	         A[j]=aux; // Iguala
	     }
	   }
	   
	   A[izq]=A[j]; // Se coloca el pivote                                    
	   A[j]=pivote; // Menores a su izquierda y los mayores a su derecha
	   
	   if(izq < j-1) // Evalua la posicion
	      quicksort(A,izq,j-1); // Ordenamos subarray izquierdo
	   if(j+1 < der) // Evalua su posicion
	      quicksort(A,j+1,der); // Ordenamos subarray derecho
	   
	}

private static void quicksort(int[] a, int izq, int i) {
	// TODO Auto-generated method stub
	
}
}