package veintiunoo;

	import java.util.Collections;
	import java.util.Stack;
	import java.util.Scanner;
	
	public class  veintiunoo {

	    public static void main(String[] args) {
	        Mesa mesa = new Mesa();
	        mesa.shuffle();

	        Jugador jugador = new Jugador();
	        Jugador repartidor = new Jugador();

	        // Repartir cartas iniciales
	        jugador.otraCarta(mesa.bajarCarta());
	        repartidor.otraCarta(mesa.bajarCarta());
	        jugador.otraCarta(mesa.bajarCarta());
	        repartidor.otraCarta(mesa.bajarCarta());

	        // Jugar el juego
	        juego(jugador, repartidor, mesa);
	    }

	    private static void juego(Jugador jugador, Jugador repartidor, Mesa mesa) {
	        Scanner leer = new Scanner(System.in);
	        boolean Turno = true;

	        while (true) {
	            if (Turno) {
	                System.out.println("Jugador:");
	                jugador.mano();
	                System.out.println("Puntuación: " + jugador.puntos());
	                System.out.println("¿Quieres otra carta? (si/no)");

	                char caso = leer.next().charAt(0);
	                if (caso == 's') {
	                	jugador.otraCarta(mesa.bajarCarta());
	                    if (jugador.puntos() > 21) {
	                        System.out.println("¡Rerdiste!  Puntuación mayor a 21.");
	                        break;
	                    }
	                } else {
	                    Turno = false;
	                }
	            } else {
	                // Turno del crupier
	                System.out.println("Casa:");
	                repartidor.mano();
	                System.out.println("Puntuación: " + repartidor.puntos());

	                while (repartidor.puntos() < 17) {
	                	repartidor.otraCarta(mesa.bajarCarta());
	                	repartidor.mano();
	                    System.out.println("Puntuación: " + repartidor.puntos());
	                }

	                if (repartidor.puntos() > 21) {
	                    System.out.println("¡La casa ha perdido! Puntuación superior a 21.");
	                } else {
	                    // Determinar el ganador
	                    Ganador(jugador, repartidor);
	                }

	                break;
	            }
	        }

	        leer.close();
	    }

	    private static void Ganador(Jugador jugador, Jugador repartidor) {
	        String puntosJugador = jugador.puntos();
	        String puntosRepartidor = repartidor.puntos();

	        System.out.println("Resultados:");
	        System.out.println("Jugador: " + puntosJugador);
	        System.out.println("Casa: " + puntosRepartidor);

	        if (puntosJugador > puntosRepartidor) {
	            System.out.println("¡Felicidades! ¡Has ganado!");
	        } else if (puntosJugador < puntosRepartidor) {
	            System.out.println("¡Lo siento! Has perdido.");
	        } else {
	            System.out.println("¡Es un empate!");
	        }
	    }

	    static class Carta {
	        String suit; //SIMBOLO DE LA CARTA
	        String rank; //NUMERO DE LA CARTA

	        public Carta(String suit, String rank) {
	            this.suit = suit; // SIMBOLO DE LA CARTA
	            this.rank = rank; //NUMERO DE LA CARTA
	        }

	        
	        public String toString() {
	            return rank + " de " + suit;
	        }

	        public int getValue() {
	            if (rank.equals("A")) {
	                return 11;
	            } else if (rank.equals("Reina") || rank.equals("Rey") || rank.equals("Jota")) {
	                return 10;
	            } else {
	                return Integer.parseInt(rank);
	            }
	        }
	    }

	    static class Mesa {
	        Stack<Carta> cartas = new Stack<>();

	        public Mesa() {
	            String[] suits = {"Corazones", "Diamantes", "Treboles", "Picas"};
	            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey", "As"};

	            for (String suit : suits) {
	                for (String rank : ranks) {
	                    cartas.push(new Carta(suit, rank));
	                }
	            }
	        }

	        public Object bajarCarta() {
				// TODO Auto-generated method stub
				return null;
			}

			public void shuffle() {
	            Collections.shuffle(cartas);
	        }

	        public Carta drawCard() {
	            return cartas.pop();
	        }
	    }

	    static class jugador {
	        Stack<Carta> mano = new Stack<>();

	        public void addCard(Carta cartas) {
	            mano.push(cartas);
	        }

	        public int puntos() {
	            int puntos = 0;
	            int Ases = 0;

	            Carta[] mano = null;
				for (Carta cartas : mano) {
	                puntos += cartas.getValue();
	                if (cartas.rank.equals("Ases")) {
	                    Ases++;
	                }
	            }

	            // Ajustar el valor de los Ases si es necesario
	            while (puntos > 21 && Ases > 0) {
	                puntos -= 10;
	                Ases--;
	            }

	            return puntos;
	        }

	        public void mano() {
	            String mano = null;
				System.out.println("Mano: " + mano);
	        }
	    }
	}


