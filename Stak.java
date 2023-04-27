import java.util.LinkedList;
import java.util.ArrayList;

public class Stak {
	
	public static void main(String[] args) {
		
		class Myqueue<E>{
			private LinkedList<E> queue;
			
			public Myqueue() {queue = new LinkedList<>();}
			public void enqueue(E e) {
				queue.add(e);
				
			}
			public E dequeue() {
				E e = queue.get(getSize() -1 );
				return e;
			}
			public int getSize() {return queue.size();}
			public E peek() {
				return queue.get(getSize()-1);
				
			}
			
			class Mystack<E>{
				private ArrayList<E> stack;
				
				public Mystack() {stack = new ArrayList<>();}
				
				public E peek() {
					stack.get(getSize()-1);
					
				}
				
				
			}
			
		}
		
		
	}
}