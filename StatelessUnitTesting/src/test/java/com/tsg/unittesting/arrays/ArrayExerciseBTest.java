/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseB.multiplyAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Anthony Diaz
 */
public class ArrayExerciseBTest {
    
    public ArrayExerciseBTest() {
    }
    
    /*  Test Plan:
    **  multiplyAll(0, [0]) → [0]
    **  multiplyAll(0, [-5, 1, 0]) → [0, 0, 0]
    **  multiplyAll(0, []) → []
    **  multiplyAll(2, [0]) → [0]
    **  multiplyAll(2, [-5, 1, 0]) → [-10, 2, 0]
    **  multiplyAll(2, []) → []
    ** multiplyAll(-2, [0]) → [0]
    **  multiplyAll(-2, [-5, 1, 0]) → [10, -2, 0]
    **  multiplyAll(-2, []) → []
    */

    @Test
    public void testZeroOneValue() {
        int num = 0;
        int[] numbers = {0};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {0};
        
        assertArrayEquals(result, expectedResult, "0 * [0] should return [0]!");
    }
    
    @Test
    public void testZeroMultiValue() {
        int num = 0;
        int[] numbers = {-5, 1, 0};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {0, 0, 0};
        
        assertArrayEquals(result, expectedResult, "0 * [-5, 1, 0] should return [0, 0, 0]!");
    }
    
    @Test
    public void testZeroNone() {
        int num = 0;
        int[] numbers = {};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {};
        
        assertArrayEquals(result, expectedResult, "0 * [] should return []!");
    }
    
    @Test
    public void testTwoOneValue() {
        int num = 2;
        int[] numbers = {0};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {0};
        
        assertArrayEquals(result, expectedResult, "2 * [0] should return [0]!");
    }
    
    @Test
    public void testTwoMultiValue() {
        int num = 2;
        int[] numbers = {-5, 1, 0};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {-10, 2, 0};
        
        assertArrayEquals(result, expectedResult, "2 * [-5, 1, 0] should return [-10, 2, 0]!");
    }
    
    @Test
    public void testTwoNone() {
        int num = 2;
        int[] numbers = {};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {};
        
        assertArrayEquals(result, expectedResult, "2 * [] should return []!");
    }
    
    @Test
    public void testNegTwoOneValue() {
        int num = -2;
        int[] numbers = {0};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {0};
        
        assertArrayEquals(result, expectedResult, "-2 * [0] should return [0]!");
    }
    
    @Test
    public void testNegTwoMultiValue() {
        int num = -2;
        int[] numbers = {-5, 1, 0};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {10, -2, 0};
        
        assertArrayEquals(result, expectedResult, "-2 * [-5, 1, 0] should return [10, -2, 0]!");
    }
    
    @Test
    public void testNegTwoNone() {
        int num = -2;
        int[] numbers = {};
       
        int[] result = multiplyAll(num, numbers);
        int[] expectedResult = {};
        
        assertArrayEquals(result, expectedResult, "-2 * [] should return []!");
    }
    
}
