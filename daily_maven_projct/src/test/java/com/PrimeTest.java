package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeTest {
	 @Test
     public void evaluatesExpression() 
	 {
		Prime n=new Prime();
		boolean s=n.isPrime(6);
		 assertEquals(false,s);
		
	 }
	 }


