package tests;

import java.util.logging.Logger;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
   static Logger log = Logger.getLogger(TestRunner.class.getName());
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestSuite.class);

      for (Failure failure : result.getFailures()) {
         log.info(failure.toString());
      }
	  String strResult = String.valueOf(result.wasSuccessful());
      log.info(strResult);
   }
}  
