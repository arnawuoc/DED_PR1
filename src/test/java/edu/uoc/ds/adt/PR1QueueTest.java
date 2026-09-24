package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.traversal.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class PR1QueueTest {
    PR1Queue pr1q;

    private void fillQueue() {
        for (int x = 0; x < pr1q.CAPACITY; x++) {
            pr1q.add(x * x + 3 * x + 2);
        }
    }
    @Before
    public void setUp() {
        this.pr1q = new PR1Queue();

        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr1q.CAPACITY, this.pr1q.getQueue().size());
        Assert.assertEquals(Integer.valueOf(2), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(6), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(12), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(20), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(30), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(42), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(56), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(72), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(90), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(110), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(132), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(156), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(182), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(210), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(240), pr1q.poll());
        assertEquals(0, this.pr1q.getQueue().size());
    }

    @Test
    public void queueTest2() {

        Queue<Integer> queue = pr1q.getQueue();
        Iterator<Integer> it = queue.values();
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(2), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(6), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(12), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(20), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(30), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(42), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(56), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(72), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(90), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(110), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(132), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(156), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(182), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(210), it.next());
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(240), it.next());
        assertFalse(it.hasNext());

    }

}
