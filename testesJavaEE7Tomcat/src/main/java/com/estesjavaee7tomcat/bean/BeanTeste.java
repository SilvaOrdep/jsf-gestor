package com.estesjavaee7tomcat.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BeanTeste {
    private String nome;
    private String email;
    private String tel;

    public BeanTeste(String nome, String email, String tel) {
        this.nome = nome;
        this.email = email;
        this.tel = tel;
    }

    public BeanTeste() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
}
