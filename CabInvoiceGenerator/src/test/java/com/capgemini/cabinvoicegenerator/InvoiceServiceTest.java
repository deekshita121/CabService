package com.capgemini.cabinvoicegenerator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;


public class InvoiceServiceTest 
{
    
    @Test
   public void givenDistanceAndTime_ShouldReturnTotalFare() {
    	InvoiceGenerator  invoiceGenerator = new InvoiceGenerator();
    	double distance = 2.0;
    	int time = 5;
    	double fare = invoiceGenerator.calculateFare(distance, time);
    	Assert.assertEquals(25, fare, 0.0);
    }
}