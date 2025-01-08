package uni.art.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uni.art.main.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository< Category , Integer>{

}
