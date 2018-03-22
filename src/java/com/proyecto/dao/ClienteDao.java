/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entity.Cliente;
import com.proyecto.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author pc
 */
public class ClienteDao {

    public ClienteDao() {
    }
    
    public Cliente  Buscar(Integer id) {
          HibernateUtil.buildSessionFactory();
 Cliente cliente;
         //try {
             HibernateUtil.openSessionAndBindToThread();

             Session session = HibernateUtil.getSessionFactory().getCurrentSession();
             //id=1;
              cliente = (Cliente) session.get(Cliente.class,id);
            
         //} finally {
             HibernateUtil.closeSessionAndUnbindFromThread();
         //}

         HibernateUtil.closeSessionFactory();
         
         return cliente;
    }
}
