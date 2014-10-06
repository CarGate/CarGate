/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 18:33:03
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.model;

import de.thm.iem.CarGate.interfaces.IHighscorePlayer;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author yannicklamprecht
 *
 */
@XmlRootElement
public class HighscorePlayer implements IHighscorePlayer {

    @XmlElement(required = true)
    private String name;
    @XmlAttribute
    private long points;

	/**
	 * 
	 */
	public HighscorePlayer(String name, long points) {
		this.name=name;
		this.points=points;
	}
	
	/* (non-Javadoc)
	 * @see de.thm.iem.CarGate.interfaces.IHighscorePlayer#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

    public void setName(String name) {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IHighscorePlayer#getPoints()
     */
	@Override
	public long getPoints() {
		return points;
	}

    public void setPoints(long points){
		this.points=points;
	}
	

}
