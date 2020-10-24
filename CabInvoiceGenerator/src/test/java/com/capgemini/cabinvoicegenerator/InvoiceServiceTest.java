package com.capgemini.cabinvoicegenerator;

import static org.junit.Assert.assertTrue;

import org.junit.Assume;
import org.junit.Before;
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

    public void giveFareFindTheMinimumFare(){
		InvoiceGenerator  invoiceGenerator = new InvoiceGenerator();
		double distance = 1;
		int time = 1;
		double fare =  invoiceGenerator.calculateFare(distance,time);
		Assume.assumeTrue(5>fare);
		//Now update the functionality to support minimum fare.
	}
}
