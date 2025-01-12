package com.angelodev.literalura.principal;

public class Principal {

    private String menuPrincipal = """
            Elije una opción de las siguientes: 
            ######### REGISTROS ##########
            1 - Registrar libro
            """;

    public void muestraMenu(){
        System.out.println(menuPrincipal);
    }
}
