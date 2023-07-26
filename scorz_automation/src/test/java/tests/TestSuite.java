package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Test_Login.class, Test_SignUp_Email.class, Test_Login_iOS.class })
public class TestSuite {

}
