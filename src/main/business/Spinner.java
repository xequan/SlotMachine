package main.business;

import javax.swing.JTextField;

import main.math.RNG;
import main.ui.util.Displayable;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class Spinner extends Thread implements Displayable{
	private int showingFace = 0;
	private JTextField spinnerField;
	private int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public JTextField getSpinnerField() {
		return spinnerField;
	}

	public void setSpinnerField(JTextField spinnerField) {
		this.spinnerField = spinnerField;
	}


	public void run() {
		int counter = 0;

		for(; counter < 200; counter++){
			showingFace = (int)RNG.getRandom();
			display(showingFace + "");
			try{
				Thread.sleep(runTime);

			}
			catch(InterruptedException e){

			}
		}
	}

	public int getShowingFace() {
		return this.showingFace;
	}

	@Override
	public void display(String display) {
		spinnerField.setText(display);
//		System.out.println(display);

	}
}
