
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

@ManagedBean 
@SessionScoped
public class ClienteControle {

    private Cliente cliente = new Cliente(); // estanciando novo cliente
    private List<Cliente> listaCliente = new ArrayList<>(); // salva

    public void salvar() {
        listaCliente.add(cliente);
        cliente = new Cliente();
    }

    public void remover(Cliente est) {
        listaCliente.remove(est);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

}
