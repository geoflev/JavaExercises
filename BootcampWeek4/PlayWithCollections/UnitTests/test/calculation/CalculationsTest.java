package calculation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculationsTest {
    
    private Calculations calc;
  
    
    public CalculationsTest() {
    }
    
    @Before //runs before every test case,so i create calc here
    public void setUp() {
        calc = new Calculations();
    }
    
    @After //runs after every test case
    public void tearDown() {
    }

    
    @Test // test case.ftiaxnei kai mono tou alla emeis tha ftiaksoume to diko mas
    public void testGetSumValid() {
        int result = calc.getSum(2, 2);
        assertEquals(4,result);   //4 = auto pou perimenoume
    }                               //result einai auto pou tha bgalei pragmatika
    
    @Test
    public void testGetSumNotValid() {
        int result = calc.getSum(2, 2);
        assertNotEquals(5,result);
    }
    
    @Test
    public void testDivisionValid(){
        double result = calc.division(4, 2);
        assertEquals(2,result,0.1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroNumber(){
        double result = calc.division(4, 0);
        Assert.assertEquals(-2,result,0.1);
    }
    @Test
    public void testDivisionNegativeNumber(){
        double result = calc.division(-4, 2);
        Assert.assertEquals(-2,result,0.1);
    }
    
    @Test
    public void testsumArrayValid(){
        int [] array = {2,4,8};
        int sum = calc.sumOfArray(array);
        Assert.assertEquals(14,sum);
    }
    
    @Test
    public void testsumArrayNotValid(){
        int [] array = {2,4,8};
        int sum = calc.sumOfArray(array);
        Assert.assertNotEquals(15,sum);
    }

    @Test
    public void testSumMultiplyArrayValid(){
        int [] array = {2,5,10,3};
        int num = 10;
        calc.multiplyArrayByNumber(array, num);
        int [] expected = {20,50,100,30};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        assertArrayEquals(expected, array);
    }
    
}
