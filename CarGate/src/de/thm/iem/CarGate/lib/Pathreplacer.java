/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 17:03:21
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.lib;

/**
 * @author yannicklamprecht
 *
 */
public class Pathreplacer {

	private String s ;
	
	public Pathreplacer(String s){
		this.s=s;
	}
	
	
	public String replace(){
		return s.replaceAll("mvc", "resources").replaceAll(".java", "").replaceAll(".", "/").concat(".png");
	}
	
	public String replace(String concat){
		
		if(concat != null){
			return s.replaceAll("mvc", "resources").replaceAll(".java", "").replaceAll(".", "/").concat(concat).concat(".png");			
		}else{
			return replace();
		}
		
		
	}
	
	
	

}
