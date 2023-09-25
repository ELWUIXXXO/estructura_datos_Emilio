package tareas;

import java.util.Scanner;
import estrutura_de_datos.stack;
import Colas.CircularQueve;

	
public class maquina_expendedora {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int Producto;
			int Menu;
			boolean dispensadora = false;
			
			stack Cincuenta = new stack(100);
			stack Uno = new stack(100);
			stack Dos = new stack(100);
			stack Cinco = new stack(100);
			stack Diez = new stack(100);
			stack Veinte = new stack(100);
			
			
		
			CircularQueve Cafe = new CircularQueve (10);
			CircularQueve Coca = new CircularQueve (10);
			CircularQueve Agua = new CircularQueve (10);
			CircularQueve Papas = new CircularQueve (10);
			CircularQueve Galletas = new CircularQueve (10);
			
			while (! dispensadora) {
			
				System.out.println("Qué deseas hacer?");
				System.out.println("1. Agregar algún producto");
				System.out.println("2. Informacion de la máquina ");
				System.out.println("3. Agregar dinero ");
				System.out.println("4. Comprar");
				System.out.println("5. Salir");
				Scanner leer = new Scanner (System.in);
				Menu = leer.nextInt();
				
				switch (Menu) {
				
				
				case 1:
					int menu1;
					boolean salirDos = false;
					
					while (!salirDos) {
						System.out.println("Agregar producto");
						System.out.println("¿Que producto desea agregar?");
						System.out.println("1.Cafe");
						System.out.println("2.Coca");
						System.out.println("3.Agua");
						System.out.println("4.Papas");
						System.out.println("5.Galletas");
						System.out.println("6.Salir");
						menu1 = leer.nextInt();
						
						switch (menu1) {
						case 1:
							if (Cafe.size() >= 10) {
								System.out.println("Ya no se pueden agregar más productos aquí");
							}else {
								Cafe.enqueve(1);
								System.out.println("Hay " + Cafe.size() + " Cafe de 10");
							}
							break;
						case 2:
							if (Coca.size() >= 10) {
								System.out.println("Ya no se pueden agregar más productos aquí");
							}else {
								Coca.enqueve(1);
								System.out.println("Hay " + Coca.size() + " Coca de 10");
							}
							break;
						case 3:
							if (Agua.size() >= 10) {
								System.out.println("Ya no se pueden agregar más productos aquí");
							}else {
								Agua.enqueve(1);
								System.out.println("Hay " + Agua.size() + " Agua de 10");
							}
							break;
						case 4:
							if (Papas.size() >= 10) {
								System.out.println("Ya no se pueden agregar más productos aquí");
							}else {
								Papas.enqueve(1);
								System.out.println("Hay " + Papas.size() + " Papas de 10");
							}
							break;
						case 5:
							if (Galletas.size() >= 10) {
								System.out.println("Ya no se pueden agregar más productos aquí");
							}else {
								Galletas.enqueve(1);
								System.out.println("Hay " + Galletas.size() + " Galletas de 10");
							}
							break;
						case 6:
							System.out.println("Salio de la opcion agregar.");
							salirDos = true;
							break;
						}
					}
					break;
					
				
				case 2:
					System.out.println("Hay " + Cafe.size() + " Cafes de 10");
					System.out.println("Hay " + Coca.size() + " Cocas de 10");
					System.out.println("Hay " + Agua.size() + " Aguas de 10");
					System.out.println("Hay " + Papas.size() + " Papas de 10");
					System.out.println("Hay " + Galletas.size() + " Galletas de 10");
					System.out.println("Monedas de $.50 " + "Hay " + Cincuenta.size() + " monedas");
	                System.out.println("Monedas de $1: " + "Hay " + Uno.size() + " monedas");
	                System.out.println("Monedas de $2 " + "Hay " + Dos.size() + " monedas");
	                System.out.println("Monedas de $5 " + "Hay " + Cinco.size() + " monedas");
	                System.out.println("Monedas de $10 " + "Hay " + Diez.size() + " monedas");
	                System.out.println("Monedas de $20 " + "Hay " + Veinte.size() + " monedas");
					break;
					
				case 3:
				        boolean salir1 = false;
				        int menu3;

				        while (!salir1) {
				        	System.out.println("Agregar dinero");
				        	System.out.println("Que monedas vas a ingresar");
				        	System.out.println("1. $.50 centavos");
				        	System.out.println("2. $1 peso");
				        	System.out.println("3. $2 pesos");
				        	System.out.println("4. $5 pesos");
				        	System.out.println("5. $10 pesos");
				        	System.out.println("6. $20 pesos");
				        	System.out.println("7.Salir");
				        	menu3 = leer.nextInt();
				        	switch (menu3) {
				        	case 1:
				        		if (Cincuenta.size() >= 10000) {
									System.out.println("Ya no caben más monedas");
								}else {
									Cincuenta.push(1);
									System.out.println("Hay " + Cincuenta.size() + " Monedas de $.50 de 10000 ");
								}
				        		break;
				        	case 2:
				        		if (Uno.size() >= 10000) {
									System.out.println("Ya no caben más monedas");
								}else {
									Uno.push(1);
									System.out.println("Hay " + Uno.size() + " Monedas de $1 de 10000");
								}
				        		break;
				        	case 3:
				        		if (Dos.size() >= 10000) {
									System.out.println("Ya no caben más monedas");
								}else {
									Dos.push(1);
									System.out.println("Hay " + Dos.size() + " Monedas de $2 de 10000");
								}
				        		 break;
				        	case 4:
				        		if (Cinco.size() >= 10000) {
									System.out.println("Ya no caben más monedas");
								}else {
									Cinco.push(1);
									System.out.println("Hay " + Cinco.size() + " Monedas de $5 de 10000");
								}
				        		 break;
				        	case 5:
				        		if (Diez.size() >= 10000) {
									System.out.println("Ya no caben más monedas");
								}else {
									Diez.push(1);
									System.out.println("Hay " + Diez.size() + " Monedas de $10 de 10000");
								}
				        		 break;
				        	case 6:
				        		if (Veinte.size() >= 100) {
									System.out.println("Ya no caben más monedas");
								}else {
									Veinte.push(1);
									System.out.println("Hay " + Veinte.size() + " Monedas de $20 de 100");
								}
				                break;
				        	case 7:
				        		System.out.println("Ya no caben más monedas");
								salir1 = true;
								break;
				        	}
				        }
				        break;
				case 4:
					int menu2;
					boolean salir = false;
					while(!salir) {
						boolean Pago = false;
						int Moneda;
						int Cambio = 0;
						
						System.out.println("Eliga una opción");
						System.out.println("1. Cafe" + " $15");
						System.out.println("2. Coca" + " 18");
						System.out.println("3. Agua" + " $12");
						System.out.println("4. PApas" + " $19");
						System.out.println("5. Galletas" + " $21");
						System.out.println("6. Salir");
						menu2 = leer.nextInt();
						switch (menu2) {
						case 1:
							int precioCafe = 15;
							int menuCosto; 
							
								System.out.println(" costo $ " + precioCafe );
								System.out.println("Ingresar dinero ");							
								System.out.println("Monedas válidas $.50 $1 $2 $5 $10 $20");
								Moneda = leer.nextInt();
									while(!Pago) {
										if (Moneda >= precioCafe) {
											Pago = true;
										}else {
											System.out.println("Falto de pagotienes " + Moneda + " de 15 agrega otra moneda");
											int pasta = leer.nextInt();
											Moneda = Moneda + pasta;
											Cambio = Moneda - precioCafe;
										}
										
										
								}
									if (Moneda > precioCafe) {
										System.out.println("Tu cambio: " + Cambio);
									}
								System.out.println("Saliste");
							Cafe.dequeve();
							System.out.println("Quedan " + Cafe.size() + " Cafe");
							if (Cafe.size()<= 0) {
								System.out.println("Ya no queda más de este producto, favor de llamar a atencion a clientes");
							}
							
							break;
						case 2:
							
							int precioCoca = 18;
							System.out.println("El costo es " + precioCoca );
							System.out.println("Ingresar dinero  ");							
							System.out.println("Monedas válidas $.50 $1 $2 $5 $10 $20");
							Moneda = leer.nextInt();
								while(!Pago) {
									if (Moneda >= precioCoca) {
										Pago = true;
									}else {
										System.out.println("Falto de pago tienes " + Moneda + " de 18 agrega otra moneda");
										int pasta = leer.nextInt();
										Moneda = Moneda + pasta;
										Cambio = Moneda - precioCoca;
									}
							}
							System.out.println("Saliste");
						Coca.dequeve();
						System.out.println("Quedan " + Coca.size() + " Coca");
						if (Coca.size()<= 0) {
							System.out.println("Ya no queda más de este producto, favor de llamar a atencion a clientes");
						}
							break;
						case 3:
							int precioAgua = 12;
							System.out.println("El costo es " + precioAgua );
							System.out.println("Ingresar dinero  ");							
							System.out.println("Monedas válidas $.50 $1 $2 $5 $10 $20");
							Moneda = leer.nextInt();
								while(!Pago) {
									if (Moneda >= precioAgua) {
										Pago = true;
									}else {
										System.out.println("Pago insuficiente tienes " + Moneda + " de 12 agrega otra moneda");
										int pasta = leer.nextInt();
										Moneda = Moneda + pasta;
										Cambio = Moneda - precioAgua;
									}
							}
							System.out.println("Saliste");
						Agua.dequeve();
						System.out.println("Quedan " + Agua.size() + " Agua");
						if (Agua.size()<= 0) {
							System.out.println("Ya no queda más de este producto, favor de llamar a atencion a clientes");
						}
							break;
						case 4:
							int precioPapas= 19;
							System.out.println("El costo es " + precioPapas);
							System.out.println("Ingrese primer moneda ");							
							System.out.println("Monedas válidas $.50 $1 $2 $5 $10 $20");
							Moneda = leer.nextInt();
								while(!Pago) {
									if (Moneda >= precioPapas) {
										Pago = true;
									}else {
										System.out.println("Pago insuficiente tienes " + Moneda + " de 19 agrega otra moneda");
										int pasta = leer.nextInt();
										Moneda = Moneda + pasta;
										Cambio = Moneda - precioPapas;
									}
							}
							System.out.println("Saliste");
						Papas.dequeve();
						System.out.println("Quedan " + Papas.size() + " PApas");
						if (Papas.size()<= 0) {
							System.out.println("Ya no queda más de este producto, favor de llamar a atencion a clientes");
						}
							break;
						case 5:
							int precioGalletas = 15;
							System.out.println("El costo es " + precioGalletas );
							System.out.println("Ingresar dinero  ");							
							System.out.println("Monedas válidas $.50 $1 $2 $5 $10 $20");
							Moneda = leer.nextInt();
								while(!Pago) {
									if (Moneda >= precioGalletas) {
										Pago = true;
									}else {
										System.out.println("Pago insuficiente tienes " + Moneda + " de 21 agrega otra moneda");
										int pasta = leer.nextInt();
										Moneda = Moneda + pasta;
										Cambio = Moneda - precioGalletas;
									}
							}
							System.out.println("Saliste");
						Galletas.dequeve();
						System.out.println("Quedan " + Galletas.size() + " Galletas");
						if (Galletas.size()<= 0) {
							System.out.println("Ya no queda más de este producto, favor de llamar a atencion a clientes");
						}
							break;
						case 6:
							System.out.println("Fin de la compra");
							salir = true;
							break;
						}
					}
					break;
					
				case 5:
					System.out.println("Fin de la máquina expendedora");
					dispensadora = true;
					break;
				default:
					System.out.println("Esta opción no es válida");
				}
			}
		}
	}
	
