package Observer;

import java.util.Observable;
import java.util.Observer;

public class BinObserver extends Observer {
	Subject subject;
	private int state;
	
     public BinObserver(Subject subject){
	      this.subject = subject;
	      subject.addObserver(this);
	 }
     
     public int getState() {
         return state;
     }

     public void setState(int state) {
         this.state = state;
     }
     
	@Override
	public void update() {
		// TODO Auto-generated method stub
	    System.out.println("La valeur du compteur en binaire est: " + Integer.toBinaryString(subject.getState())+ "\n");
	}
}