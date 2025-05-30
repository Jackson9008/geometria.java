package br.com.fecaf.model;

public class Triangulo {
    public double ladoB, ladoC;
    public double base;
    public double altura;
    public String nome;
    public double area;
    public double perimetro;


    public void exibirInformacoes (){
        System.out.println("/---------------------------/");
        System.out.println("O nome é: " + nome);
        System.out.println("O base é: " + base);
        System.out.println("O lado B é: " + ladoB);
        System.out.println("O lado C é: " + ladoC);
        System.out.println("A altura é: " + altura);
        System.out.println("/---------------------------/");
    }


    public boolean validarTriangulo() {
        if (base + ladoB >= ladoC && ladoC >= ladoB && ladoB + ladoC >= base) {
            System.out.println("/---------------------------/");
            System.out.println("O objeto " + nome + " é um triângulo é válido ...");
            System.out.println("/---------------------------/");
            return true;
        } else {
            System.out.println("/---------------------------/");
            System.out.println("O objeto " + nome + " não é um triângulo válido ...");
            System.out.println("/---------------------------/");
            return false;
        }

    }

    public void calcularArea (){
        area = (base * altura) / 2;
        System.out.println("/---------------------------/");
        System.out.println("A área do objeto " + nome + " é: " + area);
        System.out.println("/---------------------------/");
    }
    public void calcularPerimetro (){
        perimetro = base + ladoB + ladoC;
        System.out.println("/---------------------------/");
        System.out.println("O perimetro do objeto " + nome + " é: " + perimetro);
        System.out.println("/---------------------------/");
    }
}
