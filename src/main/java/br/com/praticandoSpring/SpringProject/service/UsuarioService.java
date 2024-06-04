package br.com.praticandoSpring.SpringProject.service;

import br.com.praticandoSpring.SpringProject.DTO.UsuarioDTO;
import br.com.praticandoSpring.SpringProject.entity.UsuarioEntity;
import br.com.praticandoSpring.SpringProject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDTO> getAll(){
        List<UsuarioEntity> usuarios = usuarioRepository.findAll();
    return usuarios.stream().map(UsuarioDTO::new).toList();
    }

    public void create(UsuarioDTO usuario){
        UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
        usuarioRepository.save(usuarioEntity);
    }

    public UsuarioDTO update(UsuarioDTO usuario){
        UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
        return new UsuarioDTO(usuarioRepository.save(usuarioEntity));
    }

    public void delete(Long id){
        UsuarioEntity usuario = usuarioRepository.findById(id).get();
        usuarioRepository.delete(usuario);
    }

    public UsuarioDTO buscarPorId(Long id){
        return new UsuarioDTO(usuarioRepository.findById(id).get());
    }

}
