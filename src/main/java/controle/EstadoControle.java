/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import entidades.Estado;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jackson Zacarias
 */
@ManagedBean
@SessionScoped
public class EstadoControle {

    private Estado estado = new Estado();
    private List<Estado> listaEstados = new ArrayList<>();

    public void salvar() {
        listaEstados.add(estado);
        estado = new Estado();
    }

    public void remover(Estado est) {
        listaEstados.remove(est);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

}
