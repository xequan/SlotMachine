package main.business;

import javax.swing.JTextField;

import main.math.RNG;
import main.ui.util.Displayable;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class Spinner extends Thread implements Displayable{
	private int showingFace = 0;
	RNG randomNumberGenerator;
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

	public Spinner() {
		this.randomNumberGenerator = new RNG();
		this.randomNumberGenerator.setRange(1, 3);

	}

	public void run() {
			for(int counter = 0; counter < 20; counter++){
				showingFace = (int)randomNumberGenerator.getRandom();
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

	}
}
