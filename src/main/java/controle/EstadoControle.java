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
@ManagedBean // Anotação para o JSF reconhecer a classe como um ManagedBean (ManagedBean é um bean gerenciado pelo JSF ele é responsável por controlar os dados da tela)
@SessionScoped // anotação para o JSF reconhecer a classe como um SessionScoped (SessionScoped é um escopo de sessão, ou seja, os dados ficam disponíveis enquanto a sessão estiver ativa)
public class EstadoControle { // classe para controlar os dados do estado

    private Estado estado = new Estado(); // Estancia um objeto do tipo Estado para ser usado na tela de cadastro
    private List<Estado> listaEstados = new ArrayList<>(); // salvar os dados do estado em uma array

    public void salvar() { // metodo para salvar os dados do estado
        listaEstados.add(estado); // adiciona os dados do estado na lista de estados
        estado = new Estado(); // limpa os dados do estado
    }

    public void remover(Estado est) { // metodo para remover os dados do estado
        listaEstados.remove(est); // remove os dados do estado da lista de estados
    }

    public Estado getEstado() { // metodo para retornar os dados do estado
        return estado; // retorna os dados do estado
    }

    public void setEstado(Estado estado) { // metodo para setar os dados do estado
        this.estado = estado; // seta os dados do estado
    }

    public List<Estado> getListaEstados() { // metodo para retornar a lista de estados
        return listaEstados; // retorna a lista de estados
    }

    public void setListaEstados(List<Estado> listaEstados) { // metodo para setar a lista de estados
        this.listaEstados = listaEstados; // seta a lista de estados
    }

}
