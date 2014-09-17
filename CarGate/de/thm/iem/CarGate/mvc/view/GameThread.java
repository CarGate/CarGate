/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 11.09.2014 17:33:31
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * @author yannicklamprecht
 *
 */
public class GameThread implements Runnable{
	
	private int ticks;
	private Vector<GameObject> objects;
	private boolean running = true;

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		do{
			GameObject.update(objects);
			try {
				Thread.sleep(TimeUnit.SECONDS.toMillis(1/ticks));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(running);
		
	}
	
	
	public GameThread(Vector<GameObject> objects, int ticks){
		this.objects = objects;
		this.ticks=ticks;
	}
	
	public void setRunning(boolean running){
		this.running=running;
	}
	
	

}
