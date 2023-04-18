/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Jackson Zacarias
 */
public class Estado { // classe para controlar os dados do estado

    private String nome; // atributo para armazenar o nome do estado
    private String uf; // atributo para armazenar a sigla do estado

    public String getNome() { // metodo para retornar o nome do estado
        return nome; // retorna o nome do estado
    }

    public void setNome(String nome) { // metodo para setar o nome do estado
        this.nome = nome; // seta o nome do estado
    }

    public String getUf() { // metodo para retornar a sigla do estado
        return uf; // retorna a sigla do estado
    }

    public void setUf(String uf) { // metodo para setar a sigla do estado
        this.uf = uf; // seta a sigla do estado
    }

}

// Aqui é usado conceitos de orientação a objetos, como herança, encapsulamento, etc.
