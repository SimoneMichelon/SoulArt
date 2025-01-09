package uni.art.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import uni.art.main.model.Category;
import uni.art.main.model.Question;
import uni.art.main.service.QuestionService;

@SpringBootApplication
public class SoulArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoulArtApplication.class, args);
	}

	@Bean
	CommandLineRunner run(QuestionService questionService) {
	    return args -> {
	        Scanner scanner = new Scanner(System.in);
	        Map<Category, Integer> scores = new HashMap<>();

	        questionService.getAll().forEach(question -> processQuestion(question, scanner, scores));
	        
	        printScores(scores);

	        scanner.close();
	    };
	}

	/**
	 * 
	 * @param question
	 * @param scanner
	 * @param scores
	 */
	private void processQuestion(Question question, Scanner scanner, Map<Category, Integer> scores) {
	    System.out.println("****************************************************");
	    System.out.print(question.getBody() + " - Risposta da 1 a 5: ");
	    
	    int score = getValidScore(scanner);
	    scores.merge(
	        question.getCategory(), 
	        score, 
	        Integer::sum
	    );
	}

	/**
	 * 
	 * @param scanner
	 * @return
	 */
	private int getValidScore(Scanner scanner) {
	    int value;
	    do {
	        while (!scanner.hasNextInt()) {
	            System.out.print("Inserisci un numero valido (1-5): ");
	            scanner.next();
	        }
	        value = scanner.nextInt();
	        if (value < 1 || value > 5) {
	            System.out.print("Il punteggio deve essere tra 1 e 5: ");
	        }
	    } while (value < 1 || value > 5);

	    return value;
	}

	/**
	 * 
	 * @param scores
	 */
	private void printScores(Map<Category, Integer> scores) {
	    System.out.println("***************************************");
	    scores.forEach((category, totalScore) -> {
	        double percentage = (double) totalScore / 15 * 100;
	        System.out.printf("%s: %.2f%%%n", category.getName(), percentage);
	    });
	    System.out.println("***************************************");
	}


}
