/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author fleme
 */
// ProxyAcessoLoja.java
public class ProxyAcessoLoja implements AcessoLoja {

    private Loja loja;
    private String usuario;
    private String senha;

    public ProxyAcessoLoja(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        // Aqui você pode inicializar a loja, se necessário
        this.loja = new Loja();
    }

    @Override
    public void registrarEntradaCliente(String nomeCliente) {
        if (usuario.equals("seguranca") && senha.equals("1234")) {
            loja.registrarEntradaCliente(nomeCliente);
        } else {
            System.out.println("Acesso negado: Credenciais inválidas.");
        }
    }

    @Override
    public void registrarSaidaCliente(String nomeCliente) {
        if (usuario.equals("seguranca") && senha.equals("1234")) {
            loja.registrarSaidaCliente(nomeCliente);
        } else {
            System.out.println("Acesso negado: Credenciais inválidas.");
        }
    }
}
