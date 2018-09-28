/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.leandro.first.jsf.beans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author optimus
 */
@ManagedBean
public class ClienteBean {
    
    private String nome = "Leandro";
    private String email;
    private String senha;
    
    

    public void efetuarLogin(){
        System.out.println("Logado com sucesso!");
    }
    public void enviar(){
        System.out.println("Enviando...");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
}
