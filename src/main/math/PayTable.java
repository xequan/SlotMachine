package main.math;

/**
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
	
	public void setPayout(int bet){
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
