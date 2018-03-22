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
public class MainClass {
  public static void main(String[] args) {
       HibernateUtil.buildSessionFactory();
 
         try {
             HibernateUtil.openSessionAndBindToThread();

             Session session = HibernateUtil.getSessionFactory().getCurrentSession();
             Cliente profesor = (Cliente) session.get(Cliente.class, 1);
             System.out.println(profesor.getDireccion());
         } finally {
             HibernateUtil.closeSessionAndUnbindFromThread();
         }

         HibernateUtil.closeSessionFactory();
  }
}
