package main.business;

import main.math.RNG;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class Spinner {
    private int showingFace = 0;
    RNG randomNumberGenerator;

    public Spinner() {
        this.randomNumberGenerator = new RNG();
        this.randomNumberGenerator.setRange(1, 3);

    }

    public void spin() {
        this.showingFace = randomNumberGenerator.getRandom();
    }

    public int getShowingFace() {
        return this.showingFace;
    }
}
