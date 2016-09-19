import org.junit.Assert;
import org.junit.Test;

/**
 * Created by loisgh on 5/26/16.
 */
public class ThirtySecondsFormatterTest {

    @Test
    public void FormatQuoteTest(){
        Assert.assertEquals(ThirtySecondsFormatter.format(23.00d), "23-00");
        Assert.assertEquals(ThirtySecondsFormatter.format(23.03125d), "23-01");
        Assert.assertEquals(ThirtySecondsFormatter.format(99.0625d),"99-02");
        Assert.assertEquals(ThirtySecondsFormatter.format(102.09375d),"102-03");
        Assert.assertEquals(ThirtySecondsFormatter.format(23.25d), "23-08");
        Assert.assertEquals(ThirtySecondsFormatter.format(23.50d), "23-16");
        Assert.assertEquals(ThirtySecondsFormatter.format(23.75d), "23-24");
    }
}
