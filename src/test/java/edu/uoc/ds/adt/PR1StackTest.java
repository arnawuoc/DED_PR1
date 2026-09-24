package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

public class PR1StackTest {

    PR1Stack pr1q;

    private void fillStack() {
        for (int x = 0; x < pr1q.CAPACITY; x++) {
            pr1q.push(x * x + 3 * x + 2);
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Stack();

        assertNotNull(this.pr1q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr1q.CAPACITY, this.pr1q.getStack().size());

        Assert.assertEquals(Integer.valueOf(240), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(210), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(182), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(156), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(132), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(110), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(90), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(72), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(56), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(42), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(30), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(20), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(12), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(6), pr1q.pop());
        Assert.assertEquals(Integer.valueOf(2), pr1q.pop());
        assertEquals(0, this.pr1q.getStack().size());
    }

}
