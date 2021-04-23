package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendreport {
	static ExtentReports extend;
	public static ExtentReports getreportobject(){
		
		String path=	System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("web automation result");
			reporter.config().setDocumentTitle("Test Result");
			
			extend=new ExtentReports();
			extend.attachReporter(reporter);
			
			extend.setSystemInfo("tester","priyanka");
	
		return extend;
}
}