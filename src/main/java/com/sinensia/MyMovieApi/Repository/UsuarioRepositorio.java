package com.sinensia.MyMovieApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.MyMovieApi.Entity.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {



}
