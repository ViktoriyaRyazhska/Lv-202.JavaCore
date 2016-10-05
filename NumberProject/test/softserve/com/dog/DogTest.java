package softserve.com.dog;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	Dog dog1 = new Dog("Spake", 12, Breed.SIT);
	Dog dog2 = new Dog("Berta", 17, Breed.BARK);
	Dog dog3 = new Dog("Spake", 16, Breed.SIT);
	
	@Test
	public void testEquals() {
		assertEquals(dog1.getName(),dog3.getName());
	}
}
