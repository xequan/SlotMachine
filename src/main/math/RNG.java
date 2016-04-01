package main.math;

/**
 * Created by DM53848 on 3/31/2016.
 * Coded by Joey And Melissa 
 * 
 * This Class creates the random method for the spinner and contains the method that sets the range of the spinner.
 */


public class RNG {
	int min=0;
	int max=0;
	
	//Creates the random function of the spinner
	public int getRandom(){
		int faces=(int)(Math.random()*((max-min)+1)+min);
		return faces;
	}
	//Sets the range of the spinner
	public void setRange(int min,int max){
		this.min=min;
		this.max=max;		
	}

	
	
	
	
	
	
}


