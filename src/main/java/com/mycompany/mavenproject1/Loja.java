/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author fleme
 */
// Loja.java
import java.util.ArrayList;
import java.util.List;

public class Loja implements AcessoLoja {

    private List<String> clientesDentro;

    public Loja() {
        this.clientesDentro = new ArrayList<>();
    }

    @Override
    public void registrarEntradaCliente(String nomeCliente) {
        System.out.println(nomeCliente + " entrou na loja.");
        clientesDentro.add(nomeCliente);
    }

    @Override
    public void registrarSaidaCliente(String nomeCliente) {
        if (clientesDentro.contains(nomeCliente)) {
            System.out.println(nomeCliente + " saiu da loja.");
            clientesDentro.remove(nomeCliente);
        } else {
            System.out.println(nomeCliente + " não estava dentro da loja.");
        }
    }
}
