package uni.art.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uni.art.main.service.CategoryService;
import uni.art.main.service.QuestionService;
import uni.art.main.service.ScoreService;

@SpringBootApplication
public class SoulArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoulArtApplication.class, args);
		
		QuestionService questionService = new QuestionService();

		CategoryService categoryService = new CategoryService();
		
		ScoreService scoreService = new ScoreService();
		
		//questionService.getAll().forEach( t -> System.out.println(t));
		
	}

}
