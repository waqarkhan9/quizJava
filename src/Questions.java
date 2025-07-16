import java.util.Dictionary;
import java.util.Hashtable;


public class Questions {
    Dictionary <String, String> questions = new Hashtable<>();

    questions.put("What is the capital of Pakistan?", "Islamabad");
    questions.put("What is the capital of France?", "Paris");


    public void starQuiz(){
       for (String q : questions.values()) {
            System.out.println(q);
        }
    }
}
