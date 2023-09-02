package controller;

public class TidController extends Thread {
	
	private int ID;
	
	public TidController(int ID) {
		this.ID = ID;
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + ID + " de TID " + getId());
	}

}
