package it.uniroma3.siw.siwmovie0.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import it.uniroma3.siw.siwmovie0.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>{
	
	public List<Movie> findByYear(Integer year);
	public boolean existsByTitleAndYear(String title, Integer year);

}
