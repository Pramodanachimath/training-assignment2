package com.training.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.training.Exception.IdNotFoundException;
import com.training.model.Movie;

@Component
public class MovieRepositoryImpl implements IMovieRepository {
	

	@Override
	public List<Movie> findAll() {
		return null;
		
	}

	@Override
	public List<Movie> findByName(String name) {
		return null;

		
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		return null;
	
	}

	@Override
	public List<Movie> findByLanguage(String language) {
		return null;
		
	}

	@Override
	public Movie findById(int id) throws IdNotFoundException {
		return null;

	}

	
}
