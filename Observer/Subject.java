package Observer;
import java.util.Observable;


public class Subject extends Observable implements Runnable{
    
    private int state;

    public Subject(int val) {
		this.setState(val);
	}

    
    public int getState() {
    	return state;
	}
    
	public void setState(int state) {
	    this.state = state;
	    setChanged();
	    notifyObservers(state);
	}

	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				this.setState((this.getState() + 1) % 60);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			}
	}
}