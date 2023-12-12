package ControlFlow;

import com.sun.jdi.Value;

public class Switch {

    public static void main(String[] args) {
        int value = 3;
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
        int valuseSwitch = 4;
        switch (valuseSwitch) {
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
                System.out.println("Switch Value was actually a " + valuseSwitch);
                break;

            default:
                System.out.println("Switch Value was not 1, 2, 3, 4, 5");
                break;

        }

        //new switch features
        switch (valuseSwitch) {
            case 1 -> System.out.println("Switch Value was 1");
            case 2 -> System.out.println("Switch Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Switch Value was a 3, a 4, or a 5");
                System.out.println("Switch Value was actually a " + valuseSwitch);
            }
            default -> System.out.println("Switch Value was not 1, 2, 3, 4, 5");

        }
        String month = "MAY";
        System.out.println(month + " is in the " + getQuaterNew(month) + " quarter");

    }
        //Traditional values
        public static String getQuater (String month){
            switch (month) {
                case "JANUARY":
                case "FEBRUARY":
                case "MARCH":
                    return ("1st");

                case "APRIL":
                case "MAY":
                case "JUNE":
                    return ("2nd");

                case "JULY":
                case "AUGUST":
                case "SEPTEMBER":
                    return ("3rd");

                case "OCTOBER":
                case "NOVEMBER":
                case "DECEMBER":
                    return ("4th");
            }
                return ("bad");


        }

    //New Switch JDK 13/14
    public static String getQuaterNew (String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st"; } //allows expressions in the case
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                //return badResponse;
            yield badResponse;
            }
        };

    }

    }

