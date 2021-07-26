/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Anthony Diaz
 */
public class ArrayExerciseATest {
    
    /*  Test Plan:
    **  maxOfArray([0]) → 0
    **  maxOfArray([-5]) → -5
    **  maxOfArray([1, 20, 3]) → 20
    **  maxOfArray([-5, -2, -35]) → -2
    **  maxOfArray([6, -3, 0, 4, 1, -7]) → 6
    **  maxOfArray([]) → 0
    */
    
    public ArrayExerciseATest() {
        
    }
    
    @Test
    public void testArrayOneNum() {
        // ARRANGE - for simple methods, this means setting up the parameters
        int[] array = {0};
        
        
        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        int result = maxOfArray(array);
        
        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.
        int expectedResult = 0;
        
        assertEquals(result, expectedResult, "[0] should return 0!" );
    }
    
    @Test
    public void testArrayOneNumNegative() {
        // ARRANGE - for simple methods, this means setting up the parameters
        int[] array = {-5};
        
        
        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        int result = maxOfArray(array);
        
        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.
        int expectedResult = -5;
        
        assertEquals(result, expectedResult, "[-5] should return -5!" );
    }
    
    @Test
    public void testArrayMultiNumPositive() {
        // ARRANGE - for simple methods, this means setting up the parameters
        int[] array = {1, 20, 3};
        
        
        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        int result = maxOfArray(array);
        
        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.
        int expectedResult = 20;
        
        assertEquals(result, expectedResult, "[1, 20, 3] should return 20!" );
    }
    
    @Test
    public void testArrayMultiNumNegative() {
        // ARRANGE - for simple methods, this means setting up the parameters
        int[] array = {-5, -2, -35};
        
        
        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        int result = maxOfArray(array);
        
        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.
        int expectedResult = -2;
        
        assertEquals(result, expectedResult, "[-5, -2, -35] should return -2!" );
    }
    
    @Test
    public void testArrayMultiNumMix() {
        // ARRANGE - for simple methods, this means setting up the parameters
        int[] array = {6, -3, 0, 4, 1, -7};
        
        
        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        int result = maxOfArray(array);
        
        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.
        int expectedResult = 6;
        
        assertEquals(result, expectedResult, "[6, -3, 0, 4, 1, -7] should return 6!" );
    }
    
    @Test
    public void testArrayNone() {
        // ARRANGE - for simple methods, this means setting up the parameters
        int[] array = {};
        
        
        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        int result = maxOfArray(array);
        
        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.
        int expectedResult = 0;
        
        assertEquals(result, expectedResult, "[] should return 0!" );
    }
    
}
