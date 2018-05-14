package DemoSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test1.*;



@RunWith(Suite.class)
@Suite.SuiteClasses({
	test1.class,
	test2.class,
	Test3.class
	
})
public class DemoSuiteTest {

}
