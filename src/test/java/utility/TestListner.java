package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.Logintest;

public class TestListner implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			Screenshot.capturescreen(Logintest.driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}}