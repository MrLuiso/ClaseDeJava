package lecture6;

import java.util.Arrays;

public class ArraySet {

	private ElementType[] theElements;
	private int numElements;

	/* Create empty array */

	public ArraySet(int n) {
		numElements = n;
		theElements = new ElementType[n];
	}

	/* Create array with elements */
	public ArraySet(ElementType[] elements, int n) {
		numElements = n;
		theElements = new ElementType[n * 2];

		for (int i = 0; i < n; i++) {
			theElements[i] = elements[i];
		}
	}

	public boolean isEmpty() {
		return numElements == 0;
	}

	public int cardinality() {
		return numElements;
	}

	public ElementType max() {

		if (!this.isEmpty()) {

			ElementType max = theElements[0];

			for (int i = 1; i < numElements; i++) {
				if (theElements[i].greaterThan(max)) {

					max = theElements[i];

				}
			}

			return max;

		} else {
			throw new RuntimeException("Attempted to find max of empty array");
		}

	}// max()

	public ElementType min() {

		if (!this.isEmpty()) {

			ElementType min = theElements[0];

			for (int i = 1; i < numElements; i++) {
				if (min.greaterThan(theElements[i])) {

					min = theElements[i];

				}
			}

			return min;

		} else {
			throw new RuntimeException("Attempeted to find min of empty array");
		}
	}// min()

	public long sum() {
		long result = 0;

		for (int i = 0; i < numElements; i++) {
			result += theElements[i].valueOf();
		}

		return result;
	}
	
public long product() {
		
		long mult = 1;

		for(int i = 0; i < numElements; i++){
			mult *= theElements[i].valueOf();	
		}
		
		return mult; // Dummy return
	}

	public boolean isMember(ElementType key) {
		for (int i = 0; i < numElements; i++) {
			if (theElements[i].equals(key)) {
				return true;
			}
		}

		return false;
	}

	public void addMember(ElementType key) {

		if (!isMember(key)) {
			if (theElements.length <= numElements) {
				theElements = Arrays.copyOf(theElements, numElements * 2);
			}

			theElements[numElements] = key;
			numElements++;
		}

	}

	public void deleteMember(ElementType key) {

		for (int i = 0; i < numElements; i++) {
			if (theElements[i].equals(key)) {
				theElements[i] = theElements[numElements - 1];
				numElements--;
				return;
			}
		}
	}

	public ArraySet union(ArraySet s) {

		int resultSize = Math.max(this.cardinality() + s.cardinality(), 10);
		ArraySet result = new ArraySet(resultSize);

		for (int i = 0; i < this.cardinality(); i++) {
			result.addMember(this.theElements[i]);
		}

		for (int i = 0; i < s.cardinality(); i++) {
			result.addMember(s.theElements[i]);
		}

		return result;
	}

	public ArraySet intersection(ArraySet s) {

		int resultSize = Math.max(this.cardinality(), s.cardinality());
		ArraySet result = new ArraySet(resultSize);

		for (int i = 0; i < this.cardinality(); i++) {

			if (s.isMember(this.theElements[i])) {
				result.addMember(this.theElements[i]);
			}

		}

		return result;
	}

	public boolean isSubset(ArraySet s) {

		for (int i = 0; i < this.cardinality(); i++) {
			if (!s.isMember(this.theElements[i])) {
				return false;
			}
		}

		return true;
	}

	public boolean equals(ArraySet s) {
		return ((this.isSubset(s)) && (s.isSubset(this)));
	}

}
