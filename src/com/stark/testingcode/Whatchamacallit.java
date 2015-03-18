package com.stark.testingcode;

public class Whatchamacallit 
{

	    private double price;
	    private String title;

	    public Whatchamacallit() {
	        	this (0, "none");
	    }

	    public Whatchamacallit(double p, String t) {
	        price = 0;
	        if (p > 0)
	            	price = p;
	        	title = t;
	    }

	    public String toString() {
	        return title + " costs $" + price;
	    }
}