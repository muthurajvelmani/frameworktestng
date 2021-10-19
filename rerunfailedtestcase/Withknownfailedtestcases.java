package org.rerunfailedtestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Withknownfailedtestcases implements IRetryAnalyzer {
int mincount=0;
int maxcount=3;
	@Override
	public boolean retry(ITestResult result) {
		if(mincount<maxcount) {
			mincount++;
			return true;
		}
		return false;
	}

}
