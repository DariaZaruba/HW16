import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass
{
    @Test
            (dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String data)
    {
        System.out.println("Data is: " + data);
    }

    @Test
    public void testone ()
    {
        Assert.assertEquals(1, 1);
    }
}