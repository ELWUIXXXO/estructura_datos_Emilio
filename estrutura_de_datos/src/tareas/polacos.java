package tareas;


import estrutura_de_datos.prueba_pila;
import estrutura_de_datos.nodos.LinkedStack;
import estrutura_de_datos.nodos.nodo;
import java.util.Scanner;
import java.util.Stack;

public class polacos {

	public int polacos (String ecuacion) {
		int ordenOperacion;
		char operacion = 0; {
	}
        if (operacion == '+' || operacion == '-') {
            return 1;
        } else if (operacion == '*' || operacion == '/') {
            return 2;
        }
        return 0;
    }  
	
	public double resultadoPolacos (String operacion) {
        LinkedStack stack = new LinkedStack();
        String aux=" ";
        double a,b,resultado;
        for (int i=0; i<operacion.length();i++) {
        	if (operacion.charAt(i)>='0'&& operacion.charAt(i)<='9') {
                aux += operacion.charAt(i);
            }else {
            	if (aux.length() > 0) {
                    stack.push(aux); 
                    aux=""; 
                }
            	if (operacion.charAt(i)=='+') {
	                b = Double.parseDouble(String.valueOf(stack.pop()));
	                a = Double.parseDouble(String.valueOf(stack.pop()));
	                resultado = a+b;
	                stack.push(resultado);
            	}else if(operacion.charAt(i)=='-'){
            		b = Double.parseDouble(String.valueOf(stack.pop()));
	                a = Double.parseDouble(String.valueOf(stack.pop()));
	                resultado = a-b;
	                stack.push(resultado);
            	}else if(operacion.charAt(i)=='*'){
            		b = Double.parseDouble(String.valueOf(stack.pop()));
	                a = Double.parseDouble(String.valueOf(stack.pop()));
	                resultado = a*b;
	                stack.push(resultado);
            	}else if(operacion.charAt(i)=='/'){
            		b = Double.parseDouble(String.valueOf(stack.pop()));
	                a = Double.parseDouble(String.valueOf(stack.pop()));
	                resultado = a/b;
	                stack.push(resultado);
            	}
            }
        }
        

      return (double) stack.pop();
	}
}
