import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = QuizData.getQuestions();
        String[] answers = QuizData.getAnswers();

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Cavabınızı daxil edin: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Doğru cavab!");
                score++;
            } else {
                System.out.println("Yanlış cavab.");
            }
            System.out.println();
        }

        System.out.println("Oyun bitdi! Sizin toplam balınız: " + score + "/" + questions.length);
        scanner.close();
    }
}
