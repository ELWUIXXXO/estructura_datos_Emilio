package estrutura_de_datos;

public class stack {


		private Object[] stack;
		private int size;

		   public stack(int size) {

			   this.stack = new Object[size];
			   this.size = 0;
		   }
		   		public boolean isEmpty() {
		   			return size==0;
		   			
		   		}
		   		public Object peak() {
		   			Object value = null;
		   				if(size>0) {
		   				value = stack[size-1];
		   				}
		   				return value;
		   			}
		   		
		   			public void push(Object value) {
		   				if(stack.length>=size) {
		   					stack[size]=value;
		   					size++;
		   					
		   				}
		   			}
		   			public Object pop() {
		   				Object value=null;
		   					if(!isEmpty()) {
		   						size--;
		   						value=stack[size];
		   							stack[size]=null;
		   				}
		   					return value;
		   				}
		   			
		   				public int size() {
		   				return size;
		   				}
		   				
		   				public String toString() {
		   					
		   					StringBuilder s=new StringBuilder();
		   					for(int i=0; i<size; i++) {
		   						s.append(stack[i]).append("-->");
		   					}
		   					return s.toString();
		   				}
		   			}
