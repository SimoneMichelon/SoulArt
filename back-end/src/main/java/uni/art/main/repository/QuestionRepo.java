package uni.art.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uni.art.main.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{

}
