package com.sinensia.MyMovieApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.MyMovieApi.Entity.Usuario;

import java.util.Optional;

public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {
    Optional<Usuario> findByUsername(String username);




}
