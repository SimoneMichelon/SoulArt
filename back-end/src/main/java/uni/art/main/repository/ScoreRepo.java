package uni.art.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uni.art.main.model.Score;

@Repository
public interface ScoreRepo extends JpaRepository<Score, Integer>{

}
