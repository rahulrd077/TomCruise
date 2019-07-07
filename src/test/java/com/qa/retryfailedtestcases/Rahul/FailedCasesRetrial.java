package com.qa.retryfailedtestcases.Rahul;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedCasesRetrial implements IRetryAnalyzer {

	static int RetestCounter = 0;
	
	
	static int MaxRetest = 3 ;
	
	
	public boolean retry(ITestResult result) {
		
		if (RetestCounter<MaxRetest) {
		
			
			System.out.println("Retest "+result.getName());
			System.out.println("Trial of Re-test "+RetestCounter);

	RetestCounter++;
		return true;
	}
		
	
return false;
}
}