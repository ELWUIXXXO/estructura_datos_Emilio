package vanco;

import java.util.Scanner;
import estrutura_de_datos.stack;
import java.util.Random;

public class caja {
	public class java {

	}

	public static void main(String[] args) {
		stack milUno = new stack(1000);
		stack quinientosUno = new stack(1000);
		stack doscientosUno = new stack(1000);
		stack cienUno = new stack(1000);
		stack cincuentaUno = new stack(1000);
		stack veinteUno = new stack(1000);
		stack diezUno = new stack(1000);
		stack cincoUno = new stack(1000);
		
    	int milDos = 1000;
        int quinientosDos = 500;
        int doscientosDos = 200;
        int cienDos = 100;
        int cincuentaDos = 50;
        int veinteDos = 20;
        int diezDos = 10;
        int cincoDos = 5;
		
        


    	Random random = new Random();
    	Boolean salir = false;
    	Scanner leer = new Scanner (System.in);
         
    	while (!salir){
    		 long numeroCuenta = 0;
  	        
             for (int i = 0; i < 12; i++) {
     	            int digito = random.nextInt(10); 
     	            numeroCuenta = numeroCuenta * 10 + digito;
             }
    		System.out.println("Se repite controlado");
            System.out.println("1.Si");
            System.out.println("2.Estado");
            System.out.println("3.No");
            int opcion;
            opcion  = leer.nextInt();
            switch (opcion){
            case 1:
            	
            	//AQUI ESTA EL FOR PARA SABER SI ES RETIRO O DEPOSITO
            	for (int i = 0; i < 1; i++) {
                    // Generar un número aleatorio entre 1 y 2
                    int ope;// = random.nextInt(2) + 1;
                    System.out.println("Deposito=1 Retiro = 2");
                    ope = leer.nextInt();
                    
                    
                    if (ope == 1) {
                    	
                    	//DESDE AQUI EMPIEZAN LOS DEPOSITOS  
                    	System.out.println("Depositos");
                    	
                        int dinero = random.nextInt(9001);
                        System.out.println("El usuario " + numeroCuenta + "Esta Depositando " + dinero );
                        
                        if (dinero > 0) {
                        	while (dinero >= milDos) {
                        		
                        		dinero -= milDos;
                        		if (milUno.size() >= 1000) {
                					milUno.pop();
                				}else {
                					milUno.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        		while (dinero >= quinientosDos) {
                        		dinero -= quinientosDos;
                        		if (quinientosUno.size() >= 1000) {
                					quinientosUno.pop();
                				}else {
                					quinientosUno.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= doscientosDos) {
                        		dinero -= doscientosDos;
                        		if (doscientosUno.size() >= 1000) {
                					doscientosUno.pop();
                				}else {
                					doscientosUno.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cienDos) {
                        		dinero -= cienDos;
                        		if (cienUno.size() >= 1000) {
                					cienUno.pop();
                				}else {
                					cienUno.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cincuentaDos) {
                        		dinero -= cincuentaDos;
                        		if (cincuentaUno.size() >= 1000) {
                					cincuentaUno.pop();
                				}else {
                					cincuentaUno.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= veinteDos) {
                        		dinero -= veinteDos;
                        		if (veinteUno.size() >= 1000) {
                					veinteUno.pop();
                				}else {
                					veinteUno.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= diezDos) {
                        		dinero -= diezDos;
                        		if (diezUno.size() >= 1000) {
                					diezUno.pop();
                				}else {
                					diezUno.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cincoDos) {
                        		dinero -= cincoDos;
                        		if (cincoUno.size() >= 1000) {
                					cincoUno.pop();
                				}else {
                					cincoUno.push(1);
                				}
                        		
                            }
                        }
                        
                        
                    } else if (ope == 2) {
                    	// ESTE ES EL APARTADO DE EL RETIRO  
                    	System.out.println("Retiro");
                        int dinero = random.nextInt(9001);
                        System.out.println("El usuario " + numeroCuenta + "Esta Retirando " + dinero );
                        
                        if (dinero > 0) {
                        	while (dinero >= milDos) {
                        		
                        		dinero -= milDos;
                        		if (milUno.size() >= 1000) {
                					milUno.push(100);
                				}else {
                					milUno.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        		while (dinero >= quinientosDos) {
                        		dinero -= quinientosDos;
                        		if (quinientosUno.size() >= 1000) {
                					quinientosUno.push(100);
                				}else {
                					quinientosUno.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= doscientosDos) {
                        		dinero -= doscientosDos;
                        		if (doscientosUno.size() >= 1000) {
                					doscientosUno.push(100);
                				}else {
                					doscientosUno.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cienDos) {
                        		dinero -= cienDos;
                        		if (cienUno.size() >= 1000) {
                					cienUno.push(100);
                				}else {
                					cienUno.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cincuentaDos) {
                        		dinero -= cincuentaDos;
                        		if (cincuentaUno.size() >= 1000) {
                					cincuentaUno.push(100);
                				}else {
                					cincuentaUno.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= veinteDos) {
                        		dinero -= veinteDos;
                        		if (veinteUno.size() >= 1000) {
                					veinteUno.push(100);
                				}else {
                					veinteUno.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= diezDos) {
                        		dinero -= diezDos;
                        		if (diezUno.size() >= 1000) {
                					diezUno.push(100);
                				}else {
                					diezUno.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cincoDos) {
                        		dinero -= cincoDos;
                        		if (cincoUno.size() >= 1000) {
                					cincoUno.push(100);
                				}else {
                					cincoUno.pop();
                				}
                        		
                            }
                        }
                        
                        
                        
                    }
            	}
            	
            	break;
            	
            case 2:
            	
            	System.out.println("Billetes de mil en la pila: " + milUno.size());
            	System.out.println("Billetes de quinientos en la pila: " + quinientosUno.size());
            	System.out.println("Billetes de doscientos en la pila: " + doscientosUno.size());
            	System.out.println("Billetes de cien en la pila: " + cienUno.size());
            	System.out.println("Billetes de cincuenta en la pila: " + cincuentaUno.size());
            	System.out.println("Billetes de veinte en la pila: " + veinteUno.size());
            	System.out.println("Monedas de diez en la pila: " + diezUno.size());
            	System.out.println("Monedas de cinco en la pila: " + cincoUno.size());
            	break;
            	
            case 3:
            	salir = true;
            	break;
            }
            }
        
		
		
	}
}



