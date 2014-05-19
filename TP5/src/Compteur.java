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
public class Compteur {
	private int val ;
	
	public Compteur(int a) throws CompteurInvalide {
	if (a < 0)
		throw new CompteurInvalide();
	else
		val = a;
	}
	public int getVal() { return val; }
	public void ajouterVal(int a) { val = val + a; }

}
