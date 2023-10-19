package vanco;

	
	import java.util.Random;

	import estrutura_de_datos.stack;

	import java.io.*;
	import java.nio.file.*;

	
	public class vancoUno {
		

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
		int cinco1 = 5;
		long temporizador = 0;
		int tiempo = 0;
		Random random = new Random();
		

	public void retiro (int dinero, long numeroCuenta) {
		
		System.out.println("El usuario " + numeroCuenta + "Esta Depositando " + dinero );
		for (int i = 0; i < 5; i++) {
	          tiempo = random.nextInt(200); 
	          temporizador = temporizador * 5 + tiempo;
	  }
		try {
	    
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
	    Thread.sleep(tiempo);
		}catch (InterruptedException e){
			
		}
	}

	public void deposito (int dinero, long numeroCuenta) 
	{System.out.println("El usuario " + numeroCuenta + "Esta Retirando " + dinero );
	for (int i = 0; i < 5; i++) {
	    tiempo = random.nextInt(200); 
	    temporizador = temporizador * 5 + tiempo;
	}
	try {
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
	Thread.sleep(tiempo);
	}catch (InterruptedException e){
		
	}
	}
	public static void main(String[] args) {
		long intervalo = 5000;//AUTOMATIZA ??
	}
	public void cliente (long numeroCuenta) {
		for (int i = 0; i < 1; i++) {
			 int transaccion; 
			 Random random = new Random();
			 transaccion = Math.abs(random.nextInt() % 2);
			 int dinero = random.nextInt(9001);
			
		
	        if (transaccion == 1) {
	        	retiro (dinero, numeroCuenta);
	        }else if (transaccion != 1) {
	        	deposito (dinero, numeroCuenta);
	        }
		}
	}
	}
	