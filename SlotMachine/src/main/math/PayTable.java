package main.math;

/**
 * Created by DM53848 & JS54004 on 3/31/2016.
 */
public class PayTable {
	private double payout = 0;
	private int spinners = 0;
	private int numberOfValues = 0;
	
	public void setSpinnerCount(int spinners){
		this.spinners = spinners;
	}
	public void setNumberOfValues(int numberOfValues){
		this.numberOfValues = numberOfValues;
	}
	
	public String[] getSpinnersResult(String results){
		String [] spinnerResult = new String[spinners];
		spinnerResult = results.split(" ");
		return spinnerResult;
	}
	
	public void setPayout(String[] results, double bet){
		boolean isEqual = true;
		int counter = 0;
		for (; counter < results.length; counter++){
		if (results[counter].equals(results[counter+1])){
				isEqual = true;
				continue;
			}
			else{
				isEqual = false;
				break;
			}
				
		}
		if (isEqual == true){
			for(int resultCounter = 1; resultCounter < numberOfValues; resultCounter++){
				double multiplier = 1.1;
				if (Integer.parseInt(results[0]) == resultCounter){
					payout = multiplier * bet;
					break;
				}
				else {
					multiplier += .1;
					continue;
				}
			}
		}
		
	}
	public double getPayout(){
		return payout;
	}
}
