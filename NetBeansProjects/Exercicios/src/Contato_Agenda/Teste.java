/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contato_Agenda;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laerte
 */
public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {

            opcao = obterOpcaoMenu(scan);


            if (opcao == 1) { // Consultar Contato
                consultar(scan, agenda);

            } else if (opcao == 2) { // Adicionar Contato

                adicionar(scan, agenda);

            }

        }
    }

    public static void adicionar(Scanner scan, Agenda agenda) {

        try {
            System.out.println(" Criando um contato, entre com as informações");
            String nome = lerInformacao(scan, "Entre com o nome do Contato");
            String telefone = lerInformacao(scan, " Entre com telefone do Contato");
            String email = lerInformacao(scan, " Entre com o Email do Contato");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println(" Contato a ser Criado:");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException ex) {

            System.out.println(ex.getMessage());

            System.out.println("Contatos da Agenda ");
            System.out.println(agenda);

        }

    }

    public static void consultar(Scanner scan, Agenda agenda) {
        String nomeContato = lerInformacao(scan, " Entre com o nome do Contato");

        try {
            if (agenda.consultaContato(nomeContato) >= 0) {
                System.out.println(" O contato Existe");
            }
        } catch (ContatoNaoExisteException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static String lerInformacao(Scanner scan, String msg) {

        System.out.println(msg);

        String entrada = scan.nextLine();
        return entrada;

    }

    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println(" Digite a opção desejada :");
            System.out.println(" 1: Consultar Contato");
            System.out.println(" 2: Adcionar Contato");
            System.out.println(" 3: Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 | opcao == 2 | opcao == 3) {
                    entradaValida = true;

                } else {
                    throw new Exception("Entrada Invalida");

                }
            } catch (Exception e) {
                System.out.println(" Entrada Inválida , Digite Novamente \n");
            }

        }
        return opcao;
    }
}
