package testMethodsAnna;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	static ExtentReports extent;
	
	
	public static  ExtentReports getReport() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("flipkart automation results");
		reporter.config().setDocumentTitle("flipkart Result");
	
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Umesh Bhaskar Awasarmol");
//		ExtentEmailReporter emailReporter = new ExtentEmailReporter("Email.html");

		// optional, select a template
		

//		extent.attachReporter(emailReporter);
		return extent;
		
		
			
		
	}



}
