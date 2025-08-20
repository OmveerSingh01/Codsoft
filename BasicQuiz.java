import java.util.*;

 class Question {
    String questionText;
    List<String> options;
    int correctOptionIndex;

    public Question(String questionText, List<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }
}

 class QuizTimer {
    Timer timer;
    int secondsRemaining;

    public QuizTimer(int seconds) {
        timer = new Timer();
        secondsRemaining = seconds;
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (secondsRemaining > 0) {
                    System.out.println("Time remaining: " + secondsRemaining + " seconds");
                    secondsRemaining--;
                } else {
                    System.out.println("Time's up!");
                    timer.cancel();
                }
            }
        }, 0, 1000);
    }
}

  class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// writing questions for the quiz 
        List<Question> quizQuestions = Arrays.asList(
            new Question("What is the Capital of India?", Arrays.asList("Chennai", "Mumbai", "Delhi", "Bangalore"), 2),
            new Question("The Chandrayaan 3 mission's rover is known as", Arrays.asList("Vikram", "Bheem", "Pragyan", "Dhruv"), 2),
            new Question("Where is cricket world cup 2023 held", Arrays.asList("Australia", "India", "Pakistan", "England"), 1),
            new Question("How Old is the Solar System", Arrays.asList("5000 years", "5 million years", "500 million years", "5 billion years"), 3),
            new Question("Which planet is known as the 'Red Planet'?", Arrays.asList("Earth", "Mars", "Venus", "Jupiter"), 1)
        );

        int userScore = 0;
        QuizTimer quizTimer = new QuizTimer(15); // 15 seconds for each question

        for (int i = 0; i < quizQuestions.size(); i++) {
            Question question = quizQuestions.get(i);

            System.out.println("Question " + (i + 1) + ": " + question.questionText);
            for (int j = 0; j < question.options.size(); j++) {
                System.out.println((j + 1) + ". " + question.options.get(j));
            }

            int selectedOption = sc.nextInt();
            if (selectedOption == question.correctOptionIndex + 1) {
                System.out.println("Correct!");
                userScore++;
            } else {
                System.out.println("Incorrect!");
            }

            quizTimer.secondsRemaining = 15; // Reset timer for the next question
        }

        quizTimer.timer.cancel();
        //displaying the toatl quiz score .
        System.out.println("Quiz finished!");
        System.out.println("Your score: " + userScore + " out of " + quizQuestions.size());
        if(userScore > 3){
            System.out.println("You hava a great knowledge.");
        }
        else{
     System.out.println("Nice,try !!!But Learn more " );
        }
        System.out.println("All the Best ");
    }

}
