public class Node {
    public int value;
    public Node next;
    public static int largo; 
    
	public Node(int value) {
        // su codigo aqui
    	
    	this.value = value;
    	this.next = null;
    	largo++;
    }
    
    
    public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
	}

}