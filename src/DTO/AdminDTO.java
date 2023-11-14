/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author danil
 */
public class AdminDTO {
    int cod_admin;
    String nome_admin;
    String senha_admin;

    public int getCod_admin() {
        return cod_admin;
    }

    public void setCod_admin(int cod_admin) {
        this.cod_admin = cod_admin;
    }

    public String getNome_admin() {
        return nome_admin;
    }

    public void setNome_admin(String nome_admin) {
        this.nome_admin = nome_admin;
    }

    public String getSenha_admin() {
        return senha_admin;
    }

    public void setSenha_admin(String senha_admin) {
        this.senha_admin = senha_admin;
    }
    
    public AdminDTO(String nome_admin, String senha_admin){
        this.nome_admin  = nome_admin;
        this.senha_admin = senha_admin;
    }
}
