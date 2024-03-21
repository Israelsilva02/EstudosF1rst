package br.com.ada.locadora.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locadora")


public class LocadoraController {

    @GetMapping
    public String getAll() {
        return "Get Projeto Locadora!!";
    }
    @PostMapping
    public String save() {
        return "Cria Projeto Locadora!!";
    }
    @PutMapping
    public String update() {
        return "Atualiza Projeto Locadora!!";
    }
    @DeleteMapping
    public String delete() {
        return "Deleta Projeto Locadora!!";
    }
}