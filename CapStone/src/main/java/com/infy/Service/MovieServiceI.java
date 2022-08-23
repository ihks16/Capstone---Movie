package com.infy.Service;

import java.time.LocalDate;
import java.util.List;

import com.infy.DTO.DirectorDTO;
import com.infy.DTO.MovieDTO;
import com.infy.Entity.Movie;

public interface MovieServiceI {

	void add(MovieDTO dto, List<DirectorDTO> directorDTO);
	void searchBasedOnTitle(String title);
	void updateReleaseDate(LocalDate releaseDate, String movieTitle);
	void deleteBasedOnMovieTitle(String Title);
	List<Movie> displayAll();
	void getDirectorListFromTitle(String title);
	void getMovieListFromDirectorName(String name);
}