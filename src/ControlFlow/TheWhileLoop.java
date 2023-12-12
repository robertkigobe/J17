package ControlFlow;

public class TheWhileLoop {

    //while is used to run when you may not know how many iterations should be done
    public static void main(String[] args) {
        int j = 1; //must be set outside the while
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        j = 1;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        //do while allows the code to run atleast once
        j = 1;
        boolean isReady = false;
        do {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j>0);
        } while (isReady);

        //skip code for some elements, use continue
        int number = 0;
        while (number < 50){
            number += 5;
            if(number % 25 == 0){
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
