/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author 822166164
 */
public class UsuarioDTO {
    
    private int cod_usuario;
    private String nome_usuario;
    private String senha_usuario;
    private String email_usuario;
    private String telefone_usuario;

    public UsuarioDTO(String nome_usuario, String senha_usuario, String email_usuario, String telefone_usuario) {
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
        this.email_usuario = email_usuario;
        this.telefone_usuario = telefone_usuario;
    }

    
    
    public UsuarioDTO(String email_usuario, String senha_usuario) {
        this.senha_usuario = senha_usuario;
        this.email_usuario = email_usuario;
    }

    
    public UsuarioDTO(int cod_usuario, String nome_usuario, String email_usuario, 
            String telefone_usuario){
        this.cod_usuario = cod_usuario;
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.telefone_usuario = telefone_usuario;
    }

    public UsuarioDTO() {
        
    }
    
    
    @Override
    public String toString() {
        return "id: " + this.cod_usuario + " nome: " + this.nome_usuario +
                " email: " + this.email_usuario + " telefone: " + this.telefone_usuario;
    }
    
    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }
    
    public String getTelefone_usuario() {
        return telefone_usuario;
    }

    public void setTelefone_usuario(String telefone_usuario) {
        this.telefone_usuario = telefone_usuario;
    }

}
