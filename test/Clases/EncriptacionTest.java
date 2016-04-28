/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CRISTIAN
 */
public class EncriptacionTest {
    
    public EncriptacionTest() {
    }
    
    /**
     * Test of encriptar method, of class Encriptacion.
     */
    @Test
    public void testEncriptar() {
        System.out.println("encriptar");
        String contraseña = "123";
        Encriptacion instance = new Encriptacion();
        String expResult = "b9aee62ec36652bfaa5a9e7af8cc09043e43d151abb68b125722fdd1efbf66fceadb6b045ab1e2ea54e3e66e0edda2f06f9221d2557d7029bf2461c5aad565c0";
        String result = instance.encriptar(contraseña);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
