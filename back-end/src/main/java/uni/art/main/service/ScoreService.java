package uni.art.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uni.art.main.model.Score;
import uni.art.main.repository.ScoreRepo;

@Service
public class ScoreService {

	@Autowired
	ScoreRepo scoreRepo;
	
	public List<Score> getAll() {
		return scoreRepo.findAll();
	}
	
}
