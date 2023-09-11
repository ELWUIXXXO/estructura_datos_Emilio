package Colas;

public class CircularQueve {
private int size;
private int front;
private int rear;
private Object []queve;
public  CircularQueve(int size) {
	this.size=0;
	this.front =0;
	this.rear=0;
	this.queve= new Object[size];
}
public void enqueve(Object value) {
	if (null == queve [rear]) {
		queve[rear]=value;
		rear++;
		size++;
			if(rear == queve.length){ 
			
			rear=0;
			}
	}
}
public Object dequeve() {
	Object value =null;
	if (queve[front]!=null) {
		value = queve [front];
		queve[front]=null;
		front++;
		size++;
		if(front == queve.length) {
			front=0;
			}
		}
	return value;
}
public Boolean isEmpty() {
	return size == 0;
}
public int size() {
	return size;
}
public Object front () {
	return queve [front];
	
}
public Object rear () {
	int rearAux = rear -1;
	rearAux = rearAux <0? queve.length-1:rearAux;  // ? termina la condicion; izquierda verdad, derecha falso
	//if (rearAux<0){
	//rearAux=queve.length-1;
	//}
	return queve[rearAux];	
}
public String toString() {
	String s= "";
	int sizeAux = size;
	int rearAux =rear;
		while (sizeAux >0) {
			sizeAux --;
			rear --;
			rearAux = rearAux<0? queve.length-1:rearAux;
			s += queve [rearAux]+ "->";
			
		}
		return null;
	
}
}

