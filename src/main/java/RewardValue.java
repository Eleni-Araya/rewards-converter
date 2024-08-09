
public class RewardValue {
    // Fields to store the cash and miles values
    private double cashValue;
    private int milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    //constructor 1: Accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / MILES_TO_CASH_CONVERSION_RATE);  // Convert cash to miles
    }

    // Constructor 2: Accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;  // Convert miles to cash
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public int getMilesValue() {
        return milesValue;
    }

}
