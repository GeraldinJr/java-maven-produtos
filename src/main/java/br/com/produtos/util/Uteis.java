package br.com.produtos.util;

import java.text.NumberFormat;
import java.util.Locale;

public class Uteis {

    public static Locale localeBR = new Locale( "pt", "BR" );
    public static NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);


}
