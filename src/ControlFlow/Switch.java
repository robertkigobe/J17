package ControlFlow;

import com.sun.jdi.Value;

public class Switch {

    public static void main(String[] args) {

        int value = 3;
        System.out.println("Traditional if statement");
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        //Traditional switch statement
        //Only byte, short, int, char, String, enum
        //fall through happens when a break is not encountered executing all ines till a break is found
        int valueSwitch = 8;
        System.out.println("\n\nTraditional switch");
        switch (valueSwitch) {
            case 1:
                System.out.println("Switch Value was 1");
                break;
            case 2:
                System.out.println("Switch Value was 2");
                break;

            case 3:
            case 4:
            case 5:

                System.out.println("Switch Value was a 3, a 4, or a 5");
                System.out.println("Switch Value was actually a " + valueSwitch);
                break;

            default:
                System.out.println("Switch Value was not 1, 2, 3, 4, 5");
                break;

        }

        //new switch features
        switch (valueSwitch) {
            case 1 -> System.out.println("Switch Value was 1");
            case 2 -> System.out.println("Switch Value was 2");
            case 3, 4, 5 -> {
                System.out.println("\n\nModern switch");
                System.out.println("Switch Value was a 3, a 4, or a 5");
                System.out.println("Switch Value was actually a " + valueSwitch);
            }
            default -> System.out.println("Switch Value was not 1, 2, 3, 4, 5");

        }
    }



    }

