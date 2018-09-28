/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.leandro.first.jsf.beans.dao;

import br.edu.ifrn.leandro.first.jsf.beans.model.Livro;
import br.edu.ifrn.leandro.first.jsf.persistencia.FabricaEntityManager;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author optimus
 */
public class LivroDAO {
    //@Inject
    private EntityManager entityManager = FabricaEntityManager.criarEntityManager();
    
    public void salvar(Livro livro){
        entityManager.getTransaction().begin();
        entityManager.persist(livro);
        entityManager.getTransaction().commit();
    }
}
