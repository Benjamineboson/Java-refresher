package se.lexicon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.model.Person;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Person testPerson;

    @Before
    public void init(){
      testPerson = new Person(1,"Ben","Boson");
    }

    @Test
    public void test_GetFirstName(){
        String expected = "Ben";
        String actual = testPerson.getFirstName();
        assertEquals(expected,actual);
    }

    @Test
    public void test_GetLastName(){
        String expected = "Boson";
        String actual = testPerson.getLastName();
        assertEquals(expected,actual);
    }

    @Test
    public void test_GetId(){
        int expected = 1;
        int actual = testPerson.getPersonId();
        assertEquals(expected,actual);
    }


}
