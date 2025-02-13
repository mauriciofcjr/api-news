package com.mfchaves.api_news.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mfchaves.api_news.entity.Usuario;
import com.mfchaves.api_news.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

}
