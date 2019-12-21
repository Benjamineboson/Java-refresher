package se.lexicon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.data.PersonSequencer;

public class PersonSequencerTest {

    private PersonSequencer ps;


    @Test
    public void nextIdTest(){
    int expected = 0;
    int actual = ps.nextPersonid();
        Assert.assertEquals(expected,actual);
    }
}
