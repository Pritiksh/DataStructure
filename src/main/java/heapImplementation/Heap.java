package heapImplementation;

public class Heap {
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;

	public Heap(int size) 
	{
		this.maxSize = size;
		currentSize = 0;
		heapArray = new Node[size]; //Actually creates the array	
		
	}
	public int getSize() 
	{
		return currentSize;
	}
	
	public boolean isEmpty() {
		return (currentSize == 0);
	}
	
	public boolean insert(int key) 
	{
		if(currentSize== maxSize) //array is full
		{
			return false;
		}
		
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		trickleUp(currentSize);
		currentSize++;
		 return true;
	}
	
	public void trickleUp(int idx) {
		int parentIdx = (idx-1)/2;
		Node nodeToInsert = heapArray[idx];
		
		while(idx> 0 &heapArray[parentIdx].getKey()>nodeToInsert.getKey())
		{
		heapArray[idx] = heapArray[parentIdx]; //move parent down
		idx = parentIdx;
		parentIdx = (parentIdx -1)/2;//move up
		
		}
		heapArray[idx] = nodeToInsert;
	}
	
	public Node remove() {
		Node root = heapArray[0];
		currentSize--;
		heapArray[0] = heapArray[currentSize];
		trickleDown(0);
		return root;
		
	}
	
	
}
