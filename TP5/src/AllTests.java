/*
 * Created on 12 mars 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author Michel
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
import junit.framework.*;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(CompteurTest.suite());
		
		return suite;
	}

//	public static void main(String[] args) {
//		junit.textui.TestRunner.run(suite());
//	}
}
