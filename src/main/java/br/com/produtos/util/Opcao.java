package br.com.produtos.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Opcao {
    private String label;
    private Runnable action;

}
