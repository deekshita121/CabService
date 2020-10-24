package com.capgemini.cabinvoicegenerator;


public class InvoiceGenerator 
{
    private static final double FARE_PER_KILOMETER = 10;

	public double calculateFare(double distance, int time) {
        return distance * FARE_PER_KILOMETER + time;
    }
}
