package com.nathan;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Class de tests unitaire pour la classe main
 */
public class AppTest extends TestCase {
    
    /**
     * Constructeur de la classe de test
     *
     * @param testName Nom du test 
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return la suite des tests unitaires
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test the return with empty parameter
     */
    public void testHelloEmptyParameter()
    {
        assertEquals("Hello World!", App.hello());
    }
}
