/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.managebean;

import com.proyecto.dao.ClienteDao;
import com.proyecto.entity.Cliente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author pc
 */
@ManagedBean(name = "clienteBean")
@RequestScoped
public class ClienteBean {
    private Integer uid;
    Cliente cliente;
    private ClienteDao clienteDao = new ClienteDao();

    public ClienteBean() {
        this.uid = 1;
        cliente=clienteDao.Buscar(2);
        System.out.println("xxx");
         System.out.println(cliente.getDireccion());
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteDao getClienteDao() {
        return clienteDao;
    }

    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }
    
    

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    
    
    
}
