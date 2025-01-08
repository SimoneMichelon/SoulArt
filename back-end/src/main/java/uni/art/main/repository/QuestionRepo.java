package uni.art.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uni.art.main.model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer>{

}
