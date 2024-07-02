package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;


/**
 * Unit tests for the CoffeeOrder class.
 * This class tests various constructors, getters, setters, and methods of CoffeeOrder.
 * It uses reflection to access private fields for testing purposes.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CoffeeOrderTest {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);
    
    /**
     * Helper method to get the value of private field 'coffeeType' from a CoffeeOrder object using reflection.
     * @param p CoffeeOrder object
     * @return coffeeType value as String
     */
    private String getcoffeeType(CoffeeOrder p) {
        String v="";
        try {
            Field name = CoffeeOrder.class.getDeclaredField("coffeeType");
            name.setAccessible(true);
            v = (String)name.get(p);
            
        } catch (Exception x) {
            fail("exception occurred trying to get this.getcoffeeType");
            System.out.println(x);
        }
        return v;
    }
    
    /**
     * Helper method to get the value of private field 'cupSize' from a CoffeeOrder object using reflection.
     * @param p CoffeeOrder object
     * @return cupSize value as String
     */
    private String getcupSize(CoffeeOrder p) {
        String v="";
        try {
            Field name = CoffeeOrder.class.getDeclaredField("cupSize");
            name.setAccessible(true);
            v = (String)name.get(p);
            
        } catch (Exception x) {
            fail("exception occurred trying to get this.getcupSize");
            System.out.println(x);
        }
        return v;
    }
    
    /**
     * Test case for default constructor CoffeeOrder().
     * Verifies the default values of coffeeType and cupSize.
     */
    @Test
    public void test_0_0_CoffeeOrderCtor() {
        CoffeeOrder c = new CoffeeOrder();
        String actualcoffeeType = this.getcoffeeType(c);
        String actualcupSize = this.getcupSize(c);
        
        String expectedcoffeeType = "AmericanRegular";
        String expectedcupSize = "S";
        
        String errorcoffeeType = String.format(
                "\n Test no-arg constructor failed. Returned name ( %s ) but correct name is ( %s ). \n",
                actualcoffeeType, expectedcoffeeType);
        assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
        
        String errorcupSize = String.format(
                "\n Test no-arg constructor failed. Returned address ( %s ) but correct address is ( %s ). \n",
                actualcupSize, expectedcupSize);
        
        assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
    }
    
    /**
     * Test case for constructor CoffeeOrder(String coffeeType, String cupSize).
     * Verifies the initialization with specific coffeeType and cupSize values.
     */
    @Test
    public void test_1_0_CoffeeOrderCtor() {
        CoffeeOrder c = new CoffeeOrder("Espresso","XL");
        String actualcoffeeType = this.getcoffeeType(c);
        String actualcupSize = this.getcupSize(c);
        
        String expectedcoffeeType = "Espresso";
        String expectedcupSize = "XL";
        
        String errorcoffeeType = String.format(
                "\n Test arg constructor failed. Returned name ( %s ) but correct name is ( %s ). \n",
                actualcoffeeType, expectedcoffeeType);
        assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
        
        String errorcupSize = String.format(
                "\n Test arg constructor failed. Returned address ( %s ) but correct address is ( %s ). \n",
                actualcupSize, expectedcupSize);
        
        assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
    }
    
    // Additional test cases for other constructors, getters, setters, and methods can be added similarly.
}
