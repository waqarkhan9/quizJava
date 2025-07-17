import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

   

    /*
     * questions array
     * score
     * result
     * 
     */
    public static void main(String[] args) throws Exception {
        int score = 0;
        Questions qq = new Questions();
        qq.captialQuiz();



        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the quiz");
        System.out.println("Type the answer to the questions");

        for (Map.Entry<String, String> entry : qq.questions.entrySet()) {
            String q = entry.getKey();
            String a = entry.getValue();
            System.out.println(q);
            String res = sc.nextLine();

            if (res.equalsIgnoreCase(a)) {
                System.out.println("correct");
                score = score +1;
                System.out.println("Score :" + score);

            } else {
                System.out.println("Wrong");
                System.out.println("Score :" + score);
            }

        }
        // System.out.println("Your Score for the quiz is :" + score);

    }
}
