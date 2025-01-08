package uni.art.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uni.art.main.model.Category;
import uni.art.main.repository.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepo categoryRepo;
	
	public List<Category> getAll() {
		return categoryRepo.findAll();
	}

}
