package calculation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ListOperationsTest {

    private ListOperations listOperations;

    public ListOperationsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        listOperations = new ListOperations();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddNameToList() {
        boolean changed = listOperations.addNameToList("Andy"); //allos tropos na kanw boolean kai na 
        //int sizeOfList = listOperations.getSizeOfList();      chekarw an einai true / false

        assertTrue(changed);
    }

    @Test
    public void testAddNameToListCheckSize() {
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(1, sizeOfList);
    }

    @Test
    public void testAddNameToListCheckName() {
        String name = "Andy";
        listOperations.addNameToList(name);
        int sizeOfList = listOperations.getSizeOfList();
        String actuaName = listOperations.getNames().get(sizeOfList - 1);
        assertTrue(name.equals(actuaName));

    }

    @Test
    public void testAddNameToListManyNames() {
        listOperations.addNameToList("Mary");
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("Peter");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(3, sizeOfList);
    }

    @Ignore
    @Test
    public void testAddNameToListNull() {
        listOperations.addNameToList(null);
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(0, sizeOfList);
    }

    @Test
    public void testRemoveNameFromList() {
        String name = "Andy";
        listOperations.addNameToList(name);
        listOperations.removeNameFromList(name);
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(0,sizeOfList);
    }

    @Test
    public void testGetSizeOfList() {
        String name = "Andy";
        listOperations.addNameToList(name);
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(1, sizeOfList);
        
    }

}
