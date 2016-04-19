package de.zazaz.test.github;

import org.junit.Assert;
import org.junit.Test;

public class MyFunctionTest {

    @Test
    public void testDoAdd ()
    {
        MyFunction instance = new MyFunction();
        Assert.assertEquals(5, instance.doAdd(3, 2));
        Assert.assertNotEquals(5, instance.doAdd(3, 3));
    }

}
