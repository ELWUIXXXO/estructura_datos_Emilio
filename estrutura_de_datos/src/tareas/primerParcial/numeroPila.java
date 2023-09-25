package primerParcial;
import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

public class numeroPila{
public static void main(String[] args) {
		
Random numero = new Random();
Scanner leer = new Scanner(System.in);
Stack pila = new Stack ();
Stack pilaSuma = new Stack ();
int aleatorio = 0;
boolean salir = false;
		
while (!salir) {
aleatorio = numero.nextInt(100);

 if (aleatorio != 100) {
 pila.push(numero);
 System.out.println("numeros: " + aleatorio);
 }
 else if (aleatorio == 50) {
	 int suma = 0;
	        suma = (int) pila.push(numero);
 salir = true;
}
}
}
}