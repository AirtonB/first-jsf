/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.leandro.first.jsf.beans;

import br.edu.ifrn.leandro.first.jsf.beans.dao.LivroDAO;
import br.edu.ifrn.leandro.first.jsf.beans.model.Livro;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author optimus
 */
@ManagedBean
public class LivroBean {
//    @Inject
//    private LivroDAO livroDAO;
    private Livro livro = new Livro();

    public void cadastrar() {
        //livroDAO.salvar(livro);
        livro = new Livro();
        FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Livro salvo com sucesso!"));
        System.out.println("Livro salvo com sucesso");
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

}
