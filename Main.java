import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // İlk olaraq Xoş gəlmisiniz mesajı
        System.out.println("Xoş gəlmisiniz! Quiz Game-ə başlamağa hazır olun!");

        // Scanner obyektini yaradıb istifadəçidən məlumat alırıq
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Suallar və cavablar
        String[] questions = {
            "Java proqramlaşdırma dili hansı ildə yaradılıb? (a) 1995 (b) 2000 (c) 1985",
            "Hangi metod Java-da əsas giriş nöqtəsidir? (a) start() (b) main() (c) init()",
            "Hansı məlumat tipi tam ədədləri saxlayır? (a) float (b) int (c) double"
        };

        String[] answers = { "a", "b", "b" };  // Doğru cavablar

        // Sualları istifadəçiyə təqdim edirik
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);  // Sualı göstəririk
            System.out.print("Cavabınızı daxil edin: ");
            String userAnswer = scanner.nextLine();  // İstifadəçidən cavab alırıq

            // Doğru cavabı yoxlayırıq
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Doğru cavab!");
                score++;  // Doğru cavab verildikdə bal artır
            } else {
                System.out.println("Yanlış cavab.");
            }
            System.out.println();
        }

        // Oyun bitdikdən sonra nəticəni göstəririk
        System.out.println("Oyun bitdi! Sizin toplam balınız: " + score + "/" + questions.length);

        // Scanner obyektini bağlayırıq
        scanner.close();
    }
}
