/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author 822166164
 * código, descrição, ODS, nome do responsável, telefone, data da criação e status
 */
public class ProjetoDTO {
    
    private int cod_projeto;
    private String nome_projeto;
    private String descricao;
    private String ods_projeto;
    private String nome_responsavel;
    private String telefone_responsavel;
    private String data_criacao;
    private String status_projeto;

    public ProjetoDTO(int cod_projeto, String nome_projeto, String descricao, String ods_projeto, String nome_responsavel, String telefone_responsavel, String data_criacao, String status_projeto) {
        this.cod_projeto = cod_projeto;
        this.nome_projeto = nome_projeto;
        this.descricao = descricao;
        this.ods_projeto = ods_projeto;
        this.nome_responsavel = nome_responsavel;
        this.telefone_responsavel = telefone_responsavel;
        this.data_criacao = data_criacao;
        this.status_projeto = status_projeto;
    }

    public ProjetoDTO(String nome_projeto, String descricao, String ods_projeto, String nome_responsavel, String telefone_responsavel, String data_criacao, String status_projeto) {
        this.nome_projeto = nome_projeto;
        this.descricao = descricao;
        this.ods_projeto = ods_projeto;
        this.nome_responsavel = nome_responsavel;
        this.telefone_responsavel = telefone_responsavel;
        this.data_criacao = data_criacao;
        this.status_projeto = status_projeto;
    }

   public ProjetoDTO(){
       
   }

 
    @Override
        public String toString() {
            return "id: " + this.cod_projeto + " nome: " + this.nome_projeto +
                    " ODS: " + this.ods_projeto;
    }
    
    public int getCod_projeto() {
        return cod_projeto;
    }

    public void setCod_projeto(int cod_projeto) {
        this.cod_projeto = cod_projeto;
    }
    
    public String getNome_projeto() {
        return nome_projeto;
    }
    
    public void setNome_projeto(String nome_projeto) {
        this.nome_projeto = nome_projeto;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOds_projeto() {
        return ods_projeto;
    }

    public void setOds_projeto(String ods_projeto) {
        this.ods_projeto = ods_projeto;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String getTelefone_responsavel() {
        return telefone_responsavel;
    }

    public void setTelefone_responsavel(String telefone_responsavel) {
        this.telefone_responsavel = telefone_responsavel;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }
    
    public String getStatus_projeto() {
        return status_projeto;
    }

    public void setStatus_projeto(String status_projeto) {
        this.status_projeto = status_projeto;
    }
}
