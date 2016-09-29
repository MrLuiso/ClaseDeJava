package lecture6;
import java.util.Arrays;

public class ArraySetLong {
	private long[] theElements;
	private int numElements;

	/*
	 * ArraySetLong(int n)
	 * Create and initially empty set with initial capacity for n objects
	 */
	public ArraySetLong(int n) {
		numElements = 0;
		theElements = new long[n];
	}

	/*
	 * ArraySetLong(long[] numbers, int n)
	 * Add the n objects array numbers to target set
	 */
	public ArraySetLong(long[] numbers, int n) {
		numElements = n;
		theElements = new long[n*2];//Leave n slack for adding new elements.
		for (int i=0; i<n; i++) {
			theElements[i] = numbers[i];
		}
	}
	
	/*
	 * isEmpty()
	 * Returns true if the target set has no elements
	 */
	public boolean isEmpty() {
		return numElements == 0; // Dummy return
	}
	
	/*
	 * cardinality()
	 * Return a number representing the cardinality of the target set
	 */
	public int cardinality() {
		return numElements; // dummy return
	}
	
	/*
	 * max()
	 * Returns a long representing the maximum element in the set
	 */
	public long max() {

		if(!this.isEmpty()){

			long max = theElements[0];

			for(int i = 1; i < numElements; i++){		
				if(max < theElements[i]){
					max = theElements[i];
				}			
			}

			return max; 
			
		} else{
			throw new RuntimeException("Attempted to find max of empty array");
		}


	}

	/*
	 * min()
	 * Returns a long representing the minimum element in the set
	 */
	public long min() {
		
		if(!this.isEmpty()){

			long min = theElements[0];

			for(int i = 1; i < numElements; i++){
				if(min > theElements[i]){
					min = theElements[i];
				}
			}

			return min; 
		}else {
			throw new RuntimeException("Attempeted to find min of empty array");
		}
	}
	
	/*
	 * sum()
	 * Returns a long representing the sum of all elements of the set
	 */
	public long sum() {
		
		long sum = 0;
		
		for(int i = 0; i < numElements; i++){
			sum += theElements[i];
		}
		return sum; // Dummy return
	}
	
	/*
	 * mult()
	 * Returns a long representing the product of all the elements in the set
	 */
	public long product() {
		
		long mult = 1;

		for(int i = 0; i < numElements; i++){
			mult *= theElements[i];	
		}
		
		return mult; // Dummy return
	}
	
	public boolean isMember(long a){

		for(int i = 0; i < numElements; i++){
			if(theElements[i] == a){
				return true;
			}
		}
		
		return false;
		
	}
	
	public void addMember(long key){
		
		if(!isMember(key)){
			if(theElements.length <= numElements){
				theElements = Arrays.copyOf(theElements, numElements * 2);
			} 
				
			theElements[numElements] = key;
			numElements++;
		}
		
			
	}
	
	public void deleteMember(long key){
		
		
		for(int i = 0; i < numElements; i++){
			if(theElements[i] == key){
				theElements[i] = theElements[numElements - 1];
				numElements--;
				return;
			}
		}		
	}
	
	
}
