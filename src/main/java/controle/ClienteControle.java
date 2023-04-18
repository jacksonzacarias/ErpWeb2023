
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@autor: Jackson Zacarias

@ManagedBean // Anotação para o JSF reconhecer a classe como um ManagedBean (ManagedBean é um bean gerenciado pelo JSF ele é responsável por controlar os dados da tela)
@SessionScoped // anotação para o JSF reconhecer a classe como um SessionScoped (SessionScoped é um escopo de sessão, ou seja, os dados ficam disponíveis enquanto a sessão estiver ativa)
public class ClienteControle { // classe para controlar os dados do cliente

    private Cliente cliente = new Cliente(); // Estancia um objeto do tipo Cliente para ser usado na tela de cadastro
    private List<Cliente> listaCliente = new ArrayList<>(); // salvar os dados do cliente em uma array

    public void salvar() {  // metodo para salvar os dados do cliente
        listaCliente.add(cliente);
        cliente = new Cliente();
    }

    public void remover(Cliente est) {  // metodo para remover os dados do cliente
        listaCliente.remove(est);
    }

    public Cliente getCliente() { // metodo para retornar os dados do cliente
        return cliente;
    }

    public void setCliente(Cliente cliente) { // metodo para setar os dados do cliente
        this.cliente = cliente;
    }

    public List<Cliente> getListaCliente() { // metodo para retornar a lista de clientes
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) { // metodo para setar a lista de clientes
        this.listaCliente = listaCliente; 
    }

}
