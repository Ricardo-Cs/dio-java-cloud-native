package com.ricardo.exemplo_api_web.controller;

import com.ricardo.exemplo_api_web.model.Usuario;
import com.ricardo.exemplo_api_web.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping("")
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        repository.remove(id);
    }

    @PostMapping("/usuarios")
    public void insertUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
