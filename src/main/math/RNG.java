package main.math;

/**
 * Created by DM53848 on 3/31/2016.
 * Coded by Joey And Melissa 
 * 
 * This Class creates the random method for the spinner and contains the method that sets the range of the spinner.
 */


public class RNG extends Thread{
	int min=0;
	int max=0;

	int theRandomNumber = 0;

	@Override
	public void run(){
		while(true){
			theRandomNumber=(int) (Math.random()*((max-min)+1)+min);
			try{
				Thread.sleep(20);
			}catch(InterruptedException e){

			}
		}

	}
	public int getRandom(){
		return theRandomNumber;
	}

	//Sets the range of the spinner
	public void setRange(int min,int max){
		this.min=min;
		this.max=max;		
	}







}


