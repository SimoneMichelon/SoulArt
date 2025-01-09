package uni.art.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uni.art.main.model.Question;
import uni.art.main.repository.QuestionRepo;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepo questionRepo;
	
	public QuestionService() {}
	
	public List<Question> getAll() {
		return questionRepo.findAll();
	}

}
