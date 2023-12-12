package ControlFlow;

public class TheForloop {

    public static void main(String[] args) {


        //traditional for loop
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5; rate++) {
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("10,000 at " + rate + " % interest =" + interestAmount);
        }

        for (double i = 7.5; i<=10; i+=0.25){
            double interestAmount = calculateInterest(100,i);
            if(interestAmount >8.5){break;}
            System.out.println("100 at " + i + " % interest =" + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
