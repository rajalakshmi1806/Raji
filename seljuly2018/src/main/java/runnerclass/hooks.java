package runnerclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class hooks extends SeMethods {
	public String iteration="Leads";
	public String author="raji";
	public String category="smoke";
	@Before
	public void before(Scenario sc) {
		beginResult();
		loadObject();
		startTest(sc.getName(), sc.getId());
		startTestIteration(iteration,author,category);
		startApp("chrome","http://leaftaps.com/opentaps");
	}
	@After
	public void after() {
		closeBrowser();
		endResult();
	}
	}


