package MathodsExpresionsStatements;

public class MainMethods {
    //static===============>Can be called directly using the class name
    //public===============>Accesible to the outside world
    //void: ===============>returns no value

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;
        CalculateScore(gameOver,score,levelCompleted, bonus);
int newScore = calculateScore( "Tim ", 500);
        int newScore2 = calculateScore(500,  "Tim " );
    }

    public static void CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int CalculateScoreReturn(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver == true){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your high score was " + finalScore);
        }

        return finalScore;
    }

    //Method overloading, this is used to create good clean code
    int parameterInt;
    float parameterFloat;

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored "+ score+ " points");
        return score * 1000;
    }

    public static int calculateScore(int score, String playerName){
        System.out.println( "Scored "+ score+ " points " + " by Player "+ playerName);
        return score * 1000;
    }

    public static void doSomething(int parameterInt, float parameterFloat){}

    public static void doSomething(float parameterFloat, int parameterInt ){}

    public static void doSomething(float parameterFloat, int parameterInt, float parameterFloatB ){}

}
