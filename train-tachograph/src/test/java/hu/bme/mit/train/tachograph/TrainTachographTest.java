package hu.bme.mit.train.tachograph;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrainTachographTest {
    TrainTachograph tachograph;

    @Before
    public void before(){
        tachograph = new TrainTachograph();
    }

    @Test
    public void canAddNewRecords(){
        tachograph.put(LocalDate.now(), 5, 10);

        Assert.assertTrue(tachograph.hasElements());
    }
}
