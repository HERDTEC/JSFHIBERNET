package com.proyecto.entity;
// Generated 22-mar-2018 0:14:25 by Hibernate Tools 4.3.1



/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String razonSocial;
     private String rfc;
     private String direccion;
     private String email;

    public Cliente() {
    }

    public Cliente(String razonSocial, String rfc, String direccion, String email) {
       this.razonSocial = razonSocial;
       this.rfc = rfc;
       this.direccion = direccion;
       this.email = email;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


