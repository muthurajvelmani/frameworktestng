package org.screenshot;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class Fbloginfailedscreenshot extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			screenshot("fbfailed");
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("failed test");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
