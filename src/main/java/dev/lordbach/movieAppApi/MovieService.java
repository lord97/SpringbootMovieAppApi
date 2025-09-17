package dev.lordbach.movieAppApi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // let the framwork know to initiate the class for us
    private MovieRepository movieRepository;
    public List<Movie> allmovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id){
        return movieRepository.findById(id);
    }
}
