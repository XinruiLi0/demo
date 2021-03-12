package web;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    private BuddyInfo b1;
    private BuddyInfo b2;

    @Before
    public void setUp()
            throws Exception
    {
        this.b1 = new BuddyInfo("Mike", 1234567890L, 19);
        this.b2 = new BuddyInfo("John", 1111111111L, 16);
    }

    @Test
    public void getAge() {
        assertEquals("Mike age should be 19.", 19, b1.getAge());
    }

    @Test
    public void setAge() {
        b1.setAge(20);
        assertEquals("Mike age should be 20.", 20, b1.getAge());
    }

    @Test
    public void getName() {
        assertEquals("The name should be Mike.", "Mike", b1.getName());
    }

    @Test
    public void setName() {
        b1.setName("Jason");
        assertEquals("The name should be Jason.", "Jason", b1.getName());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals("The phone number should be 1234567890L.", 1234567890L, b1.getPhoneNumber());
    }

    @Test
    public void setPhoneNumber() {
        b1.setPhoneNumber(1111111111L);
        Assert.assertEquals("The phone number should be 1111111111L.", 1111111111L, b1.getPhoneNumber());
    }
}