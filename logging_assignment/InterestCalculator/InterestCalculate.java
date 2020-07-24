package com.vnrvjiet.Preethi.logging_assignment.InterestCalculator;

import java.util.Scanner;
import org.apache.logging.log4j.Logger;

import com.vnrvjiet.Preethi.logging_assignment.ConstructionCost.Calculate;

import org.apache.logging.log4j.LogManager;

public class InterestCalculate {
	
	int principle,time,rateofinterest;
	private static final Logger LOGGER=LogManager.getLogger(InterestCalculate.class);
	public void readInput()
	{
		Scanner read=new Scanner(System.in);
		LOGGER.info("enter the principle amount");
		principle=read.nextInt();
		LOGGER.info("enter time period");
		time=read.nextInt();
		LOGGER.info("enter rate of interest");
		rateofinterest=read.nextInt();
		read.close();
	}
	public void SimpleInterest()
	{
		readInput();
		double simpleinterest=(double)principle*time*rateofinterest/100;
		LOGGER.info("Simple interest is "+simpleinterest);
	}
	public void CompoundInterest()
	{
		readInput();
		float CI;
		CI=1+rateofinterest*(float)0.01;
		CI=(float)Math.pow(CI, time);
		CI=principle*CI-principle;
		LOGGER.info1
		("Compound interest is "+CI);
	}

}


