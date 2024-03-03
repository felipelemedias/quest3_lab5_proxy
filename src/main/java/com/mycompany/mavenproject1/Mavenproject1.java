/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author fleme
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        // Criando um proxy para controlar o acesso à loja
        AcessoLoja proxy = new ProxyAcessoLoja("seguranca", "1234");

        // Registrando a entrada de clientes com credenciais corretas
        proxy.registrarEntradaCliente("Cliente A");
        proxy.registrarEntradaCliente("Cliente B");

        // Registrando a saída de um cliente com credenciais corretas
        proxy.registrarSaidaCliente("Cliente B");

        // Tentando registrar a entrada de clientes com credenciais incorretas
        AcessoLoja proxyInvalido = new ProxyAcessoLoja("usuario", "senha_incorreta");
        proxyInvalido.registrarEntradaCliente("Cliente C");

        // Tentando registrar a saída de um cliente com credenciais incorretas
        proxyInvalido.registrarSaidaCliente("Cliente A");
    }
}
