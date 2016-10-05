import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by Babajko on 05.10.2016.
 */
public class DogTest {
    private Dog  dog, dog1;

    @Before
    public void setUp(){
        dog = new Dog("Sparki", 3, Dog.Breeds.Boxer);
        dog1 = new Dog("Tom", 5, Dog.Breeds.Poodle);
    }

    @After
    public void tearDown() {
        dog = null;
    }

    @Test
    public void testGetName(){
        assertEquals("Sparki", dog.getName());
    }

    @Test
    public void testSetName(){
        dog.setName("Tom");
        assertEquals("Tom", dog.getName());
    }

    @Test
    public void getAge() throws Exception {
        assertEquals(3, dog.getAge());
    }

    @Test
    public void testSetAge(){
        dog.setAge(5);
        assertEquals(5, dog.getAge());
    }

    @Test
    public void testEquals(){
        String strName = dog.getName();
        dog.setName("Tom");
        assertTrue(dog.equals(dog1));
        dog.setName(strName);
    }
}