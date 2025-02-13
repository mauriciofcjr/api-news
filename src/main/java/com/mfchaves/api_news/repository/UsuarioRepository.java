package com.mfchaves.api_news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfchaves.api_news.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
