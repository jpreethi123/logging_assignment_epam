package com.vnrvjiet.Preethi.logging_assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.vnrvjiet.Preethi.logging_assignment.InterestCalculator.InterestCalculate;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class EstimateInterest {
	private static final Logger LOGGER=LogManager.getLogger(EstimateInterest.class);
	public static void main(String args[]) throws IOException
	{
		int choice;
		PrintWriter writer=new PrintWriter(System.out);
		Scanner read=new Scanner(System.in);
		LOGGER.info("1.Calculet Simple Interest 2.Calculate Compound Interest");
		choice=read.nextInt();
		InterestCalculate calculator=new InterestCalculate();
		if(choice==1)
			calculator.SimpleInterest();
		else if(choice==2)
			calculator.CompoundInterest();
		else
			writer.write("invalid choice");
		read.close();
		
	}

}