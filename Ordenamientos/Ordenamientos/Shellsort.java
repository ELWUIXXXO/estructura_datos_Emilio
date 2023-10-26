package Ordenamientos;

public class Shellsort {

	public class Quicksort {

		public static void main(String[]args,int A[]) {

	        int salto, aux, i; // declara variable salto, declara variable auxiliar
	        boolean cambios; // tipo de dato
	  
	        for (salto = A.length / 2; salto != 0; salto /= 2) { // 1° ciclo 
	            cambios = true; // Validacion 
	            while (cambios) { // Intercambio elemento                                         
	                cambios = false; //Validacion
	                for (i = salto; i < A.length; i++) // 2° ciclo
	                {
	                    if (A[i - salto] > A[i]) { // Están desordenados??
	                        aux = A[i]; // se reordenan
	                        A[i] = A[i - salto]; // Se evalua
	                        A[i - salto] = aux; // Se evalua
	                        cambios = true; // cambio                                   
	                    }
	                }
	            }
	        }
	}
	}
}
