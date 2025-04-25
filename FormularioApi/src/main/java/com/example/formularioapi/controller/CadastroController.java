package com.example.formularioapi.controller;

import com.example.formularioapi.model.CadastroRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cadastro")
@CrossOrigin(origins = "*")

public class CadastroController {

    @PostMapping
    public ResponseEntity<String> cadastrar(@RequestBody CadastroRequest request) {
        System.out.println("Recebido:");
        System.out.println("Nome: " + request.getNome());
        System.out.println("Email: " + request.getEmail());
        System.out.println("Telefone: " + request.getTelefone());
        return ResponseEntity.ok("Cadastro recebido com sucesso!");
    }
}

