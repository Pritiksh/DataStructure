package ds.hashtable;

public class HashTable {
	String[] hashArray;
	int arraySize;
	int size = 0;
	
	public HashTable(int noOfSlots) {
		if(isPrime(noOfSlots))
		{
			hashArray = new String[noOfSlots];
			arraySize = noOfSlots;
		}
		else
		{
			int primeCount = getNextPrime(noOfSlots);
			hashArray = new String[primeCount];
			arraySize = primeCount;
			
			System.out.println("hash table size given "+ noOfSlots + "is not a prime no");
			System.out.println("Hash table size change to "+ primeCount);
		}
		
	}
	private boolean isPrime(int num) {
		return false;
		
	}
}
