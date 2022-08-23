package com.infy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.DTO.DirectorDTO;
import com.infy.DTO.MovieDTO;
import com.infy.Service.MovieService;

@SpringBootApplication
public class CapStoneApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(CapStoneApplication.class,
				args);

		MovieService service = (MovieService) context.getBean("movieservice");
		// Insert
		MovieDTO dto = new  MovieDTO("Happy", LocalDate.now(), LocalDateTime.now());
		List<DirectorDTO> directorList = Arrays.asList(
				new DirectorDTO("harsh", "kumar", "nashik", "hks@infosys.com", 9962703128L)
				);

		service.add(dto, directorList); 

		service.searchBasedOnTitle("Happy");
		System.out.println("Get all Directors from Movie Title");

		service.getDirectorListFromTitle("Happy");

		System.out.println("Get all Movies from Director Name");
		service.getMovieListFromDirectorName("harsh");

		System.out.println(service.displayAll().toString());
	}

}