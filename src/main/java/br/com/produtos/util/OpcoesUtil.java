package br.com.produtos.util;

public class OpcoesUtil {
    public static Opcao cadastro = new Opcao("Cadastrar novo produto", ProdutosUtil::cadastrarProduto);
    public static Opcao listar = new Opcao("Listar produtos", ProdutosUtil::listarProdutos);
}
