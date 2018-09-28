/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.leandro.first.jsf.beans;

import br.edu.ifrn.leandro.first.jsf.beans.dao.UsuarioDAO;
import br.edu.ifrn.leandro.first.jsf.beans.model.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author optimus
 */
@ManagedBean
@ViewScoped
public class LoginBean {

    private Usuario usuario = new Usuario();

    public String efetuaLogin() {
        System.out.println("Logando usuário: " + this.usuario.getEmail());
        FacesContext context = FacesContext.getCurrentInstance();
//        boolean existe = new UsuarioDAO.existe(this.usuario);
        boolean existe = true;
        if(existe){
            context.getExternalContext().getSessionMap().put("usuarioLogado", this.usuario);
            return "livro?faces-redirect=true";
        }
        
        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(null, new FacesMessage("Usuário não encontrado"));
        
        return "login?faces-redirect=true";
                
    }
    
    public String deslogar(){
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().remove("usuarioLogado");
        return "login?faces-redirect=true";
    }
}
