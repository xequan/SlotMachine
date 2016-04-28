package main.math;

/**This class needs to have the number of spinners and values on each spinner put into it. It 
 * then takes that information and compares the values on each spinner once they are determined
 * and ensures all values are equal to each other. If they are it then determines what value
 * the spinners landed on and adjusts the payout from there and can return that amount. If
 * the values are not all equal then it will return a 0 for the payout.
 * Created by DM53848 & JS54004 on 3/31/2016.
 */
public class PayTable {
	private double payout = 0;
	private int spinners = 0;
	private int numberOfValues = 0;
	String[] results;
	
	public PayTable(int spinners){
		this.spinners = spinners;
	}
	public void setNumberOfValues(int numberOfValues){
		this.numberOfValues = numberOfValues;
	}
	
	public void setSpinnersResult(String results){
		String [] spinnerResult = new String[spinners];
		spinnerResult = results.split(" ");
		this.results = spinnerResult;
	}
	/*
	 * This is where it is determined if the player wins. Needs the bet amount passed into the
	 * method to determine the proper payout. Output will be in cents so will need to be converted
	 * to dollars appropriately.
	 */
	public void setPayout(double bet){
		this.payout = 0;
		boolean isEqual = true;
		int counter = 0;
		for (; counter < results.length; counter++){
			if (counter < results.length-1){
		if (results[counter].equals(results[counter+1])){
				isEqual = true;
				continue;
			}
			else{
				isEqual = false;
				break;
			}
			}
			else{
		}
		if (isEqual == true){

			int multiplier = 2;
			for(int resultCounter = 1; resultCounter <= numberOfValues; resultCounter++){
				if (Integer.parseInt(results[0]) == resultCounter){
					this.payout = multiplier * bet;
					break;
				}
				else {
					multiplier ++;
					continue;
				}
			}
			
		}}
		
	}
	public double getPayout(){
		return payout;
	}
}
