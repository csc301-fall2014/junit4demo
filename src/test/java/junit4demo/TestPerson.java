package junit4demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	// NOTICE: This annotation tells JUnit that we expect an IllegalArgumentException
	// to be thrown, at some point during this test.
	@Test(expected=IllegalArgumentException.class)
	public void testCreatingPersonWithNullName() {
		new Person(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCreatingPersonWithEmptyName() {
		new Person("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCreatingPersonWithAllWhiteSpaceName() {
		new Person("    ");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetNullName() {
		Person p = new Person("Dan");
		p.setName(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetEmptyName() {
		Person p = new Person("Dan");
		p.setName("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetAllWhiteSpaceName() {
		Person p = new Person("Dan");
		p.setName("   ");
	}
	
	@Test()
	public void testCreatingPersonWithValidName() {
		new Person("Dan");
	}
	
	
	@Test()
	public void testEqualsWithSameName() {
		Person p1 = new Person("Dan");
		Person p2 = new Person("Dan");
		assertEquals(p1, p2);
	}
	
	@Test()
	public void testEqualsWithDifferentNames() {
		Person p1 = new Person("Dan");
		Person p2 = new Person("Michelle");
		assertNotEquals(p1, p2);
	}
	

}
