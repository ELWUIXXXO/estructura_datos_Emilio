package estrutura_de_datos.nodos;
//SE LEEN DE DERECHA A IZQUIERDA Y DE ABAJO PARA ARRIBA 30,20,10
public class LinkedStack {
private nodo apuntador;
private int size;
public LinkedStack() {
	this.size=0;
	this.apuntador=null;
}
public int size () {
	return size;
}
public boolean isEmpty() {
	return size==0;
	//return null==apuntador;
} 
public Object peak() {
	return null!=apuntador?apuntador.getDato():null;
}
public void push (Object value) {
	nodo Nodo=new nodo();
	Nodo.setDato(value);
	if(null==apuntador) {
		this.apuntador=Nodo;
		this.size++;
	}else {
		Nodo.setEnlace(apuntador);
		this.apuntador=Nodo;
		this.size++;
	}
	//IF CORTO
	//if(null=apuntador){
	//Nodo.setEnlace(apuntador);
	//{
	//this.apuntador=Nodo;
	//this.size++;
}
public Object pop() {
	Object value=apuntador.getDato();
	if(null!=apuntador.getEnlace()) {
		value=apuntador.getDato();
		apuntador.getEnlace();
this.apuntador=apuntador.getEnlace();
		size--;
	}
	return value;
}
public String toString() {
	String s = "";
	nodo temp=apuntador;
	while(null!=temp) {
		s=temp.getDato()+"<-"+s;
		temp=temp.getEnlace();
	}
	return s;
	
}
}
