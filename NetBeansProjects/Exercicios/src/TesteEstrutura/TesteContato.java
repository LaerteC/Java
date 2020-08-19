/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteEstrutura;

import EstruturaDados.VetorObjetos;
import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class TesteContato {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        VetorObjetos<Contato> lista = new VetorObjetos<Contato>(20);

         criarContatosDinamicamente(4, lista);
         
        int opcao = 1;

        while (opcao != 0) {

            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;

                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;

                case 3:
                    obterContatoPosicao(scan, lista);
                    break;

                case 4:
                    obterContato(scan, lista);
                    break;

                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;

                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;

                case 7:
                    excluirContato(scan, lista);
                    break;

                case 8:
                    excluirPosicao(scan, lista);
                    break;
                case 9:
                    imprimiTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimir(lista);
                    break;
                default:
                    break;
                   

            }

        }

        System.out.println(" Usuário Digitou Zero , Termina o Programa");

    }
    
    private static void imprimir(VetorObjetos<Contato> lista){
        System.out.println(" Imprimir o Vetor / Lista\n" );
        System.out.println(lista.toString());
    }

    
    private static void limparVetor(VetorObjetos<Contato> lista){
        System.out.println(" Limpar o Vetor");
        lista.limpar();
    }
    private static void imprimiTamanhoVetor(VetorObjetos<Contato> lista) {

        System.out.println(" Tamando vetor / Lista :");

        System.out.println(lista.tamanhoVetor());

    }

    private static void adicionarContatoFinal(Scanner scan, VetorObjetos<Contato> lista) {

        System.out.println(" Criando  um Contato, Entre com as Informações");
        String nome = lerInformacao("Entre com o nome :", scan);
        String telefone = lerInformacao("Entre com o telefone :", scan);
        String email = lerInformacao("Entre com o Email:", scan);

        Contato contato = new Contato(nome, telefone, email);
        lista.adicionar(contato);

        System.out.println(" Contato Adicionado com Sucesso");
        System.out.println(contato);

    }

    private static void obterContatoPosicao(Scanner scan, VetorObjetos<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição", scan);

        try {

            Contato contato = lista.buscar(pos);

            System.out.println(" Contato Existe");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println(" Posição Inválida");
        }

    }

    private static void excluirPosicao(Scanner scan, VetorObjetos<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            System.out.println(lista.buscar(pos));

            lista.remover(pos);

            System.out.println(" Contato Excluido");
        } catch (Exception e) {

            System.out.println(" Posição Inválida");
        }
    }

    private static void excluirContato(Scanner scan, VetorObjetos<Contato> lista) {
        int pos = lerInformacaoInt(" Entre com a posição a ser removida", scan);

        try {
            Contato contato = lista.buscar(pos);
            lista.remove(contato);

            System.out.println(" Contato Excluido");
        } catch (Exception e) {

            System.out.println(" Posição Inválida");
        }

    }

    private static void pesquisarContatoExiste(Scanner scan, VetorObjetos<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser Pesquisada", scan);

        try {
            Contato contato = lista.buscar(pos);

            boolean existe = lista.conter(contato);

            if (existe) {
                System.out.println("Contato Existe");
                System.out.println(contato);

            } else {
                System.out.println(" Contato não Existe");
            }
        } catch (Exception e) {
            System.out.println(" Posição Inválida");

        }

    }

    private static void obterContato(Scanner scan, VetorObjetos<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.buscar(pos);

            System.out.println(" Contato existe");
            System.out.println(contato);

            System.out.println(" Fazendo pesquisa do contato encontrado");
            pos = lista.buscar(contato);

            System.out.println(" Contato encontrado na posição :" + pos);
        } catch (Exception e) {

            System.out.println("Posição Inválida");

        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, VetorObjetos<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser Pesquisada", scan);

        try {
            Contato contato = lista.buscar(pos);

            System.out.println(" Contato Existe");
            System.out.println(contato);

            System.out.println(" Fazendo a pesquisa do último índice do contato");
            pos = lista.ultimaPosicao(contato);

            System.out.println(" Contato encontrado na Posição " + pos);

        } catch (Exception e) {

        }

    }

    private static void adicionarContatoPosicao(Scanner scan, VetorObjetos<Contato> lista) {

        System.out.println(" Criando  um Contato, Entre com as Informações");
        String nome = lerInformacao("Entre com o nome :", scan);
        String telefone = lerInformacao("Entre com o telefone :", scan);
        String email = lerInformacao("Entre com o Email:", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt(" Entre com a posição para adicionar o Contato", scan);

        try {
            lista.adicionar(pos, contato);

            System.out.println(" Contato Adicionado com Sucesso");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println(" Não Adicionado");
        }

    }

    private static int lerInformacaoInt(String msg, Scanner scan) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {

            try {
                System.out.println(msg);
                String entrada = scan.nextLine();
                num = Integer.parseInt(entrada);

                entradaValida = true;

            } catch (Exception e) {
                System.out.println(" Entrada Inválida Digite novamente");
            }
        }
        return num;
    }

    private static String lerInformacao(String msg, Scanner scan) {

        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;

    }

    private static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {
            System.out.println(" Digite a opção desejada :");
            System.out.println(" 1: Adiciona contato no final do Vetor");
            System.out.println(" 2: Adiciona contato em uma posição Especifica");
            System.out.println(" 3: Consulta Contato de uma posição específica");
            System.out.println(" 4: Consulta Contato");
            System.out.println(" 5: Consulta ultimo item do Contato");
            System.out.println(" 6: Verifica se contato existe");
            System.out.println(" 7: Remove por Posição");
            System.out.println(" 8: Excluir Contato ");
            System.out.println(" 9: Verificar tamanho do Vetor:");
            System.out.println("10: Excuir todos os Contatos do Vetor");
            System.out.println("11: Imprimir o Vetor");
            System.out.println(" 0: Sair \n\n");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;

                } else {
                    throw new Exception();
                }

            } catch (Exception e) {

                System.out.println(" Entrada Inválida , Digite Novamente \n\n");

            }
        }
        return opcao;

    }

    private static void criarContatosDinamicamente(int quantidade, VetorObjetos<Contato> lista) {

        for (int i = 1; i <= quantidade; i++) {

            Contato contato = new Contato();
            contato.setNome("Contato" + i);
            contato.setTelefone("11111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adicionar(contato);

        }

    }
}
