package tests;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDynamic {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd(){
       List list = new ArrayList();
       list.add("222");
        Assert.assertEquals(list.get(0),"222");
        list.get(6);

    }


}
