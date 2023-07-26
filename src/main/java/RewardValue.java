import java.util.Scanner;

public class RewardValue {
    private double cashVal;
    private double milesVal;

    //Default Constructors
    public RewardValue(){
        cashVal = 0;
        milesVal = 0;
    }
    //Overloaded Constructors
    public RewardValue(double cash_in){
        this.cashVal = cash_in;

    }

    public RewardValue(int miles_in){
        this.milesVal = miles_in;
        
    }

    //Getters
    public double getCashValue(){
        cashVal = milesVal / 0.0035;
        return cashVal;
    }

     public double getMilesValue(){
        milesVal = cashVal * 0.0035;
        return milesVal;
    }






}