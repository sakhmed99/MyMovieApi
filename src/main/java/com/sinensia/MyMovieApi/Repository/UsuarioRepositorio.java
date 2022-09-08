package com.sinensia.MyMovieApi.Repository;

import com.sinensia.MyMovieApi.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
     static Optional<Usuario> findByUsername(String username, String movieId) {
    	 
		return null;
	}




}
