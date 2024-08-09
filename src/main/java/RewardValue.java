
public class RewardValue {
    // Fields to store the cash and miles values
    private double cashValue;
    private int milesValue;

    //constructor 1: Accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / 0.0035);  // Convert cash to miles
    }

    // Constructor 2: Accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;  // Convert miles to cash
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
