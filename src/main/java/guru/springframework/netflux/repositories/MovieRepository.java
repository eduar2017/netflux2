package guru.springframework.netflux.repositories;

import guru.springframework.netflux.Movie.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
