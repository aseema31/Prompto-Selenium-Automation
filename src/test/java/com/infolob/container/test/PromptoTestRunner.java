package test.java.com.infolob.container.test;

import java.util.Arrays;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;



public class PromptoTestRunner {

	public static void main(String...strings )
	{
		TestNG testng = new TestNG();
		XmlTest xmlTest = new XmlTest();
		xmlTest.setName("Sample Test");
		xmlTest.addParameter("username", strings[0]);
		xmlTest.addParameter("password", strings[1]);
		xmlTest.addParameter("driverPath", strings[2]);
		xmlTest.addParameter("excelPath", strings[3]);
		xmlTest.setClasses(Arrays.asList(new XmlClass(LandingPageTest.class)));

		XmlSuite xmlSuite = new XmlSuite();
		xmlSuite.setName("Sample Suite");
		xmlTest.setSuite(xmlSuite);
		xmlSuite.setTests(Arrays.asList(xmlTest));
		testng.setXmlSuites(Arrays.asList(xmlSuite));
		testng.run();
	}
}
