package carde;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldDemonstratelogging()
    {
         CarServices carServices=new CarServices();
         carServices.process("BMW");
    }
}
