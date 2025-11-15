import java.util.Scanner;

public class TypingSpeedTest {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    

    System.out.println("Kindly type:");
    System.out.println("-".repeat(30));

    String originalSentence = "welcome to semicolon";

    System.out.print(originalSentence + ": ");
    long startTime = System.currentTimeMillis();
    String typedSentence = input.nextLine().toLowerCase();

    long endTime = System.currentTimeMillis();

    double timeInSeconds = (endTime - startTime) / 1000.0;
    double timeInMinutes = timeInSeconds / 60.0;

    int numOfWords = typedSentence.split("\\s+").length;
    double wordsPerMinute = numOfWords / timeInMinutes;


    String[] originalWords = originalSentence.split("\\s+");
    String[] typedWords = typedSentence.split("\\s+");
   
    int correctWords = 0;
    for (int i = 0; i < Math.min(originalWords.length, typedWords.length); i++) {
            
    if (originalWords[i].equals(typedWords[i])) {
                correctWords++;
}
}
      

     double accuracy = ((double) correctWords / originalWords.length) * 100;

 System.out.println("\nRESULTS");
 System.out.println("-------------------------");
 System.out.println("Time taken: " + timeInSeconds + " seconds");
 System.out.println("Words per minute: " + wordsPerMinute);
 System.out.println("Accuracy: " + accuracy + "%");

}
}
 

      