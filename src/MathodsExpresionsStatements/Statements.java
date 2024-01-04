package MathodsExpresionsStatements;

import java.util.List;

public class Statements {
    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable =" + myVariable);

        boolean gameOver = true;
        int score = 5000;
         int levelCompleted = 5;
         int bonus = 100;

         if(score == 5000){
             System.out.println("Your score was 5000");
         }

         //Branching statements
        //These use: break, continue, return
        String found = null;
         List<String> list = List.of("24","42","31","2","1");
         for(String s: list){
             System.out.print(s +" ");
             if(s.contains("3")){
                 found = s;
                 break;
             }
         }
         System.out.println("Found " + found);

        String found1 = null;
        List<List<String>> listOfLists = List.of(
                List.of("24","16","1","2","1"),
                List.of("43","42","31","3","3"),
                List.of("24","22","31","2","1"));
//    exit: for(List<String> 2: listOfLists){
//            for(String s: 1){
//                System.out.print(s +" ");
//                if(s.contains("3")){
//                    found1 =s;
//                    break;
//                }
//            }
//        }
    }
}
