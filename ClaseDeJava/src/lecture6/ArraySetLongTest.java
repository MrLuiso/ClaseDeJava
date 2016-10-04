package lecture6;
import static org.junit.Assert.*;
import org.junit.Test;

public class ArraySetLongTest {
	
	long[] a = {1,2,3,4,5};
	ArraySetLong s = new ArraySetLong(a, 5);
	
	long[] b = {6,7,8,9,10};
	ArraySetLong s2 = new ArraySetLong(b, 5);
	
	long[] c = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};
	ArraySetLong s3 = new ArraySetLong(c, 5);
	
	ArraySetLong emptySet = new ArraySetLong(10);


	@Test
	public void testBasic1() {
		ArraySetLong s = new ArraySetLong(10);
		assertNotNull("ArraySetLong(10): Null object reference returned", s);
		assertTrue("ArraySetLong(10): Non-empty set returned", s.isEmpty());
	}
	
	@Test
	public void testBasic2() {
		assertNotNull("ArraySetLong(a,5): Null object reference returned", s);
		assertFalse("ArraySetLong(a,5): Non-empty set returned", s.isEmpty());
		assertEquals("ArraySetLong(a,5): Non-empty set returned", s.cardinality(),5);
	}
	
	@Test
	public void testMaxMin() {
		assertEquals("max(): Wrong max returned", s.max(),5);
		assertEquals("min(): Wrong min returned", s.min(),1);
	}
	
	@Test
	public void testSum() {
		assertEquals("sum(): Wrong sum returned", s.sum(),15);
		assertEquals("sum(): Empty array returns !0", emptySet.sum(), 0);
	}
	
	@Test
	public void testProduct() {
		assertEquals("product(): Wrong product returned", s.product(),120);
	}
	
	@Test
	public void testAddMember() {
		s.addMember(6);
		
		assertTrue("isMember(): Did not find added set member", s.isMember(6));
	}
	
	@Test
	public void testUnion() {
		ArraySetLong result = s.union(s2);
		assertEquals("testUnion: wrong cardinality", result.cardinality(), 10);
		
		ArraySetLong result2 = s.union(s);
		assertEquals("testUnion: Wrong cardinality", result2.cardinality(), 5);
		
		ArraySetLong result3 = emptySet.union(emptySet);
		assertEquals("testUnion: Wrong cardinality", result3.cardinality(), 0);
	}
	
	@Test
	public void testIntersection() {
		ArraySetLong result = s.intersection(emptySet);
		assertEquals("testIntersection: Wrong cardinality", result.cardinality(), 0);
	}
	
	@Test
	public void isSubset(){
		assertTrue("testIsSubset: subset incorrectly false", s.isSubset(s));
		
	}

}
