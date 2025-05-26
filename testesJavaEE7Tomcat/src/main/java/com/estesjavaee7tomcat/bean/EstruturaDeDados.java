package com.estesjavaee7tomcat.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EstruturaDeDados {
    private BeanTeste beanSelecionado;
    private List<BeanTeste> lista;

    public EstruturaDeDados() {
        beanSelecionado = new BeanTeste();
        lista = new ArrayList<BeanTeste>();
        
        for (int i = 0; i < 10; i++) {
            BeanTeste b = new BeanTeste();
            b.setNome("TodaVida"+i);
            b.setEmail("TodaVida"+i+"@gmail.com");
            b.setTel("748932382"+i);
            
            lista.add(b);
        }
    
    }
    
    public void limparBean() {
        beanSelecionado = new BeanTeste();
    }
    
    public void salvar() {
        if(!lista.contains(beanSelecionado)) {
            lista.add(beanSelecionado);
            limparBean();
        }
    }
    
    public void excluir() {
        lista.remove(beanSelecionado);
        limparBean();
    }
    
    public BeanTeste getBeanSelecionado() {
        return beanSelecionado;
    }

    public void setBeanSelecionado(BeanTeste beanSelecionado) {
        this.beanSelecionado = beanSelecionado;
    }

    public List<BeanTeste> getLista() {
        return lista;
    }

    public void setLista(List<BeanTeste> lista) {
        this.lista = lista;
    }
    
    
    
}
