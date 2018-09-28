/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.leandro.first.jsf.persistencia;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author optimus
 */
public class FabricaEntityManager {

    private static EntityManagerFactory emf;

    //
    @Produces
    public static EntityManager criarEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("up");
        }
        return emf.createEntityManager();
    }
    //Fechar o entitymanager
    public static void fecharEntityManager(@Disposes EntityManager em) {
        if (em.isOpen()) {
            em.close();
        }
    }

}
