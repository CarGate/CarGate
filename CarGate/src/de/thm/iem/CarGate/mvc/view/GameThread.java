/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 11.09.2014 17:33:31
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view;

import java.util.concurrent.TimeUnit;

/**
 * @author yannicklamprecht
 *
 */
public class GameThread implements Runnable{
	
	private int ticks;
    private CarField field;
    private boolean running = true;

    public GameThread(CarField field, int ticks) {
        this.field = field;
        this.ticks = ticks;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
	@Override
	public void run() {

		do{
            field.repaint();
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(1/ticks));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(running);

    }
	
	public void setRunning(boolean running){
		this.running=running;
	}
	
	

}
