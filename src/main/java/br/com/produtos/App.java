package br.com.produtos;

import br.com.produtos.util.Opcao;

import java.util.ArrayList;
import java.util.Scanner;

import static br.com.produtos.util.OpcoesUtil.cadastro;
import static br.com.produtos.util.OpcoesUtil.listar;


public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Opcao> opcoes = new ArrayList<Opcao>();
        opcoes.add(cadastro);
        opcoes.add(listar);
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Escolha uma das opnções a seguir: ");
            for (int i = 1; i <= opcoes.size(); i++) {
                System.out.println(i + " - " + opcoes.get(i-1).getLabel());
            }
            System.out.println();
            System.out.println("Pressione qualquer outra tecla para encerrar");
            System.out.println();
            Integer op = teclado.nextInt();
            if (op < 1 || op > opcoes.size()) break;
            opcoes.get(op -1).getAction().run();
        }

        teclado.close();


    }
}
