package vanco;



import java.util.Scanner;
import estrutura_de_datos.stack;
import java.util.Random;

public class retuirio {
	
    	public class java {

	}


		Random random = new Random();
    	Boolean salir = false;
    	Scanner leer = new Scanner (System.in);
    	
    	stack mil = new stack(1000);
    	stack quinientos = new stack(1000);
    	stack doscientos = new stack(1000);
    	stack cien = new stack(1000);
    	stack cincuenta = new stack(1000);
    	stack veinte = new stack(1000);
    	stack diez = new stack(1000);
    	stack cinco = new stack(1000);
    	
    	 int mil1 = 1000;
         int quinientos1 = 500;
         int doscientos1 = 200;
         int cien1 = 100;
         int cincuenta1 = 50;
         int veinte1 = 20;
         int diez1 = 10;
         int cinco1 =5;
         
         
         {
         
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
                        	while (dinero >= mil1) {
                        		
                        		dinero -= mil1;
                        		if (mil.size() >= 1000) {
                					mil.pop();
                				}else {
                					mil.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        		while (dinero >= quinientos1) {
                        		dinero -= quinientos1;
                        		if (quinientos.size() >= 1000) {
                					quinientos.pop();
                				}else {
                					quinientos.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= doscientos1) {
                        		dinero -= doscientos1;
                        		if (doscientos.size() >= 1000) {
                					doscientos.pop();
                				}else {
                					doscientos.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cien1) {
                        		dinero -= cien1;
                        		if (cien.size() >= 1000) {
                					cien.pop();
                				}else {
                					cien.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cincuenta1) {
                        		dinero -= cincuenta1;
                        		if (cincuenta.size() >= 1000) {
                					cincuenta.pop();
                				}else {
                					cincuenta.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= veinte1) {
                        		dinero -= veinte1;
                        		if (veinte.size() >= 1000) {
                					veinte.pop();
                				}else {
                					veinte.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= diez1) {
                        		dinero -= diez1;
                        		if (diez.size() >= 1000) {
                					diez.pop();
                				}else {
                					diez.push(1);
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cinco1) {
                        		dinero -= cinco1;
                        		if (cinco.size() >= 1000) {
                					cinco.pop();
                				}else {
                					cinco.push(1);
                				}
                        		
                            }
                        }
                        
                        
                    } else if (ope == 2) {
                    	// ESTE ES EL APARTADO DE EL RETIRO  
                    	System.out.println("Retiro");
                        int dinero = random.nextInt(9001);
                        System.out.println("El usuario " + numeroCuenta + "Esta Retirando " + dinero );
                        
                        if (dinero > 0) {
                        	while (dinero >= mil1) {
                        		
                        		dinero -= mil1;
                        		if (mil.size() >= 1000) {
                					mil.push(100);
                				}else {
                					mil.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        		while (dinero >= quinientos1) {
                        		dinero -= quinientos1;
                        		if (quinientos.size() >= 1000) {
                					quinientos.push(100);
                				}else {
                					quinientos.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= doscientos1) {
                        		dinero -= doscientos1;
                        		if (doscientos.size() >= 1000) {
                					doscientos.push(100);
                				}else {
                					doscientos.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cien1) {
                        		dinero -= cien1;
                        		if (cien.size() >= 1000) {
                					cien.push(100);
                				}else {
                					cien.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cincuenta1) {
                        		dinero -= cincuenta1;
                        		if (cincuenta.size() >= 1000) {
                					cincuenta.push(100);
                				}else {
                					cincuenta.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= veinte1) {
                        		dinero -= veinte1;
                        		if (veinte.size() >= 1000) {
                					veinte.push(100);
                				}else {
                					veinte.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= diez1) {
                        		dinero -= diez1;
                        		if (diez.size() >= 1000) {
                					diez.push(100);
                				}else {
                					diez.pop();
                				}
                        		
                            }
                        }
                        
                        if (dinero > 0) {
                        	while (dinero >= cinco1) {
                        		dinero -= cinco1;
                        		if (cinco.size() >= 1000) {
                					cinco.push(100);
                				}else {
                					cinco.pop();
                				}
                        		
                            }
                        }
                        
                        
                        
                    }
            	}
            	
            	break;
            	
            case 2:
            	
            	System.out.println("Billetes de mil en la pila: " + mil.size());
            	System.out.println("Billetes de quinientos en la pila: " + quinientos.size());
            	System.out.println("Billetes de doscientos en la pila: " + doscientos.size());
            	System.out.println("Billetes de cien en la pila: " + cien.size());
            	System.out.println("Billetes de cincuenta en la pila: " + cincuenta.size());
            	System.out.println("Billetes de veinte en la pila: " + veinte.size());
            	System.out.println("Monedas de diez en la pila: " + diez.size());
            	System.out.println("Monedas de cinco en la pila: " + cinco.size());
            	break;
            	
            case 3:
            	salir = true;
            	break;
            }
    	}
}
}


