package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testcasefail {
@Test
public void testfail() {
	String status="true";
	Assert.assertEquals(status, true,"Failed : ");
	Reporter.log("Succesfully created campaign    ",true);
	
	Reporter.log("Checkingggggggg",true);
	}
}
