import java.util.Scanner;

public class FlashcardGameSimple {
    public static void main(String[] args) {
        // Questions and answers
        String[] questions = {
            "What is the capital of France?",
            "What is 5 + 7?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the largest planet in our solar system?"
        };

        String[] answers = {
            "Paris",
            "12",
            "Shakespeare",
            "Jupiter"
        };

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Flashcard Game!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i] + "\n");
            }
        }

        System.out.println("Game over!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
