package lecture6;
import static org.junit.Assert.*;
import org.junit.Test;

public class ArraySetTest {
	
	ElementType[] stringArray = {
			new StringElementType("Hello"),
			new StringElementType("World"),
			new StringElementType("!")
	};
	
	ArraySet stringSet = new ArraySet(stringArray, 3);
	
	ElementType[] a = {
			new LongElementType(1),
			new LongElementType(2),
			new LongElementType(3),
			new LongElementType(4),
			new LongElementType(5)
			};
	ArraySet s = new ArraySet(a, 5);
	
	ElementType[] b = {
			new LongElementType(6),
			new LongElementType(7),
			new LongElementType(8),
			new LongElementType(9),
			new LongElementType(10)
			};
	ArraySet s2 = new ArraySet(b, 5);
	
	ElementType[] c = {
			new LongElementType(1),
			new LongElementType(2),
			new LongElementType(3),
			new LongElementType(4),
			new LongElementType(5),
			new LongElementType(6),
			new LongElementType(7),
			new LongElementType(8),
			new LongElementType(9),
			new LongElementType(10)};
	
	ArraySet s3 = new ArraySet(c, 10);
	
	ArraySet emptySet = new ArraySet(10);


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
	public void testIsMemberWithStrings() {
		assertTrue("isMember(): Did not find member", stringSet.isMember(new StringElementType("Hello")));
		assertFalse("isMember(): Found non existant member", stringSet.isMember(new StringElementType("ICOM4015")));
	}
	
	@Test
	public void testAddMember() {
		s.addMember(new LongElementType(6));
		
		assertTrue("isMember(): Did not find added set member", s.isMember(new LongElementType(6)));
	}
	
	@Test
	public void testUnion() {
		ArraySet result = s.union(s2);
		assertEquals("testUnion: wrong cardinality", result.cardinality(), 10);
		
		ArraySet result2 = s.union(s);
		assertEquals("testUnion: Wrong cardinality", result2.cardinality(), 5);
		
		ArraySet result3 = emptySet.union(emptySet);
		assertEquals("testUnion: Wrong cardinality", result3.cardinality(), 0);
	}
	
	@Test
	public void testIntersection() {
		ArraySet result = s.intersection(emptySet);
		assertEquals("testIntersection: Wrong cardinality", result.cardinality(), 0);
	}
	
	@Test
	public void testIsSubset(){
		assertTrue("testIsSubset: subset incorrectly false", s.isSubset(s));
	}
	
	@Test
	public void testEquals(){
		assertTrue("testEquals: equals incorrectly flase", s.equals(s));
	}

}
