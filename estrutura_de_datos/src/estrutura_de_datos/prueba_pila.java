package estrutura_de_datos;

public class prueba_pila {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			stack pila = new stack(10);
			System.out.println(pila.isEmpty());
			System.out.println(pila.size());
			System.out.println(pila);
			System.out.println(pila.peak());
			pila.push(10);
			System.out.println(pila.isEmpty());
			System.out.println(pila.size());
			System.out.println(pila);
			System.out.println(pila.peak());
			pila.push(20);
			System.out.println(pila.isEmpty());
			System.out.println(pila.size());
			System.out.println(pila);
			System.out.println(pila.peak());
			pila.push(30);
			System.out.println(pila.isEmpty());
			System.out.println(pila.size());
			System.out.println(pila);
			System.out.println(pila.peak());
			Object value=pila.pop();
			System.out.println(value);
			
		}

	}


