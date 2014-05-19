/*
 * Created on 3 mars 2006
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

public class CompteurTest extends TestCase {
	//	TestCase est d�fini dans JUnit
	//	constructeur typique d�une classe de test JUnit
	public CompteurTest(String name) {
		super(name); // appel du constructeur de TestCase
	}
	//	une classe de test comprenant plusieurs cas de test
	public void testAjouterVal() throws CompteurInvalide {
		Compteur c1 = new Compteur(5);
		c1.ajouterVal(5);
		//	premi�re assertion de test :
		//	si la valeur du co²mpteur est diff�rente de 9, on provoque un �chec du test :
		assertEquals(c1.getVal(), 10);
		c1.ajouterVal(3);
		//	deuxi�me assertion de test
		//	on utilise ici la possibilit� d�adjoindre un message d�erreur :
		assertEquals("Le compteur devrait valoir 13", c1.getVal(), 13);
	}
	//	test sp�cifique de la lev�e d�exception en cas de valeur n�gative
	public void testCreation() {
		try {
			Compteur c1 = new Compteur(2);
			//	si on arrive ici, c�est que l�exception n�a pas �t� lev�e
			fail("Cr�ation compteur avec valeur n�gative non d�tect�e !");
		} catch (CompteurInvalide e) {
		}
		//		l�exception CompteurInvalide a bien �t� lev�e
		assertTrue(true); // le test est donc OK

	}
	
	public static Test suite() {
	  TestSuite suite= new TestSuite();
	  suite.addTest(new CompteurTest("testAjouterVal"));
	  suite.addTest(new CompteurTest("testCreation"));
	  return suite;
	}
	
//	public static Test suite() {
//	  return new TestSuite(CompteurTest.class);
//	}


}
