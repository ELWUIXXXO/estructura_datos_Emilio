package Colas;
import estrutura_de_datos.nodos.*;

public class linkedQueve {
private int size;
private nodo f; 
private nodo r;
public linkedQueve() {
	this.size =0;
	this.f =null;
	this.r =null;
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size == 0 ;
}

public void enqueve (Object value) {
	nodo Nodo = new nodo();
	Nodo.setValue(value);
	if (null!=r) {
		Nodo.setEnlace(r);
	}
	if (null==f) {
		f = Nodo;
	}
	r=Nodo;
	size++;
}
public Object dequeve () {
	Object value = null;
	if (null !=f) {
		value = f.getValue();
		f = f.getEnlace();	
		size --;
	}
	return value;
}
	public Object front () {
		return null!=f?f.getDato():null;
	}
	public String toString() {
		String s = "";
		nodo temp=f;
		while(null!=temp) {
			s=temp.getDato()+"<-"+s;
			temp=temp.getEnlace();
		}
		return s;
		
	}
} 

