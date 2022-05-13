package br.com.produtos.util;

import br.com.produtos.models.Produto;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static br.com.produtos.util.Uteis.dinheiroBR;

public class ProdutosUtil {

    public static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public static void listarProdutos() {
        AtomicInteger i = new AtomicInteger(1);
        AtomicInteger total = new AtomicInteger(0);
        produtos.forEach((p) -> {
            System.out.println(i + " - " + "Nome: " + p.getNome() + ", Estoque: " + p.getEstoque() + ", Preço: " + dinheiroBR.format(p.getPreco()/100));
            i.set(i.get() + 1);
            total.set(total.get() + (p.getPreco() * p.getEstoque()));
        });
        System.out.println();

        System.out.println("O valor total em produtos é: " + dinheiroBR.format(total.get()/100));

    }

    public static void cadastrarProduto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("*****Cadastro de novo produto*****");
        System.out.println();
        System.out.println("Informe o nome do produto:");
        String nome = teclado.nextLine();
        System.out.println("Informe o estoque do produto:");
        Integer estoque = teclado.nextInt();
        System.out.println("Informe o preço do produto em centavos:");
        Integer preco = teclado.nextInt();
        Produto p = new Produto(nome, preco, estoque);
        produtos.add(p);

    }
}
