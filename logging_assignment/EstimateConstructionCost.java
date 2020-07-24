package com.vnrvjiet.Preethi.logging_assignment;

import com.vnrvjiet.Preethi.logging_assignment.ConstructionCost.Calculate;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class EstimateConstructionCost {
	private static final Logger LOGGER=LogManager.getLogger(EstimateConstructionCost.class);
	public static void main(String args[])
	{
		Calculate calculator=new Calculate();
		calculator.calculate();
	}

}