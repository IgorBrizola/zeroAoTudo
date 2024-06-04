package br.com.praticandoSpring.SpringProject.repository;

import br.com.praticandoSpring.SpringProject.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
