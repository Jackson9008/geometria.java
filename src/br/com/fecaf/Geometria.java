package br.com.fecaf;


import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;

public class Geometria {
    public static void main(String[] args) {

        // Instanciar Objeto Retângulo
        Retangulo retangulo = new Retangulo();

        retangulo.nome = "retângulo-1";
        retangulo.lado1 = 10;
        retangulo.lado2 = 5;

        retangulo.exibirInformacoes();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        //Instanciando Retângulo 2
        Retangulo retangulo2 = new Retangulo();

        retangulo2.nome = "retângulo-2";
        retangulo2.lado1 = 8;
        retangulo2.lado2 = 8;

        retangulo2.exibirInformacoes();
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();

        // Validar se é um Quadrado
        retangulo.validarRetanguloEspecial();
        retangulo2.validarRetanguloEspecial();

        // Instanciando Circulo
        Circulo circulo = new Circulo();
        circulo.nome = "Circulo-1";
        circulo.raio = 10;

        circulo.exibirInformacoes();
        circulo.calcularArea();
        circulo.calcularPerimetro();

        // Instaciando Circulo 2
        Circulo circulo2 = new Circulo();
        circulo2.nome = "Circulo-2";
        circulo2.raio = 15;

        circulo2.exibirInformacoes();
        circulo2.calcularArea();
        circulo2.calcularPerimetro();
    }

}
