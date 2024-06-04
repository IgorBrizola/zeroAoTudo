package br.com.praticandoSpring.SpringProject.DTO;

import br.com.praticandoSpring.SpringProject.entity.UsuarioEntity;
import org.springframework.beans.BeanUtils;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String login;
    private String email;
    private String senha;

    public UsuarioDTO(UsuarioEntity usuario){
        BeanUtils.copyProperties(usuario, this);
    }

    public UsuarioDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
