package com.infy.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.Entity.*;

@Repository("DirectorRepository")
public interface DirectorRepository extends JpaRepository<Director,Integer> {
	public Optional<Director> findByFirstName(String name);
}
