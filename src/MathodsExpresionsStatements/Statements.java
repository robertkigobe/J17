package MathodsExpresionsStatements;

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
    }
}
