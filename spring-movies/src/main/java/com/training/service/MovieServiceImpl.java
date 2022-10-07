package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.Exception.IdNotFoundException;
import com.training.Exception.MovieNotFoundException;
import com.training.model.Movie;
import com.training.repository.IMovieRepository;
import com.training.repository.MovieRepositoryImpl;

@Service
public class MovieServiceImpl implements IMovieService {
	@Autowired
	IMovieRepository movieDao = new MovieRepositoryImpl();

	@Override
	public List<Movie> getAll() {

		return movieDao.findAll();
	}

	@Override
	public List<Movie> getByName(String name) {

		try {
			return movieDao.findByName(name);
		} catch (MovieNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Movie> getByGenre(String genre) {
		try {
			return movieDao.findByGenre(genre);
		} catch (MovieNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Movie> getByLanguage(String language) {
		try {
			return movieDao.findByLanguage(language);
		} catch (MovieNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Movie getById(int Id) {
		try {
			Movie movieById = movieDao.findById(Id);
			if (movieById != null)
				return movieById;
		} catch (IdNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

}
