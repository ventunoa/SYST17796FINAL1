/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.incomecalc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Noah
 */
public class iCalcTest {
    
    public iCalcTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateNet method, of class iCalc.
     */
    @Test
    public void testCalculateNet() {
        System.out.println("calculateNet");
        int hours = 50;
        int rate = 15;
        int tax = 20;
        iCalc instance = new iCalc();
        int expResult = 730;
        int result = instance.calculateNet(hours, rate, tax);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCalculateNetBad() {
        System.out.println("calculateNet");
        int hours = 50;
        int rate = 15;
        int tax = -10;
        iCalc instance = new iCalc();
        int expResult = 730;
        int result = instance.calculateNet(hours, rate, tax);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
