package com.vnrvjiet.Preethi.logging_assignment.ConstructionCost;

import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculate {
	int materialChoice;
	long area;
	private static final Logger LOGGER=LogManager.getLogger(Calculate.class);
	public void calculate()
	{
		Scanner reader=new Scanner(System.in);
		LOGGER.info("enter your choice for material to be used");
		LOGGER.info("1.Standard Materials 2.Above Standard Materials 3.High standard materials 4.High standard materials andAutomated house");
		materialChoice=reader.nextInt();
		LOGGER.info("Enter area of house in square feets");
		area=reader.nextInt();
		long cost=0,flag=0;
		switch(materialChoice)
		{
		case 1:cost=1200*area;
		break;
		case 2:cost=1500*area;
		break;
		case 3:cost=1800*area;
		break;
		case 4:cost=area*2500;
		break;
		default:flag=1;LOGGER.info("enter valid choice");
		}
		if(flag==0)
		LOGGER.info("cost for constructing a house is "+cost);
	}

}

