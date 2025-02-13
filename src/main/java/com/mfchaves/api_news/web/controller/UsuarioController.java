package com.mfchaves.api_news.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfchaves.api_news.entity.Usuario;
import com.mfchaves.api_news.service.UsuarioService;
import com.mfchaves.api_news.web.dto.UsuarioResponseDto;
import com.mfchaves.api_news.web.dto.mapper.UsuarioMapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Operation(summary = "Listar todos os usuários cadastrados", description = "Recurso para buscar todos os usuários", responses = {
            @ApiResponse(responseCode = "200", description = "Lista com todos os usuários cadastrados", content = @Content(mediaType = "application/jason", array = @ArraySchema(schema = @Schema(implementation = Usuario.class))))
    })
    @GetMapping
    public ResponseEntity<List<UsuarioResponseDto>> getAll() {
        List<UsuarioResponseDto> usuarios = UsuarioMapper.toListDto(usuarioService.getAll());
        return ResponseEntity.ok(usuarios);
    }

    
    

}
