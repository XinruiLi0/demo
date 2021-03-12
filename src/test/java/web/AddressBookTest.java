package web;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {
    private AddressBook aBook;
    private BuddyInfo b1;
    private BuddyInfo b2;

    @Before
    public void setUp() throws Exception {
        this.aBook = new AddressBook();
        this.b1 = new BuddyInfo("Mike", 1234567890, 19);
        this.b2 = new BuddyInfo("John", 1111111111, 16);
        this.aBook.addBuddy(this.b1);
    }

    @Test
    public void size() {
        assertEquals("AddressBook should have a size 1.", 1, aBook.size());
    }

    @Test
    public void addBuddy() {
        this.aBook.addBuddy(this.b2);
        assertEquals("AddressBook should have a size 2.", 2, aBook.size());
    }

    @Test
    public void removeBuddy() {
        this.aBook.removeBuddy(this.b1);
        assertEquals("AddressBook should have a size 0.", 0, aBook.size());
    }

    @Test
    public void clear() {
        this.aBook.clear();
        assertEquals("AddressBook should have a size 0.", 0, aBook.size());
    }
}