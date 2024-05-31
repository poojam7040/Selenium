package com.crm.listeners;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersRetry implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int start = 0 ;
		int end = 5 ;
		
		for(int i = start ; i<end ; )
		{
			if(result.wasRetried())
			{
				i++ ;
			    return  true;
			}
		}
		return false ;
	}

}
