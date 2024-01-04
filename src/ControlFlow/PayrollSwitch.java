package ControlFlow;

public class PayrollSwitch {

    public static void main(String[] args) {

        String month = "APRIL";
        System.out.println("\n\n=============================================================================");
        System.out.println("Your approximate leave balance will be: " + calculateProbableLeaveDays(month) + " at the end of " + month + " 2024");
        System.out.println("=============================================================================");

    }

    //New Switch JDK 13/14
    public static String calculateProbableLeaveDays(String month) {
        double leaveDays = 1.8;

        return switch (month) {
            case "JANUARY" -> { yield String.valueOf(1+leaveDays) + " days"; }
            case "FEBRUARY"-> { yield String.valueOf(2+leaveDays) + " days"; }
            case  "MARCH" -> { yield String.valueOf(3+leaveDays) + " days"; }
            case "APRIL" -> { yield String.valueOf(4+leaveDays) + " days"; }
            case "MAY"-> { yield String.valueOf(5+leaveDays) + " days"; }
            case  "JUNE" -> { yield String.valueOf(6+leaveDays) + " days"; }
            case "JULY" -> { yield String.valueOf(7+leaveDays) + " days"; }
            case "AUGUST"-> { yield String.valueOf(8+leaveDays) + " days"; }
            case  "SEPTEMBER" -> { yield String.valueOf(9+leaveDays) + " days"; }
            case "OCTOBER" -> { yield String.valueOf(10+leaveDays) + " days"; }
            case "NOVEMBER"-> { yield String.valueOf(11+leaveDays) + " days"; }
            case  "DECEMBER" -> { yield String.valueOf(12+leaveDays) + " days"; }
            default -> {
                String badResponse = month + " is bad";
                //return badResponse;
                yield badResponse;
            }
        };

    }

}

