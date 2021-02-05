public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        // su codigo aqui
    	this.head = null;
    	
    }
    public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	//Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
        
       
    }    
    
    
    public void remove() {
        Node runner = head;	
    	int largo = head.getLargo();	 
    	int i = 0;
        while(runner!=null) {
        	
        	if (i==largo-2) {
        		
        		System.out.println(" Se remueve el último valor");  
        		runner.next = null;
        	}
        	runner = runner.next;
        	
        	i++;	
        }
       
    }
    
    public void printValues() {
    	Node runner = this.getHead();	
    	System.out.println("Lista");
    	while(runner!=null) {
        	System.out.println(runner.value);
        	runner = runner.next;
        }
    }
    
    public void find(int index) {
    	Node runner = head;	
    	int largo = head.getLargo();
    	int i = 0;
    	
    	if (index >= largo -1  || index < 0) { 
    		System.out.println("El número ingresado es mayor o menor al largo del Nodo"); 
    	} else {
	    	while (runner!=null) {
	    		
	    		if (i == index )
	    		{
	    			System.out.println("Index "  + i + " Valor buscado: " + runner.value);
	    		}
	    		runner = runner.next;
	    		i++;
	    	}
	    	
	    	
    	}
    }
    
    public void removeAt(int index) {
    	Node runner = head;	
    	int largo = head.getLargo();
    	
    	//System.out.println("Largo " + largo); 
    	if (index >= largo  || index < 0) { 
    		System.out.println("El número ingresado es mayor o menor al largo del Nodo"); 
    	} else {
    		
    		Node aux = head;
            for (int i = 0; i < index-1; i++) {
                aux = aux.getNext();
            }
            runner = aux.getNext();
            aux.setNext(runner.getNext());
            System.out.println("Index "  + index + " Valor removido: " + runner.value);

    	}
    	
    }
    
}