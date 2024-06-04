package br.com.praticandoSpring.SpringProject.controller;

import br.com.praticandoSpring.SpringProject.DTO.UsuarioDTO;
import br.com.praticandoSpring.SpringProject.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> listarTodos() {
        return usuarioService.getAll();
    }

    @PostMapping
    public void inserir(@RequestBody UsuarioDTO usuario){
        usuarioService.create(usuario);
    }

    @PutMapping
    public UsuarioDTO alterar(@RequestBody UsuarioDTO usuario){
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        usuarioService.delete(id);
        return ResponseEntity.ok().build();
    }

}
